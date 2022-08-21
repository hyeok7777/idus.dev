package pr.jinull.idus.dev.repository;

import org.springframework.data.jpa.repository.Query;
import pr.jinull.idus.dev.domain.Users;
import pr.jinull.idus.dev.dto.OrdersResponse;
import pr.jinull.idus.dev.dto.UsersListResponse;
import pr.jinull.idus.dev.dto.UsersResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {

    List<UsersResponse> findAllUsersBy();

    List<UsersResponse> findUsersByEmail(@Param("email") String email);

    List<UsersResponse> findUsersByName(@Param("name") String name);

}
