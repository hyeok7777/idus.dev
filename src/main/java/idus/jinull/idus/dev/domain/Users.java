package idus.jinull.idus.dev.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Users {
    @Id
    @Column(name = "no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "tel_num", nullable = false)
    private String telNum;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "gender")
    private String gender;

    @OneToMany
    @JoinColumn(name = "no")
    private List<Orders> ordersList;


    public Users(Long no, String name, String nickname, String password, String telNum, String email, String gender) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
        this.password = password;
        this.telNum = telNum;
        this.email = email;
        this.gender = gender;
    }


    protected Users() {

    }
}
