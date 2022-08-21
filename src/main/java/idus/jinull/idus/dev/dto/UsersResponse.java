package idus.jinull.idus.dev.dto;

import idus.jinull.idus.dev.domain.Orders;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

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
