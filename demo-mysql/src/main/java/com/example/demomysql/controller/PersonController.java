package com.example.demomysql.controller;

import com.example.demomysql.BadPersonRequestException;
import com.example.demomysql.model.CreatePersonRequest;
import com.example.demomysql.model.Person;
import com.example.demomysql.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Random;

@RestController
public class PersonController {
    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
    @Autowired
    PersonService personService;

    @PostMapping("/person")
    public void createPerson(@Valid @RequestBody CreatePersonRequest createPersonRequest)
    {
        logger.info("CreatePersonRequest : {}", createPersonRequest);
        logger.info("saving information into DB");

        personService.createPerson(createPersonRequest);

    }

    @GetMapping("/person")
    public Person getPersonById(@RequestParam("id") int id) {

        return personService.getPerson(id);
    }

    @GetMapping("/person/all")
    public List<Person> getPersonById() {

        return personService.getPeople();
    }

    @DeleteMapping("/person/{id}")
    public Person deletePerson(@PathVariable("id") int id) throws Exception {
        return personService.deleteById(id);
    }

    }



