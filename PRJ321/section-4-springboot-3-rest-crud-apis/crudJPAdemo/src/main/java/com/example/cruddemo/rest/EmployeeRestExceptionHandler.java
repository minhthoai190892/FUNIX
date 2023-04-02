package com.example.cruddemo.rest;

import com.example.cruddemo.error.EmployeeErrorResponse;
import com.example.cruddemo.error.EmployeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeRestExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> employeeErrorResponseResponseEntity(EmployeeNotFoundException exception) {
//create EmployeeErrorResponse
        EmployeeErrorResponse employeeErrorResponse = new EmployeeErrorResponse();
        employeeErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        employeeErrorResponse.setMessage(exception.getMessage());
        employeeErrorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(employeeErrorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleExceprion(Exception exception) {
//create EmployeeErrorResponse
        EmployeeErrorResponse employeeErrorResponse = new EmployeeErrorResponse();
        employeeErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        employeeErrorResponse.setMessage(exception.getMessage());
        employeeErrorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(employeeErrorResponse, HttpStatus.NOT_FOUND);
    }
}
