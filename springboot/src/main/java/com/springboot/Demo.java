package com.springboot;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Demo {

    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
