package in.sta.specification;

import in.sta.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositorySpec extends JpaRepository<UserEntity,Integer> , JpaSpecificationExecutor<UserEntity> {

}
