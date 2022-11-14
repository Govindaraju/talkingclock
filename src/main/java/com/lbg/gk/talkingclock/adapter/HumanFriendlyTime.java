package com.lbg.gk.talkingclock.adapter;

import com.lbg.gk.talkingclock.service.TalkingClockService;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HumanFriendlyTime {

    @SneakyThrows
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the time in HH:MM format e.g. 14:54");
        String input = reader.readLine();
        System.out.println(TalkingClockService.pronounceTheTime(input));
    }
}
