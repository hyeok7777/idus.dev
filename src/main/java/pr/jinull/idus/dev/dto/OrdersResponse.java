package pr.jinull.idus.dev.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pr.jinull.idus.dev.domain.Users;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class OrdersResponse {

    private Long id;

    private String orderNo;

    private String productName;

    private LocalDateTime orderDate;

    private Users user;
}
