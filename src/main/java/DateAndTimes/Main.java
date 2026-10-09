package DateAndTimes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args){

        // How to work with DATES & TIMES using Java
        // (LocalDate , LocalTime , LocalDateTime , UTC timestamp)

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime1 = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime1);
        System.out.println(instant);

        // Custom Format

        System.out.println(" ");
        LocalDateTime dateTime2 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDate = dateTime2.format(formatter);
        System.out.println(newDate);

        // custom date time object

        System.out.println(" ");
        LocalDateTime date3 = LocalDateTime.of(2002,11,7,8,32,21);
        LocalDateTime date4 = LocalDateTime.of(2002,11,7,12,0,0);

        System.out.println(date3);
        System.out.println(date4);

        if(date3.isAfter(date4)){
            System.out.println("TRUE");
        }
        else if(date3.isBefore(date4)){
            System.out.println("TRUE");
        }
    }
}
