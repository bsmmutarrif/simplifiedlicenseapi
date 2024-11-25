package com.example.simplifiedlicenseapi.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "license_types")
public class LicenseType {
    public String getLicenseTypeCode() {
        return licenseTypeCode;
    }

    public void setLicenseTypeCode(String licenseTypeCode) {
        this.licenseTypeCode = licenseTypeCode;
    }

    @Id
    private String licenseTypeCode;

    public String getMinistryCode() {
        return ministryCode;
    }

    public void setMinistryCode(String ministryCode) {
        this.ministryCode = ministryCode;
    }

    private String ministryCode;

    public boolean isCanBeUsedPartially() {
        return canBeUsedPartially;
    }

    public void setCanBeUsedPartially(boolean canBeUsedPartially) {
        this.canBeUsedPartially = canBeUsedPartially;
    }

    private boolean canBeUsedPartially;
// Getters and Setters omitted for brevity
}