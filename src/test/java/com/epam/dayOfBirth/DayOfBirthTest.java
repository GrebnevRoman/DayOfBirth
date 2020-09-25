package com.epam.dayOfBirth;

import com.epam.dayOfBirth.logic.DayOfBirth;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayOfBirthTest {

    DayOfBirth dayOfBirth = new DayOfBirth();

    @Test
    void shouldCongratsPerson() {

        String result = dayOfBirth.weekDayFinder(2001, 9, 22);
        Assertions.assertEquals(result, "Saturday 19");
    }

    @Test
    void shouldGiveYouCorrectDay() {
        String result = dayOfBirth.weekDayFinder(2000, 4, 15);
        Assertions.assertEquals(result, "Saturday 20");
    }

    @Test
    void shouldAskEnterCorrectData() {
        String result = dayOfBirth.weekDayFinder(0, 0, 0);
        Assertions.assertEquals(result, "Enter correct data");
    }
}
