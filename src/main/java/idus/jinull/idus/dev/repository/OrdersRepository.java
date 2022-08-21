package idus.jinull.idus.dev.repository;


import idus.jinull.idus.dev.domain.Orders;
import idus.jinull.idus.dev.domain.Users;
import idus.jinull.idus.dev.dto.OrdersResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

    List<Orders> findAll();

    List<OrdersResponse> findOrdersByUserNo(@Param("userNo") Long user_no);
}
