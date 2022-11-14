package com.lbg.gk.talkingclock.refdata;

import java.util.HashMap;
import java.util.Map;

public class HumanClockMap {
    private static final Map<String, String> HOUR_MAP = new HashMap<>();
    private static final Map<String, String> MINUTE_MAP = new HashMap<>();

    static {
        populateHourMap();
        populateMinuteMap();
    }

    private static void populateMinuteMap() {
        MINUTE_MAP.put("0", "o clock");
        MINUTE_MAP.put("1", "One past");
        MINUTE_MAP.put("2", "Two past");
        MINUTE_MAP.put("3", "Three past");
        MINUTE_MAP.put("4", "Four past");
        MINUTE_MAP.put("5", "Five past");
        MINUTE_MAP.put("6", "Six past");
        MINUTE_MAP.put("7", "Seven past");
        MINUTE_MAP.put("8", "Eight past");
        MINUTE_MAP.put("9", "Nine past");
        MINUTE_MAP.put("10", "Ten past");
        MINUTE_MAP.put("11", "Eleven past");
        MINUTE_MAP.put("12", "Twelve past");
        MINUTE_MAP.put("13", "Thirteen past");
        MINUTE_MAP.put("14", "Fourteen past");
        MINUTE_MAP.put("15", "Fifteen past");
        MINUTE_MAP.put("16", "Sixteen past");
        MINUTE_MAP.put("17", "Seventeen past");
        MINUTE_MAP.put("18", "Eighteen past");
        MINUTE_MAP.put("19", "Nineteen past");
        MINUTE_MAP.put("20", "Twenty past");
        MINUTE_MAP.put("21", "Twenty one past");
        MINUTE_MAP.put("22", "Twenty two past");
        MINUTE_MAP.put("23", "Twenty three past");
        MINUTE_MAP.put("24", "Twenty four past");
        MINUTE_MAP.put("25", "Twenty five past");
        MINUTE_MAP.put("26", "Twenty six past");
        MINUTE_MAP.put("27", "Twenty seven past");
        MINUTE_MAP.put("28", "Twenty eight past");
        MINUTE_MAP.put("29", "Twenty nine past");
        MINUTE_MAP.put("30", "Half past");

        MINUTE_MAP.put("59", "One to");
        MINUTE_MAP.put("58", "Two to");
        MINUTE_MAP.put("57", "Three to");
        MINUTE_MAP.put("56", "Four to");
        MINUTE_MAP.put("55", "Five to");
        MINUTE_MAP.put("54", "Six to");
        MINUTE_MAP.put("53", "Seven to");
        MINUTE_MAP.put("52", "Eight to");
        MINUTE_MAP.put("51", "Nine to");
        MINUTE_MAP.put("50", "Ten to");
        MINUTE_MAP.put("49", "Eleven to");
        MINUTE_MAP.put("48", "Twelve to");
        MINUTE_MAP.put("47", "Thirteen to");
        MINUTE_MAP.put("46", "Fourteen to");
        MINUTE_MAP.put("45", "Fifteen to");
        MINUTE_MAP.put("44", "Sixteen to");
        MINUTE_MAP.put("43", "Seventeen to");
        MINUTE_MAP.put("42", "Eighteen to");
        MINUTE_MAP.put("41", "Nineteen to");
        MINUTE_MAP.put("40", "Twenty to");
        MINUTE_MAP.put("39", "Twenty one to");
        MINUTE_MAP.put("38", "Twenty two to");
        MINUTE_MAP.put("37", "Twenty three to");
        MINUTE_MAP.put("36", "Twenty four to");
        MINUTE_MAP.put("35", "Twenty five to");
        MINUTE_MAP.put("34", "Twenty six to");
        MINUTE_MAP.put("33", "Twenty seven to");
        MINUTE_MAP.put("32", "Twenty eight to");
        MINUTE_MAP.put("31", "Twenty nine to");

        MINUTE_MAP.put("01", "One");
        MINUTE_MAP.put("02", "Two");
        MINUTE_MAP.put("03", "Three");
        MINUTE_MAP.put("04", "Four");
        MINUTE_MAP.put("05", "Five");
        MINUTE_MAP.put("06", "Six");
        MINUTE_MAP.put("07", "Seven");
        MINUTE_MAP.put("08", "Eight");
        MINUTE_MAP.put("09", "Nine");
    }

    private static void populateHourMap() {
        HOUR_MAP.put("1", "One");
        HOUR_MAP.put("2", "Two");
        HOUR_MAP.put("3", "Three");
        HOUR_MAP.put("4", "Four");
        HOUR_MAP.put("5", "Five");
        HOUR_MAP.put("6", "Six");
        HOUR_MAP.put("7", "Seven");
        HOUR_MAP.put("8", "Eight");
        HOUR_MAP.put("9", "Nine");
        HOUR_MAP.put("10", "Ten");
        HOUR_MAP.put("11", "Eleven");
        HOUR_MAP.put("12", "Twelve");

        HOUR_MAP.put("13", "One");
        HOUR_MAP.put("14", "Two");
        HOUR_MAP.put("15", "Three");
        HOUR_MAP.put("16", "Four");
        HOUR_MAP.put("17", "Five");
        HOUR_MAP.put("18", "Six");
        HOUR_MAP.put("19", "Seven");
        HOUR_MAP.put("20", "Eight");
        HOUR_MAP.put("21", "Nine");
        HOUR_MAP.put("22", "Ten");
        HOUR_MAP.put("23", "Eleven");
        HOUR_MAP.put("00", "Twelve");

        HOUR_MAP.put("01", "One");
        HOUR_MAP.put("02", "Two");
        HOUR_MAP.put("03", "Three");
        HOUR_MAP.put("04", "Four");
        HOUR_MAP.put("05", "Five");
        HOUR_MAP.put("06", "Six");
        HOUR_MAP.put("07", "Seven");
        HOUR_MAP.put("08", "Eight");
        HOUR_MAP.put("09", "Nine");
    }

    public static String humanFriendlyHourText(String hour) {
        return HOUR_MAP.get(hour);
    }

    public static String humanFriendlyMinuteText(String minute) {
        return MINUTE_MAP.get(minute);
    }

}
