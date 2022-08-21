package pr.jinull.idus.dev.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pr.jinull.idus.dev.dto.UsersResponse;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Users {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Users(Long id, String name, String nickname, String password, String telNum, String email, String gender) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.password = password;
        this.telNum = telNum;
        this.email = email;
        this.gender = gender;
    }

    public Users(String name, String nickname, String password, String telNum, String email, String gender) {
        this.name = name;
        this.nickname = nickname;
        this.password = password;
        this.telNum = telNum;
        this.email = email;
        this.gender = gender;
    }

    protected Users() {

    }

    public UsersResponse makeDto() {
        return new UsersResponse(id, name, nickname, telNum, email, gender);
    }
}
