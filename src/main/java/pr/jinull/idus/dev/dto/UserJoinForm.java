package pr.jinull.idus.dev.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class UserJoinForm {
    private Long id;

    @NotEmpty(message = "name cannot be null")
    private String name;

    @NotEmpty(message = "nickname cannot be null")
    private String nickname;

    @NotEmpty(message = "password cannot be null")
    private String password;

    @NotEmpty(message = "nickname cannot be null")
    private String telNum;

    @NotEmpty(message = "email cannot be null")
    private String email;

    private String gender;


    public UserJoinForm() {
    }

    public UsersRequest of() {
        return new UsersRequest(name, nickname, password, telNum, email, gender);
    }
}
