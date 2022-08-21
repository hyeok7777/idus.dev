package idus.jinull.idus.dev.repository;

import idus.jinull.idus.dev.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@SpringBootTest
class UsersRepositoryTest {

    @Autowired
    UsersRepository usersRepository;

    @Test
    void selectAll() {
        List<Users> usersList = usersRepository.findAll();

        usersList.stream().forEach(System.out::println);
    }

    @Test
    void selectAllByUser() {
        Optional<Users> users = usersRepository.findByUserName("오진혁");

        System.out.println(users.toString());
    }
}