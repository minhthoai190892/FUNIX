package com.example.demo.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class StudentRestExceptionHandler {
    //add exception handling code here
    /**
     * add an exception handler using @ExceptionHandler
     * @param ex
     * @return
     */
    @ExceptionHandler
    public ResponseEntity<StudentErrorReponse> studentErrorReponseResponseEntity (StudentNotFoundException ex){
        //create a StudentErrorReponse
        StudentErrorReponse errorReponse = new StudentErrorReponse();
        errorReponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorReponse.setMessage(ex.getMessage());
        errorReponse.setTimeStamp(System.currentTimeMillis());
        //
        return new ResponseEntity<>(errorReponse,HttpStatus.NOT_FOUND);
    }

    /**
     * Error input string
     * @param exc
     * @return
     */
    //add another exception handler ... to catch any exception (catch all)
    @ExceptionHandler
    public ResponseEntity<StudentErrorReponse> handleException(Exception exc){
//create a StudentErrorReponse
        StudentErrorReponse errorReponse = new StudentErrorReponse();
        errorReponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorReponse.setMessage(exc.getMessage());
        errorReponse.setTimeStamp(System.currentTimeMillis());
        //
        return new ResponseEntity<>(errorReponse,HttpStatus.NOT_FOUND);

    }
}
