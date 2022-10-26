package com.example.demomysql;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class HandlerConfig {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity handleMethodArgumentNotValidException(MethodArgumentNotValidException ex)
    {
        // logic
        BindingResult bindingResult = ex.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();

        /*List<String> errors=fieldErrors.stream().map(x -> x.getDefaultMessage())
                            .collect(Collectors.toList());
        return new ResponseEntity(errors, HttpStatus.BAD_REQUEST);*/
        return new ResponseEntity(null);

    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    public ResponseEntity handleIndexOutBoundException(IndexOutOfBoundsException ex){
        String message=ex.getMessage();
        return new ResponseEntity(message,HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(BadPersonRequestException.class)
    public ResponseEntity handleBadPersonRequestException(BadPersonRequestException ex)
    {
        String message= ex.getMessage();
        return new ResponseEntity(message, HttpStatus.BAD_REQUEST);
    }

}
