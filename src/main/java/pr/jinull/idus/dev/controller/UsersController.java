package pr.jinull.idus.dev.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pr.jinull.idus.dev.dto.UserJoinForm;
import pr.jinull.idus.dev.exception.CannotJoinException;
import pr.jinull.idus.dev.service.UsersService;
import pr.jinull.idus.dev.dto.UsersResponse;

import javax.validation.Valid;
import java.util.List;

@Controller
@Slf4j
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping("/")
    public String home() {

        return "home";
    }

    @RequestMapping("/users")
    public ResponseEntity<List<UsersResponse>> showUsers() {
        return ResponseEntity.ok().body(usersService.findUsersBy());
    }

    @RequestMapping("/users/{userdata}")
    public ResponseEntity<List<UsersResponse>> showUsersByData(@PathVariable String userdata) {
        if(userdata.isEmpty()) {
            return null;
        }

        if(userdata.contains("@")) {
            return ResponseEntity.ok().body(usersService.findUsersByEmail(userdata));
        }

        if(!userdata.contains("@")) {
            return ResponseEntity.ok().body(usersService.findUsersByName(userdata));
        }
        return null;
    }

    @GetMapping("/users/new")
    public String createForm(Model model) {
        model.addAttribute("memberForm", new UserJoinForm());
        return "createUserResponse";
    }

    @PostMapping("/users/new")
    public String create(@Valid UserJoinForm form, BindingResult result) throws CannotJoinException {

        if(result.hasErrors()) {
            return "createUserResponse";
        }
        System.out.println(form.of().toString());
        usersService.join(form.of());

        return null;
     }



}
