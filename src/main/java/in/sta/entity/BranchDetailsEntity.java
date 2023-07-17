package in.sta.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mse_branch_details")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BranchDetailsEntity extends BaseEntity{

    private Integer countryId;
    private Integer stateId;
    private Integer cityId;
    private String affiliationNo;
    private String branchName;
    private String shortName;
    private Integer branchTypeId;
    private String address;
    private String branchEmail;
    private Integer branchPhoneNo;
    private String speedDail;
    private String fax;
    private String cPersonFName;
    private String cPersonLName;
    private String cPersonNumber;
    @Column(name = "address_1")
    private String address1;
    @Column(name = "address_2")
    private String address2;
    @Column(name = "address_3")
    private String address3;
    private Integer noOfSeats;
    private Integer pincode;
    private String alternateNo;
    private String website;
    private String subdomainUrl;
    private String displayName;
    private Boolean isMainBranch;
    private String erpBranchRefCode;
    private String erpBranchRefId;
    private Integer logo;
    private Integer trustId;
    private String s3Folder;
    private Integer logoUrlId;
    private Integer campusNum;

}
