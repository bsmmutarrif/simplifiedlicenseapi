package com.example.simplifiedlicenseapi.service;

import com.example.simplifiedlicenseapi.model.LicenseType;
import com.example.simplifiedlicenseapi.repository.LicenseTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseTypeServiceImpl implements LicenseTypeService {
    @Autowired
    private LicenseTypeRepository licenseTypeRepository;

    @Override
    public void saveLicenseType(LicenseType licenseType) {
        licenseTypeRepository.save(licenseType);

    }
}