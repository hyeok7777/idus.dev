package pr.jinull.idus.dev.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@ToString
public class Orders {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_no", nullable = false)
    private String orderNo;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_order_to_user"))
    private Users user;

    protected Orders() {

    }

}
