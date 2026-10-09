package DateAndTimes;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        // Setup subscription instance
        LocalDateTime startDate = LocalDateTime.of(2026, 3, 15, 14, 30, 0);
        Subscriptions subscription = new Subscriptions(startDate, 6, 7);

        // Date to test
        LocalDateTime currentDate = LocalDateTime.of(2026, 9, 18, 10, 0, 0);

        // Print output
        SubscriptionPrinter.printSummary(subscription, currentDate);
    }
}