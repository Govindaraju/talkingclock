package com.lbg.gk.talkingclock.adapter;

import com.lbg.gk.talkingclock.service.TalkingClockService;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HumanFriendlyCurrentTime {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime localTime = LocalTime.now();
        String currentTime = dtf.format(localTime);
        System.out.println("currentTime " + currentTime);
        System.out.println(TalkingClockService.pronounceTheTime(currentTime));
    }
}
