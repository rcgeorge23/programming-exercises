package uk.co.novinet.berlinclock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BerlinClockTest {

    private BerlinClock testObj;

    @BeforeEach
    public void setup() {
        testObj = new BerlinClock();
    }

//    @ParameterizedTest
//    @CsvSource({
//            "00:00:00, OOOO",
//            "23:59:59, YYYY",
//            "12:32:00, YYOO",
//            "12:34:00, YYYY",
//            "12:35:00, OOOO",
//
//    })
//    public void singleMinuteRowIsEvaluatedCorrectly(String time, String expectedOutput) {
//        assertEquals(expectedOutput, testObj.calculateSingleMinuteRow(time));
//    }

    @Test
    public void singleMinuteRowIsCalculatedAsOOOOForMidnight() {
        assertEquals("OOOO", testObj.calculateSingleMinuteRow("00:00:00"));
    }

    @Test
    public void singleMinuteRowIsCalculatedAsYYYYForOneSecondToMidnight() {
        assertEquals("YYYY", testObj.calculateSingleMinuteRow("23:59:59"));
    }

    @Test
    public void singleMinuteRowIsCalculatedAsYYOOInSecondMinute() {
        assertEquals("YYOO", testObj.calculateSingleMinuteRow("12:32:00"));
    }

    @Test
    public void singleMinuteRowIsCalculatedAsYYYYInFourthMinute() {
        assertEquals("YYYY", testObj.calculateSingleMinuteRow("12:34:00"));
    }

    @Test
    public void singleMinuteRowIsCalculatedAsOOOOInFifthMinute() {
        assertEquals("OOOO", testObj.calculateSingleMinuteRow("12:35:00"));
    }

    @Test
    public void fiveMinuteRowIsCalculatedAsOOOOOOOOOOOAtMidnight() {
        assertEquals("OOOOOOOOOOO", testObj.calculateFiveMinuteRow("00:00:00"));
    }

    @Test
    public void fiveMinuteRowIsCalculatedAsYYRYYRYYRYYAtOneSecondToMidnight() {
        assertEquals("YYRYYRYYRYY", testObj.calculateFiveMinuteRow("23:59:59"));
    }

    @Test
    public void fiveMinuteRowIsCalculatedAsYYRYYRYYRYYAt12_04_00() {
        assertEquals("OOOOOOOOOOO", testObj.calculateFiveMinuteRow("12:04:00"));
    }

    @Test
    public void fiveMinuteRowIsCalculatedAsYYRYOOOOOOOAt12_23_00() {
        assertEquals("YYRYOOOOOOO", testObj.calculateFiveMinuteRow("12:23:00"));
    }

    @Test
    public void fiveMinuteRowIsCalculatedAsYYRYOOOOOOOAt12_35_00() {
        assertEquals("YYRYYRYOOOO", testObj.calculateFiveMinuteRow("12:35:00"));
    }

    @Test
    public void singleHoursRowIsCalculatedAsOOOOAtMidnight() {
        assertEquals("OOOO", testObj.calculateSingleHoursRow("00:00:00"));
    }
}