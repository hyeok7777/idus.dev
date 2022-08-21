package idus.jinull.idus.dev.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(name = "order_no", nullable = false)
    private String order_no;

    @Column(name = "product_name", nullable = false)
    private String product_name;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime order_date;



}
