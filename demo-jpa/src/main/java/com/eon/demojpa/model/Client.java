package com.eon.demojpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    private Integer id;

    private String clientName;

    private String address;
//    If i remove this column again then still this col is available in table
}
