package in.sta.service.impl;

import in.sta.entity.InstituteDetailsEntity;
import in.sta.projections.InstituteProjection;
import in.sta.repo.InstituteRepository;
import in.sta.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

@Service
public class InstituteServiceImpl implements InstituteService {

    @Autowired
    private InstituteRepository instituteRepository;

    @Override
    public List<InstituteProjection> getInstitutes(String searchName, Integer pageNo, Integer size) {
        Specification<InstituteDetailsEntity> specification = (root,query,criteriaBuilder) -> {
            return criteriaBuilder.like(root.get("instituteName"),"%"+searchName+"%");
        };
        Pageable pageable = PageRequest.of(pageNo,size);
        Page<InstituteProjection> all = instituteRepository.findAll(specification, pageable);

        return all.getContent();
    }
}
