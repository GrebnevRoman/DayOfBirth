package com.epam.dayOfBirth.logic;

import java.util.GregorianCalendar;
import java.util.Calendar;


public class DayOfBirth {

    private static final GregorianCalendar GREGORIAN_CALENDAR = new GregorianCalendar();
    final byte LAST_MONTH = 12;
    final byte FIRST_DATA = 1;
    final byte LAST_DAY = 31;
    final short CURRENT_YEAR = Calendar.YEAR;
    byte weekDay;
    short personYear;

    public String weekDayFinder(int year, int month, int day) {
        if (month >= FIRST_DATA && month <= LAST_MONTH && day >= FIRST_DATA && day <= LAST_DAY && year > FIRST_DATA) {
            if (month == (GREGORIAN_CALENDAR.get(Calendar.MONTH) + 1) && day == GREGORIAN_CALENDAR.get(Calendar.DAY_OF_MONTH)) {
                System.out.print("Happy birthday :) ");
            }
            personYear = (short) (GREGORIAN_CALENDAR.get(CURRENT_YEAR) - year);
            if (month < 3) {
                --year;
                month += 10;
            } else
                month -= 2;

            weekDay = (byte) (((short) day + LAST_DAY * (short) month / LAST_MONTH
                    + year + year / 4 - year / 100 + year / 400) % 7);
        } else
            return "Enter correct data";
        return switch (weekDay) {
            case 0 -> "Sunday " + personYear;
            case 1 -> "Monday " + personYear;
            case 2 -> "Tuesday " + personYear;
            case 3 -> "Wednesday " + personYear;
            case 4 -> "Thursday " + personYear;
            case 5 -> "Friday " + personYear;
            case 6 -> "Saturday " + personYear;
            default -> "Day not exist";
        };
    }


}

