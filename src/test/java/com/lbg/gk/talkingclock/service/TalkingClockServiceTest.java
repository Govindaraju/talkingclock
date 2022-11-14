package com.lbg.gk.talkingclock.service;

import com.lbg.gk.talkingclock.exception.InvalidInputException;
import com.lbg.gk.talkingclock.model.TalkingClockResponse;
import org.junit.jupiter.api.Test;

import static com.lbg.gk.talkingclock.service.TalkingClockService.pronounceTheTime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TalkingClockServiceTest {

    @Test
    public void shouldPronounceTheTime(){
        TalkingClockResponse response = pronounceTheTime("13:05");
        assertEquals("Five past One",response.getHumanFriendlyTime());

        response = pronounceTheTime("1:05");
        assertEquals("Five past One",response.getHumanFriendlyTime());

        response = pronounceTheTime("01:05");
        assertEquals("Five past One",response.getHumanFriendlyTime());

        response = pronounceTheTime("12:00");
        assertEquals("Twelve o clock",response.getHumanFriendlyTime());

        response = pronounceTheTime("12:30");
        assertEquals("Half past Twelve",response.getHumanFriendlyTime());

        response = pronounceTheTime("12:31");
        assertEquals("Twenty nine to One",response.getHumanFriendlyTime());
    }

    @Test
    public void shouldThrowException(){
        Throwable exception = assertThrows(InvalidInputException.class, () -> pronounceTheTime("13:0"));
        assertEquals("Invalid input time", exception.getMessage());

        exception = assertThrows(InvalidInputException.class, () -> pronounceTheTime("24:00"));
        assertEquals("Invalid input time", exception.getMessage());

        exception = assertThrows(InvalidInputException.class, () -> pronounceTheTime("13:60"));
        assertEquals("Invalid input time", exception.getMessage());
    }

}