package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
	    System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        minutes %= 60;
        return ((hours < 10 ? "0" + hours : hours) + "h " +
                (minutes < 10 ? "0" + minutes : minutes) + "m " +
                (seconds < 10 ? "0" + seconds : seconds) + "s");
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        return getDurationString(seconds / 60, seconds % 60);
    }
}
