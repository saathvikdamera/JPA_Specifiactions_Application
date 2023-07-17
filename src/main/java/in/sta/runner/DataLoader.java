package in.sta.runner;

import in.sta.entity.UserEntity;
import in.sta.specification.UserRepositorySpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

public class DataLoader implements ApplicationRunner {

    @Autowired
    private UserRepositorySpec userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        UserEntity u1 = new UserEntity();
        u1.setFirstName("saathvik");
        u1.setLastName("damera");
        u1.setEmail("saathvik@gmail.com");

        UserEntity u2 = new UserEntity();
        u2.setFirstName("shrehi");
        u2.setLastName("damera");
        u2.setEmail("shrehi@gmail.com");

        UserEntity u3 = new UserEntity();
        u3.setFirstName("vishal");
        u3.setLastName("penchala");
        u3.setEmail("vishal@gmail.com");

        UserEntity u4 = new UserEntity();
        u4.setFirstName("vasanthi");
        u4.setLastName("Yadav");
        u4.setEmail("vasanthi@gmail.com");

        UserEntity u5 = new UserEntity();
        u5.setFirstName("sandeep");
        u5.setLastName("malraj");
        u5.setEmail("Sandeep@gmail.com");

        UserEntity u6 = new UserEntity();
        u6.setFirstName("rohith");
        u6.setLastName("sanda");
        u6.setEmail("rohith@gmail.com");

        UserEntity u7 = new UserEntity();
        u7.setFirstName("arun");
        u7.setLastName("mitapally");
        u7.setEmail("arun@gmail.com");

        userRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5,u6,u7));
    }
}
