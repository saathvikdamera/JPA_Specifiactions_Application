package in.sta.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "mse_institute_details")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class InstituteDetailsEntity extends BaseEntity{

    private String instituteName;
    private String shortName;
    private String emailId;
    private Integer countryId;
    private Integer stateId;
    private Integer cityId;
    private Integer pincode;
    private Integer trustId;
    private String affiliationNo;
    private String address;
    private String licenceType;
    private LocalDateTime licenseExpiryDate;
    private String institutionPhoneNo;
    private String speedDail;
    private String fax;
    private String website;
    private String contactPersonFName;
    private String contactPersonLName;
    private String contactPersonNumber;
    private String cPersonEmail;
    private String directions;
    private Double latitude;
    private Double longitude;
    private String displayName;
    private Integer logoUrlId;
    private Integer instituteGroupId;
    private String erpInstituteRefCode;
    private String erpInstituteRefId;
    private String s3BucketName;
    private String alternateNo;
    private String subdomainUrl;
    private Integer createdBy;
    private Integer modifiedBy;

}
