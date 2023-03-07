package com.school.admission.admissionservice;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@RestController
@Validated
public class AdmissionServiceController {
    @PostMapping("/login")
    public String login (@Valid @NotEmpty String name){
        System.out.println("LOgin ..." +name);
        return name;
    }
}
