package com.eon.demojpa.model;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "my_employee")
public class Employee {
    private String firstName;
    private String lastName;
    @Id
    private Integer id;
    @Column(name = "first_name", length = 30)

    private Integer age;
    private String dob;

    @Transient // col will not create for this in table
    private String countryCode;
}

//If i change the position of column and run the code the i m getting error as
//contains physical column name [first_name] referred to by multiple logical column names: [firstName], [first_name]
//
//by why it's not updating the column name
//Actually i want to change the position of column i.e. firstname should be first then  last name folloewwd by ID
