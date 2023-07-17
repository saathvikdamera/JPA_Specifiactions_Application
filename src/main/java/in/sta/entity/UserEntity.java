package in.sta.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_users")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}
