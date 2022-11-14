package com.lbg.gk.talkingclock.validator;

import java.util.regex.Pattern;

public class TimeValidator {
    private static final String clockInputPattern = "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$";
    private static final Pattern pattern = Pattern.compile(clockInputPattern);

    public static boolean isInValidTimePattern(String input) {
        return !pattern.matcher(input).matches();
    }
}
