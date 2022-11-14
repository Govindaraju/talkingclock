package com.lbg.gk.talkingclock.service;

import com.lbg.gk.talkingclock.exception.InvalidInputException;
import com.lbg.gk.talkingclock.model.TalkingClockResponse;

import static com.lbg.gk.talkingclock.refdata.HumanClockMap.humanFriendlyHourText;
import static com.lbg.gk.talkingclock.refdata.HumanClockMap.humanFriendlyMinuteText;
import static com.lbg.gk.talkingclock.validator.TimeValidator.isInValidTimePattern;
import static java.lang.Integer.parseInt;

public class TalkingClockService {

    public static TalkingClockResponse pronounceTheTime(String timeString) {
        if (isInValidTimePattern(timeString)) {
            throw new InvalidInputException("Invalid input time");
        }
        String[] hourAndMinute = timeString.split(":");
        String humanFriendlyTime = humanFriendlyTime(hourAndMinute[0], hourAndMinute[1]);
        return new TalkingClockResponse(humanFriendlyTime);
    }

    private static String humanFriendlyTime(String hour, String minute) {
        int minuteVal = parseInt(minute);
        int hourVal = parseInt(hour);

        if (minuteVal > 30) {
            hourVal += 1;
        }
        String humanFriendlyHourText = humanFriendlyHourText(String.valueOf(hourVal));
        String humanFriendlyMinuteText = humanFriendlyMinuteText(String.valueOf(minuteVal));

        String humanFriendlyTime;

        if (minuteVal == 0) {
            humanFriendlyTime = buildHumanFriendlyTime(humanFriendlyHourText, humanFriendlyMinuteText);
        } else {
            humanFriendlyTime = buildHumanFriendlyTime(humanFriendlyMinuteText, humanFriendlyHourText);
        }
        return humanFriendlyTime;
    }

    private static String buildHumanFriendlyTime(String val1, String val2) {
        return val1 + " " + val2;
    }
}
