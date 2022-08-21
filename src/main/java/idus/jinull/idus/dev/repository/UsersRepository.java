package idus.jinull.idus.dev.repository;

import idus.jinull.idus.dev.domain.Users;
import idus.jinull.idus.dev.dto.UsersResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query("select distinct u from Users u join fetch u.ordersList where u.no = :no")
    List<Users> findAllJoinFetch(@Param("no") Long no);


    Optional<UsersResponse> findUsersByEmail(@Param("email") String email);

    List<UsersResponse> findUsersByName(@Param("name") String name);
}
