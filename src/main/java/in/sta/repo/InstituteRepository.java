package in.sta.repo;

import in.sta.entity.InstituteDetailsEntity;
import in.sta.projections.InstituteProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InstituteRepository extends JpaRepository<InstituteDetailsEntity,Integer>, JpaSpecificationExecutor<InstituteDetailsEntity> {

    Page<InstituteProjection> findAll(Specification specification, Pageable page);
}
