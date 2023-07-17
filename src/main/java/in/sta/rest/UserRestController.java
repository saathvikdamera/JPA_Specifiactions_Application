package in.sta.rest;

import in.sta.entity.UserEntity;
import in.sta.request.UserRequest;
import in.sta.specification.UserRepositorySpec;
import in.sta.specification.UserSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    private UserRepositorySpec userRepo;

//    @Autowired
//    private UserRepositoryCustomImpl repo;

    @GetMapping("/{firstName}")
    public List<UserEntity> getUserWithFirstName(@PathVariable("firstName") String firstName){
        return userRepo.findAll(UserSpecifications.likeFirstName(firstName));
    }

   /* @GetMapping("/{firstName}/{lastName}/{email}")
    public List<UserEntity> getUsers(@PathVariable("firstName")String firstName,
                                     @PathVariable("lastName")String lastName,
                                     @PathVariable("email")String email){
        return repo.search(firstName,lastName,email);
    }*/

    @GetMapping("/{pageNo}/{size}")
    public List<UserRequest> getUserWithPagination(@RequestBody UserRequest request,
                                                  @PathVariable("pageNo") Integer pageNo,
                                                  @PathVariable("size") Integer size){

        Specification<UserEntity> specification = UserSpecifications.getUsers(request);
        Pageable pageable = PageRequest.of(pageNo, size);

        Page<UserEntity> page = userRepo.findAll(specification, pageable);
        List<UserRequest> users = new ArrayList<>();

        page.forEach( userEntity -> {
            UserRequest u = new UserRequest();
            u.setFirstName(userEntity.getFirstName());
            u.setLastName(userEntity.getLastName());
            u.setEmail(userEntity.getEmail());
            users.add(u);
        });

        return users;
    }

}
