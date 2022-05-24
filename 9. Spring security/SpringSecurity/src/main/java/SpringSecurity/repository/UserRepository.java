package SpringSecurity.repository;

import SpringSecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query("FROM UserEntity u WHERE u.username = :username")
    UserEntity findUByUsername(@Param("username") String username);

    UserEntity findUserEntityByUsernameAndPassword(String username, String password);
}
