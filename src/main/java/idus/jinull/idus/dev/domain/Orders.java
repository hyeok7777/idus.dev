package idus.jinull.idus.dev.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@ToString
public class Orders {

    @Id
    @Column(name = "no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(name = "user_no", nullable = false)
    private Long user_no;

    @Column(name = "order_no", nullable = false)
    private String order_no;

    @Column(name = "product_name", nullable = false)
    private String product_name;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime order_date;

    protected Orders() {

    }

}
