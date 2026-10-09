package DateAndTimes;

import java.time.LocalDateTime;

public class SubscriptionPrinter {

    public static void printSummary(Subscriptions subscription, LocalDateTime checkDate) {
        System.out.println("Start Date:            " + DateFormatterUtil.format(subscription.getStartDate()));
        System.out.println("Expiration Date:       " + DateFormatterUtil.format(subscription.getExpirationDate()));
        System.out.println("Grace Period End:      " + DateFormatterUtil.format(subscription.getGracePeriodEndDate()));
        System.out.println("Current Checked Date:  " + DateFormatterUtil.format(checkDate));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Subscription Status:   " + subscription.getStatus(checkDate));
        System.out.println("Days Until Termination: " + subscription.getDaysRemaining(checkDate) + " day(s)");
    }
}