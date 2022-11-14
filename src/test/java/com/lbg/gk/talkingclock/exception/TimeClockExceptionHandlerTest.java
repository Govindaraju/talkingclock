package com.lbg.gk.talkingclock.exception;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeClockExceptionHandlerTest {

    @Test
    public void shouldReturnResponseEntityOnException() {
        InvalidInputException invalidInputException = new InvalidInputException("Invalid input");
        TimeClockExceptionHandler timeClockExceptionHandler = new TimeClockExceptionHandler();
        ResponseEntity<ErrorMessage> responseEntity = timeClockExceptionHandler.handleResourceNotFoundException(invalidInputException);

        ErrorMessage errorMessage = responseEntity.getBody();
        assertEquals(HttpStatus.BAD_REQUEST,responseEntity.getStatusCode());
        assertEquals("Invalid input",errorMessage.getMessage());
    }

}