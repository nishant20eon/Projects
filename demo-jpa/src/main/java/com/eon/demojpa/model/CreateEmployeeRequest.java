package com.eon.demojpa.model;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CreateEmployeeRequest {

    private Integer id;
    @NotBlank(message = "FirstName can not be empty")
    private String firstName;
    private String lastName;
    private Integer age;
    @NotBlank(message = "DOB can not be empty")
    private String dob;
    public Employee to() {
        return Employee.builder()
                .firstName(firstName)
                .lastName(lastName)
                .dob(dob)
                .build();

    }
}
