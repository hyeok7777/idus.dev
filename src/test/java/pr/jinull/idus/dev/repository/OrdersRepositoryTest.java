package pr.jinull.idus.dev.repository;

import pr.jinull.idus.dev.domain.Orders;
import pr.jinull.idus.dev.dto.OrdersResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class OrdersRepositoryTest {

    @Autowired
    OrdersRepository ordersRepository;

    @Test
    void selectAll() {
        List<OrdersResponse> ordersList = ordersRepository.findAllOrdersBy();

        assertThat(ordersList.size()).isEqualTo(5);


        ordersList.stream().forEach(System.out::println);
    }

    @Test
    void selectAllByUserNo() {
        List<OrdersResponse> ordersList = ordersRepository.findOrderByUserId(1L);

        assertThat(ordersList.size()).isEqualTo(3);
        ordersList.stream().forEach(System.out::println);
    }
}