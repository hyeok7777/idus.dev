package pr.jinull.idus.dev.dto;

import pr.jinull.idus.dev.domain.Orders;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class UsersJoinResponse {
    private Long no;

    private String name;

    private String nickname;

    private String password;

    private String telNum;

    private String email;

    private String gender;

    private List<Orders> ordersList;
}
