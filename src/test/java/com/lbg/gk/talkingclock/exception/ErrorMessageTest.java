package com.lbg.gk.talkingclock.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ErrorMessageTest {
    @Test
    public void shouldBeAbleGetValuePassedInConstructor(){
        ErrorMessage errorMessage = new ErrorMessage("Invalid input");
        assertEquals("Invalid input",errorMessage.getMessage());
    }

}