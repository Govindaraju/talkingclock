package com.lbg.gk.talkingclock.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvalidInputExceptionTest {

    @Test
    public void instantiationTest(){
        InvalidInputException invalidInputException = new InvalidInputException("Invalid input");
        assertEquals("Invalid input",invalidInputException.getMessage());
    }

}