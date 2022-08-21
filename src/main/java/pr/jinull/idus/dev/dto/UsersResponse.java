package pr.jinull.idus.dev.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@Setter
public class UsersResponse {
    private Long no;

    private String name;

    private String nickname;

    private String password;

    private String telNum;

    private String email;

    private String gender;


}
