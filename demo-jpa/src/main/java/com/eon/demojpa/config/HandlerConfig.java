package com.eon.demojpa.config;

import com.eon.demojpa.exception.EmployeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerConfig {

@ExceptionHandler(EmployeeNotFoundException.class)
public ResponseEntity handleEmployeeNotFoundException(EmployeeNotFoundException ex)
{
     String message = ex.getMessage();
     return new ResponseEntity(message, HttpStatus.BAD_REQUEST);
}


}
