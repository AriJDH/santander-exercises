package c11exercises.p2.ageCalculator.services;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@NoArgsConstructor
@Getter
@Setter
public class GetAgeService {

    public String getAge(int day, int month, int year) {

        LocalDate birthdate;
        try {
            birthdate = LocalDate.of(year, month, day);
        } catch (Exception e) {
            return e.getMessage();
        }

        LocalDate curDate = LocalDate.now();
        Period period = Period.between(birthdate, curDate);

        String res = period.getYears() + " years " + period.getMonths() + " months and " + period.getDays() + " days";

        return res;
    }

}
