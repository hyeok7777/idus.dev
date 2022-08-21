package pr.jinull.idus.dev.Service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pr.jinull.idus.dev.Exception.CannotJoinException;
import pr.jinull.idus.dev.domain.Users;
import pr.jinull.idus.dev.dto.OrdersResponse;
import pr.jinull.idus.dev.dto.UsersRequest;
import pr.jinull.idus.dev.dto.UsersResponse;
import pr.jinull.idus.dev.repository.OrdersRepository;
import pr.jinull.idus.dev.repository.UsersRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {


    private UsersRepository usersRepository;
    private OrdersRepository ordersRepository;

    public UsersService(UsersRepository usersRepository, OrdersRepository ordersRepository) {
        this.usersRepository = usersRepository;
        this.ordersRepository = ordersRepository;
    }

    // 회원 가입
    @Transactional
    public UsersResponse join(UsersRequest usersRequest) throws CannotJoinException {
        List<UsersResponse> checkUser = usersRepository.findUsersByEmail(usersRequest.getEmail());
        if(checkUser.size() > 0) {
            throw new CannotJoinException("이미 가입 된 아이디입니다.");
        }

        return usersRepository.save(usersRequest.toEntity()).makeDto();
    }
    // 회원 전체 조회
    public List<UsersResponse> findUsersBy() {
        return usersRepository.findAllUsersBy();
    }
    // 회원 일부 조회
    public List<UsersResponse> findUsersByName(String name) {
        return usersRepository.findUsersByName(name);
    }

    public List<UsersResponse> findUsersByEmail(String email) {
        return usersRepository.findUsersByEmail(email);
    }

    // 단일 회원 주문 목록 조회
    public List<OrdersResponse> findOrderByUserId(UsersRequest usersRequest) {
        return ordersRepository.findOrderByUserId(usersRequest.getId());
    }


    // 회원 로그인

    // 회원 로그아웃
}
