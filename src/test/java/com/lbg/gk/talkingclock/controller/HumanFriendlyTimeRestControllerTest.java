package com.lbg.gk.talkingclock.controller;

import com.lbg.gk.talkingclock.exception.InvalidInputException;
import com.lbg.gk.talkingclock.model.TalkingClockResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HumanFriendlyTimeRestControllerTest {

    @Test
    public void shouldPronounceTheTime() {
        HumanFriendlyTimeRestController humanFriendlyTimeRestController = new HumanFriendlyTimeRestController();
        TalkingClockResponse response = humanFriendlyTimeRestController.time("13:05");
        assertEquals("Five past One", response.getHumanFriendlyTime());

        response = humanFriendlyTimeRestController.time("1:05");
        assertEquals("Five past One", response.getHumanFriendlyTime());

        response = humanFriendlyTimeRestController.time("01:05");
        assertEquals("Five past One", response.getHumanFriendlyTime());

        response = humanFriendlyTimeRestController.time("12:00");
        assertEquals("Twelve o clock", response.getHumanFriendlyTime());

        response = humanFriendlyTimeRestController.time("12:30");
        assertEquals("Half past Twelve", response.getHumanFriendlyTime());

        response = humanFriendlyTimeRestController.time("12:31");
        assertEquals("Twenty nine to One", response.getHumanFriendlyTime());
    }

    @Test
    public void shouldThrowException() {
        HumanFriendlyTimeRestController humanFriendlyTimeRestController = new HumanFriendlyTimeRestController();
        Throwable exception = assertThrows(InvalidInputException.class, () -> humanFriendlyTimeRestController.time("13:0"));
        assertEquals("Invalid input time", exception.getMessage());

        exception = assertThrows(InvalidInputException.class, () -> humanFriendlyTimeRestController.time("24:00"));
        assertEquals("Invalid input time", exception.getMessage());

        exception = assertThrows(InvalidInputException.class, () -> humanFriendlyTimeRestController.time("13:60"));
        assertEquals("Invalid input time", exception.getMessage());
    }
}