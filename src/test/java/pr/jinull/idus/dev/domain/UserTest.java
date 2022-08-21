package pr.jinull.idus.dev.domain;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserTest {

    public static final Users U1 = new Users(1L, "오진혁", "지널", "password", "010-0000-0000", "email@a.com", "M");
    public static final Users U2 = new Users(2L, "오진혁2", "지널2", "password2", "010-0000-0001", "email@b.com", "F");


}
