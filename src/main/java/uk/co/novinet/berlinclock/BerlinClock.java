package uk.co.novinet.berlinclock;

import static java.lang.Integer.parseInt;

public class BerlinClock {
    public String calculateSingleMinuteRow(String time) {
        String minutesComponent = minuteComponents(time);

        if (parseInt(minutesComponent) % 5 == 0) {
            return "OOOO";
        }

        if (parseInt(minutesComponent) % 2 == 0) {
            if (minutesComponent.endsWith("4")) {
                return "YYYY";
            }

            return "YYOO";
        }

        if (parseInt(minutesComponent) % 4 == 0) {
            return "YYYY";
        }

        return "YYYY";
    }

    public String calculateFiveMinuteRow(String time) {
        String minute = minuteComponents(time);
        int minutesPastHourAsInteger = parseInt(minute);

        if (minutesPastHourAsInteger >= 45 && minutesPastHourAsInteger < 60) {
            return "YYRYYRYYRYY";
        }

        if (minutesPastHourAsInteger >= 15 && minutesPastHourAsInteger < 30) {
            return "YYRYOOOOOOO";
        }

        if (minutesPastHourAsInteger >= 30 && minutesPastHourAsInteger < 45) {
            return "YYRYYRYOOOO";
        }

        return "OOOOOOOOOOO";
    }

    private String minuteComponents(String time) {
        String[] timeComponents = time.split(":");
        return timeComponents[1];
    }

    public String calculateSingleHoursRow(String time) {
        return "OOOO";
    }
}
