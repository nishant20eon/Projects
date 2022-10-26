package com.example.demomysql.model;


import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CreatePersonRequest {
    @NotBlank(message = "FirstName can not be empty")
    private String firstName;
    private String lastName;

    @NotBlank(message ="DOB can not be empty")
    private String dob;

    public Person to()
    {
        return Person.builder()
                .firstName(firstName)
                .lastName(lastName)
                .dob(dob)
                .build();
    }
}

/*
    @NotBlank
    Error message if we don't provide dob value
    codes [createPersonRequest.dob,dob]; arguments []; default message [dob]]; default message [must not be blank]] ]
    This is not self-explanatory but if we want to display our own message then we add this @
    This error message will show in backend side
*/
