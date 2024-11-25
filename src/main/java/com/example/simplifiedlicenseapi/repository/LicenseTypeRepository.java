package com.example.simplifiedlicenseapi.repository;
import com.example.simplifiedlicenseapi.model.LicenseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LicenseTypeRepository extends
JpaRepository<LicenseType, String> {
}