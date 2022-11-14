package com.lbg.gk.talkingclock.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TalkingClockResponseTest {

    @Test
    public void shouldBeAbleGetValuePassedInConstructor(){
        TalkingClockResponse talkingClockResponse = new TalkingClockResponse("Half past One");
        assertEquals("Half past One",talkingClockResponse.getHumanFriendlyTime());
    }

}