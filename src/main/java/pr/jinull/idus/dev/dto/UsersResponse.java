package pr.jinull.idus.dev.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@AllArgsConstructor
@ToString
@Setter
public class UsersResponse {
    private Long id;

    private String name;

    private String nickname;

    private String telNum;

    private String email;

    private String gender;

}
