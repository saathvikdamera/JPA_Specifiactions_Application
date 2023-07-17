package in.sta.projections;

import in.sta.enums.Status;

import java.time.LocalDateTime;

public interface InstituteProjection {

    String getInstituteName();
    String getWebsite();
    String getEmailId();
    String getInstitutionPhoneNo();
    LocalDateTime getLicenseExpiryDate();
    Status getStatus();
}
