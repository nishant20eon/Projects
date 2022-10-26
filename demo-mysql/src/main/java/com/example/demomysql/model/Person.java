package com.example.demomysql.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Person {

    private String firstName;
    private String lastName;
    private Integer id;   // I will generate id in auto increment way
    private Integer age;
    private String dob;

}

//@Data   - It include by default include all above-mentioned annotation

/*
ID - Since ID is set as auto increment way so, no mean of showing this ID in into front end
        since this ID is created in backend only

        for this we create other class as CreatePersonRequest
 */
