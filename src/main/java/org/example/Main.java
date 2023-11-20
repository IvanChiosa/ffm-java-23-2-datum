package org.example;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2023, 11, 20);
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("EEEE, dd.MMMM.yyyy HH:mm");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("EEEE, dd.MMMM.yyyy HH:mm:ss");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("EEEE, dd.MMMM.yyyy HH:mm:ss Z");

        System.out.println(localDate);
        System.out.println("Hello" + localTime);
        System.out.println(localDateTime);
        System.out.println(zonedDateTime);
        System.out.println(dateTimeFormatter.format(localDateTime));
        System.out.println(dateTimeFormatter1.format(localDateTime));
        System.out.println(dateTimeFormatter2.format(localDateTime));
        System.out.println(dateTimeFormatter3.format(zonedDateTime));


        System.out.println(Instant.now());

        LocalDateTime ldt1 = LocalDateTime.of(2021, 11, 8, 10, 0, 0, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2023, 11, 8, 10, 0, 0, 0);
        long days = ChronoUnit.DAYS.between(ldt1, ldt2);
        long months = ChronoUnit.MONTHS.between(ldt1, ldt2);
        System.out.println(days);
        System.out.println(months);

    }
}