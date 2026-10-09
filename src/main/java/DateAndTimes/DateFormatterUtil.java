package DateAndTimes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterUtil {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy 'at' hh:mm a");

    public static String format(LocalDateTime dateTime) {
        return dateTime.format(FORMATTER);
    }
}