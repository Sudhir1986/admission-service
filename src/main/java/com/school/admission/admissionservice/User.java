package com.school.admission.admissionservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
//import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
//    @NotNull(message="cannot be null")
//    @Min(value = 4, message = "Age should not be less than 18")
//    @Pattern(regexp = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$")
@NotEmpty
    private String ipAddress;


}
