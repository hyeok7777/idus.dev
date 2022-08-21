package pr.jinull.idus.dev.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pr.jinull.idus.dev.Service.UsersService;
import pr.jinull.idus.dev.dto.UsersRequest;
import pr.jinull.idus.dev.dto.UsersResponse;

import java.util.List;

@Controller
@Slf4j
public class UsersController {

    UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping("/home")
    public String home() {
        log.info("home controller");
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

}
