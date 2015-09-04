import org.joda.time.DateTime;

import java.time.LocalDate;

public class Meetup {
    private final int month;
    private final int year;

    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public DateTime day(int weekday, MeetupSchedule schedule) {
        if (schedule == MeetupSchedule.TEENTH) {
            return new DateTime(year, month, teenthWeekday(weekday), 0, 0);
        } else {
            return new DateTime(year, month, nthWeekday(weekday, schedule), 0, 0);
        }
    }

    private int teenthWeekday(int weekday) {
        LocalDate date = LocalDate.of(year, month, 13); // teenth are from 13-19
        for (int i = 0; i < 7; i++) {
            if (date.getDayOfWeek().getValue() == weekday) {
                break;
            }
            date = date.plusDays(1);
        }
        return date.getDayOfMonth();
    }

    private int nthWeekday(int weekday, MeetupSchedule schedule) {
        LocalDate date = LocalDate.of(year, month, 1);
        for (int i = 0; i < date.lengthOfMonth(); i++) {
            if (date.getDayOfWeek().getValue() == weekday) {
                switch (schedule) {
                    case SECOND:
                        date = date.plusDays(7);
                        break;
                    case THIRD:
                        date = date.plusDays(14);
                        break;
                    case FOURTH:
                        date = date.plusDays(21);
                        break;
                    case LAST:
                        for (int j = date.getDayOfMonth(); j <= date.lengthOfMonth() - 7; j += 7) {
                            date = date.plusDays(7);
                        }
                        break;
                }
                break;
            }
            date = date.plusDays(1);
        }
        return date.getDayOfMonth();
    }
}
