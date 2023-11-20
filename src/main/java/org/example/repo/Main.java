package org.example.repo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        //Step 1: Write code to output the current date and time.
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDateTime = localDateTime.format(formatter);

        System.out.println("Current Date und Time: " + formattedDateTime);


        // Step 2: Add a timespan of 2 weeks to the current date and output the new date.
        LocalDateTime newDateTime = localDateTime.plusWeeks(2);

        String formattedNewDateTime = newDateTime.format(formatter);

        System.out.println("New date and Time after adding 2 weeks: " + formattedNewDateTime);

        // Step 3: Compare the current date with a specified future date and
        // output whether the current date is before or after the specified date.
        LocalDateTime futureDataTime = LocalDateTime.of(2023, 11, 20, 11, 56);

        String formattedFutureDateTime = futureDataTime.format(formatter);
        System.out.println("Future Date: " + formattedFutureDateTime);

        if (localDateTime.isBefore(futureDataTime)) {
            System.out.println("The current date is before the specified future date.");
        } else if (localDateTime.isAfter(futureDataTime)) {
            System.out.println("The current date is after the specified future date.");
        } else {
            System.out.println("The current date is equal to the specified future date.");
        }

        // Step 4: Calculate the difference in days between two arbitrary dates and output the result.
        LocalDateTime date1 = LocalDateTime.of(2023, 11, 20, 11, 30);
        LocalDateTime date2 = LocalDateTime.of(2023, 12, 20, 11, 30);
        long daysDifference = ChronoUnit.DAYS.between(date1, date2);


        System.out.println("Difference in days between the two dates: " + daysDifference);

        // Create an instance of the Animal class
        Animal myAnimal = new Animal(LocalDate.of(2023, 11, 19), "Bibbi ");

        System.out.println("My animal name: " + myAnimal.getName());
        System.out.println("His Birthday: " + myAnimal.getBirthday());

        // Print on the command line how many days are left
        // until the next birthday of the animal.

        System.out.println("Days until " + myAnimal.getName() + "next birthday: " + myAnimal.daysUntilNextBirthday() + " days");


    }
}
