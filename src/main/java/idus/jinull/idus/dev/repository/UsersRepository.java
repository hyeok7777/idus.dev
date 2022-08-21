package idus.jinull.idus.dev.repository;

import idus.jinull.idus.dev.domain.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query("select distinct u from Users u join fetch u.ordersList")
    List<Users> findAllJoinFetch();

    @Query("select u.no, u.name, u.nickname, u.tel_num, u.email, u.gender from Users u " +
            " where u.name = :name ")
    Optional<Users> findByUserName(@Param("name") String name);

    @Query("select u.no, u.name, u.nickname, u.tel_num, u.email, u.gender from Users u " +
            " where u.email = :email ")
    Optional<Users> findByUserEmail(@Param("email") String email);
}
