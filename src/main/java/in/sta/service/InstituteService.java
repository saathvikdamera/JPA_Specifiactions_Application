package in.sta.service;

import in.sta.projections.InstituteProjection;

import java.util.List;

public interface InstituteService {
    List<InstituteProjection> getInstitutes(String searchName,Integer pageNo,Integer size);

}