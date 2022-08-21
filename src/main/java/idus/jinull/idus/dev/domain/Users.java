package idus.jinull.idus.dev.domain;

import javax.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "tel_num", nullable = false)
    private String tel_num;

    @Column(name = "email", nullable = false)
    private String email;


}
