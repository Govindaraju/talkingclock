package com.lbg.gk.talkingclock.validator;

import org.junit.jupiter.api.Test;

import static com.lbg.gk.talkingclock.validator.TimeValidator.isInValidTimePattern;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TimeValidatorTest {

    @Test
    public void shouldAcceptValidPatterns(){
        assertFalse(isInValidTimePattern("16:40"));
        assertFalse(isInValidTimePattern("6:40"));
        assertFalse(isInValidTimePattern("00:40"));
        assertFalse(isInValidTimePattern("0:10"));
        assertFalse(isInValidTimePattern("0:59"));
    }

    @Test
    public void shouldNotAcceptInvalidPatterns(){
        assertTrue(isInValidTimePattern("0:0"));
        assertTrue(isInValidTimePattern("00:0"));
        assertTrue(isInValidTimePattern("24:00"));
        assertTrue(isInValidTimePattern("14:60"));
        assertTrue(isInValidTimePattern("25:30"));
    }

}