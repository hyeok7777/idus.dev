package pr.jinull.idus.dev.repository;


import pr.jinull.idus.dev.domain.Orders;
import pr.jinull.idus.dev.dto.OrdersResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

    List<OrdersResponse> findAllOrdersBy();

    List<OrdersResponse> findOrderByUserId(@Param("user_id") Long user_id);
}
