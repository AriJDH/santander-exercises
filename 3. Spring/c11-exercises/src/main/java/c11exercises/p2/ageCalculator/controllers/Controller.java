package c11exercises.p2.ageCalculator.controllers;

import c11exercises.p2.ageCalculator.services.GetAgeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/getAge/{day}/{month}/{year}")
    public String getAge(@PathVariable int day, @PathVariable int month, @PathVariable int year) {

        GetAgeService getAgeService = new GetAgeService();

        return getAgeService.getAge(day, month, year);
    }
}
