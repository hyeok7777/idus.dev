package idus.jinull.idus.dev.repository;

import idus.jinull.idus.dev.domain.Orders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class OrdersRepositoryTest {

    @Autowired
    OrdersRepository ordersRepository;

    @Test
    void selectAll() {
        List<Orders> ordersList = ordersRepository.findAll();

        ordersList.stream().forEach(System.out::println);

    }

    @Test
    void selectAllByUser() {
        List<Orders> ordersList = ordersRepository.findAll();

        ordersList.stream().forEach(System.out::println);

    }
}