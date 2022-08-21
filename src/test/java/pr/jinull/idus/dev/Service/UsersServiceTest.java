package pr.jinull.idus.dev.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import pr.jinull.idus.dev.Exception.CannotJoinException;
import pr.jinull.idus.dev.dto.UsersRequest;
import pr.jinull.idus.dev.repository.UsersRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UsersServiceTest {

    @Autowired
    UsersService usersService;

    @Autowired
    UsersRepository usersRepository;

    @Test
    void joinFailTest() throws CannotJoinException {
        UsersRequest usersRequest = new UsersRequest("오진혁", "지널", "0000!", "010-8661-2704", "hyeok7777@gmail.com", "");

        assertThatThrownBy(() -> usersService.join(usersRequest)).isInstanceOf(CannotJoinException.class);
    }

    @Test
    void joinTest() throws CannotJoinException {
        UsersRequest usersRequest = new UsersRequest("오진혁", "지널", "0000!", "010-8661-2704", "hyeok7778@gmail.com", "");
        assertThat(usersService.join(usersRequest).getEmail()).isEqualTo(usersRequest.getEmail());
    }
}