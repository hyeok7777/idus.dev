package idus.jinull.idus.dev.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class OrdersResponse {

    private Long no;

    private Long userNo;

    private String orderNo;

    private String productName;

    private LocalDateTime orderDate;
}
