package com.lbg.gk.talkingclock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class TimeClockExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = InvalidInputException.class)
    public ResponseEntity<ErrorMessage> handleResourceNotFoundException(InvalidInputException ex) {
        ErrorMessage em = new ErrorMessage(ex.getMessage());
        return new ResponseEntity(em, HttpStatus.BAD_REQUEST);
    }
}
