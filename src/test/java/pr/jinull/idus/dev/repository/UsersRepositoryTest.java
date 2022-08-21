package pr.jinull.idus.dev.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import pr.jinull.idus.dev.dto.UsersResponse;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
class UsersRepositoryTest {

    @Autowired
    UsersRepository usersRepository;

    @Test
    void selectAllByUsersByEmail() {
        Optional<UsersResponse> users = usersRepository.findUsersByEmail("hyeok7777@gmail.com");

        assertThat(users.get().getName()).isEqualTo("오진혁");

        System.out.println(users.get().toString());

    }

    @Test
    void selectAllUsersByName() {
        List<UsersResponse> users = usersRepository.findUsersByName("오진혁");
        assertThat(users.get(0).getName()).isEqualTo("오진혁");

        users.stream().forEach(System.out::println);
    }
}