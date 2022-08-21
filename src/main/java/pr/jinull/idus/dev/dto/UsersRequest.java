package pr.jinull.idus.dev.dto;


import lombok.Getter;
import lombok.Setter;
import pr.jinull.idus.dev.domain.Users;

@Getter
@Setter
public class UsersRequest {

    private Long id;
    private String name;
    private String nickname;
    private String password;
    private String telNum;
    private String email;
    private String gender;

    public UsersRequest(String name, String nickname, String password, String telNum, String email, String gender) {
        if (name.isEmpty() || nickname.isEmpty() || password.isEmpty() || telNum.isEmpty() || email.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.nickname = nickname;
        this.password = password;
        this.telNum = telNum;
        this.email = email;
        this.gender = gender;
    }

    public Users toEntity() {
        return new Users(name, nickname, password, telNum, email, gender);
    }
}
