package in.sta.criteriaBuilder;

import in.sta.entity.UserEntity;
import in.sta.entity.UserEntity_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
/*

@Repository
public class UserRepositoryCustomImpl implements UserRespositoryCustom{

    @Autowired
    EntityManager em;

    @Override
    public List<UserEntity> search(String firstName, String lastName, String email) {

        // create user query
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<UserEntity> cq = cb.createQuery(UserEntity.class);
        Root<UserEntity> user = cq.from(UserEntity.class);

        // firstName predicate
        Predicate firstNamePredicate = cb.like(user.get(UserEntity_.FIRST_NAME), "%" + firstName + "%");

        // lastName predicate
        Predicate lastNamePredicate = cb.like(user.get(UserEntity_.LAST_NAME), "%" + lastName + "%");

        // email predicate
        Predicate emailPredicate = cb.equal(user.get(UserEntity_.EMAIL), email);

        // apply predicates
        cq.where(firstNamePredicate, lastNamePredicate, emailPredicate);

        // return results
        TypedQuery<UserEntity> query = em.createQuery(cq);
        return query.getResultList();
    }
}
*/
