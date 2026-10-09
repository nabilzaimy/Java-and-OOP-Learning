package DateAndTimes;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Subscriptions {

    private LocalDateTime startDate;
    private int durationMonths;
    private int gracePeriodDays;

    public Subscriptions(LocalDateTime startDate, int durationMonths, int gracePeriodDays) {
        this.startDate = startDate;
        this.durationMonths = durationMonths;
        this.gracePeriodDays = gracePeriodDays;
    }

    // Calculates the expiration date
    public LocalDateTime getExpirationDate() {
        return startDate.plusMonths(durationMonths);
    }

    // Calculates the grace period end date
    public LocalDateTime getGracePeriodEndDate() {
        return getExpirationDate().plusDays(gracePeriodDays);
    }

    // Evaluates status against a check date
    public String getStatus(LocalDateTime checkDate) {
        LocalDateTime expiration = getExpirationDate();
        LocalDateTime graceEnd = getGracePeriodEndDate();

        if (checkDate.isBefore(expiration)) {
            return "ACTIVE";
        } else if (!checkDate.isAfter(graceEnd)) {
            return "IN GRACE PERIOD";
        } else {
            return "EXPIRED";
        }
    }

    // Calculates days remaining until termination
    public long getDaysRemaining(LocalDateTime checkDate) {
        LocalDateTime graceEnd = getGracePeriodEndDate();
        if (checkDate.isBefore(graceEnd)) {
            return ChronoUnit.DAYS.between(checkDate, graceEnd);
        }
        return 0;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }
}