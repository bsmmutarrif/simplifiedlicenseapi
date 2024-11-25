package com.example.simplifiedlicenseapi.consumer;

import com.example.simplifiedlicenseapi.model.LicenseType;
import com.example.simplifiedlicenseapi.service.LicenseTypeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class LicenseTypeConsumer {



    @Autowired
    private LicenseTypeService licenseTypeService;
    @Autowired
    private ObjectMapper objectMapper;


    @KafkaListener(topics = "license-topic", groupId = "license-type-group")




    public void consumeMessage(String message) {


        String[] parts = message.split(",");
        if (parts.length != 3) {
            System.err.println("Invalid message format.");
            return;
        }
        LicenseType licenseType = new LicenseType();
        licenseType.setLicenseTypeCode(parts[0]);
        licenseType.setMinistryCode(parts[1]);
        licenseType.setCanBeUsedPartially(Boolean.parseBoolean(parts[2]));
        licenseTypeService.saveLicenseType(licenseType);
    }}




//    public void consume(String message) {
//        try {
//
//            LicenseType licenseType = objectMapper.readValue(message,
//                    LicenseType.class);
//            licenseTypeService.saveLicenseType(licenseType);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}