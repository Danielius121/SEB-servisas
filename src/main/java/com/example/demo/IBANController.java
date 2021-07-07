package com.example.demo;
import org.springframework.web.bind.annotation.*;

@RestController
public class IBANController {
    ValidateIBAN validateIBAN;
    private Boolean response;
    @GetMapping("/IBAN/check")
    public Boolean checkIBAN(@RequestParam(value="IBAN") String IBAN) {
        response = validateIBAN.checkIBAN(IBAN);
        return response;
           }



}
