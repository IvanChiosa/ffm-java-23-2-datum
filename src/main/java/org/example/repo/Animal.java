package org.example.repo;

import lombok.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
@NoArgsConstructor
@AllArgsConstructor
@With

public class Animal {
    private LocalDate birthday;
    private String name;




    public long daysUntilNextBirthday() {
        LocalDate currentDate = LocalDate.now();
        LocalDate nextBirthday = birthday.withYear(currentDate.getYear());

        if( currentDate.isAfter(nextBirthday) || currentDate.isEqual(nextBirthday)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        return ChronoUnit.DAYS.between(currentDate, nextBirthday);
    }
}
