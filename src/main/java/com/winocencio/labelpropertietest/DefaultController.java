package com.winocencio.labelpropertietest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @PostMapping("/test")
    public ResponseEntity<?> validatePurchase(){
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
