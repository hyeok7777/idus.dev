package idus.jinull.idus.dev.repository;


import idus.jinull.idus.dev.domain.Orders;
import idus.jinull.idus.dev.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
