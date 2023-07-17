package in.sta.entity;

import in.sta.enums.Action;
import in.sta.enums.ApproveStatus;
import in.sta.enums.Status;
import lombok.Data;

import javax.persistence.MappedSuperclass;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseEntity {

    private Integer id;
    private LocalDateTime createDate;
    private LocalDateTime modifiedDate;
    private Integer createdBy;
    private Integer modifiedBy;
    private LocalDateTime deletedDate;
    private Action action;
    private Status status;
    private ApproveStatus approveStatus;
    private String directions;
    private Double latitude;
    private Double longitude;
}
