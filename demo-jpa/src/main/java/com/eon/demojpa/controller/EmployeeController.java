package com.eon.demojpa.controller;

import com.eon.demojpa.exception.EmployeeNotFoundException;
import com.eon.demojpa.model.CreateEmployeeRequest;
import com.eon.demojpa.model.Employee;
import com.eon.demojpa.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {
        private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
        @Autowired
        EmployeeService employeeService;

        @PostMapping("/employee")
        public void createEmployee(@Valid @RequestBody CreateEmployeeRequest createEmployeeRequest)
        {
            logger.info("CreateEmployeeRequest : {}", createEmployeeRequest);
            logger.info("saving information into DB");

            employeeService.createEmployee(createEmployeeRequest);

        }

        @GetMapping("/employee")
        public Employee getEmployeeById(@RequestParam("id") int id) throws EmployeeNotFoundException {

            return employeeService.getEmployee(id);

        }

        @GetMapping("/employee/all")
        public List<Employee> getAllEmpDetails() {
            return employeeService.getAllEmployee();

        }
    }
