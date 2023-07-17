package in.sta.specification;

import in.sta.entity.UserEntity;
import in.sta.entity.UserEntity_;
import in.sta.request.UserRequest;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class UserSpecifications {

    public static Specification<UserEntity> likeFirstName(String firstName){
        if(firstName == null){
            return null;
        }

        return (root, query, criteriaBuilder) ->{
            return criteriaBuilder.like(root.get(UserEntity_.FIRST_NAME), "%" + firstName + "%");
        } ;
    }

    public static  Specification<UserEntity> likeLastName(String lastName){
        if(lastName == null){
            return null;
        }

        return (root, query, criteriaBuilder) ->{
            return criteriaBuilder.like(root.get(UserEntity_.LAST_NAME), "%" + lastName + "%");
        } ;
    }

    public static Specification<UserEntity> equalEmail(String email){
        if( email == null){
            return null;
        }

        return (root, query, criteriaBuilder) ->{
            return criteriaBuilder.equal(root.get(UserEntity_.EMAIL), email);
        } ;
    }

    public static Specification<UserEntity> getUsers(UserRequest request) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (request.getEmail() != null && !request.getEmail().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get(UserEntity_.EMAIL), request.getEmail()));
            }
            if (request.getFirstName() != null && !request.getFirstName().isEmpty()) {
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get(UserEntity_.FIRST_NAME)),
                        "%" + request.getFirstName().toLowerCase() + "%"));
            }
            if (request.getLastName() != null && !request.getLastName().isEmpty()) {
                predicates.add(criteriaBuilder.like(root.get(UserEntity_.LAST_NAME),"%" + request.getLastName() + "%"));
            }
            query.orderBy(criteriaBuilder.asc(root.get(UserEntity_.FIRST_NAME)));
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
