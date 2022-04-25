package c11exercises.p1;

import c11exercises.p1.morseCode.MorseCodeTranslator;
import c11exercises.p1.romanNumbers.RomanNumberConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class AppController {

    @GetMapping(path = "/romanNumber/{n}")
    public String romans(@PathVariable int n) {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();

        if (0 > n || n > 3999) {
            return "Error: number not accepted";
        }

        String res = String.valueOf(n) + ": " + romanNumberConverter.convert(n);
        return res;
    }

    @GetMapping(path = "/morseCode")
    public String morseCode() {

        MorseCodeTranslator morseCodeTranslator = new MorseCodeTranslator();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the code");
        String s = input.nextLine();

        char c;
        String substring = "";
        String res = "";
        for(int i=0; i<s.length(); ++i) {
            c = s.charAt(i);
            if (c == ' ') {
                res += morseCodeTranslator.convert(substring);
                substring = "";
                if (i < s.length() - 2) {
                    if (s.charAt(i+1) == ' ' && s.charAt(i+2) == ' ') {
                        res+= " ";
                        i+=2;
                    }
                }
            } else {
                substring += String.valueOf(c);
            }
        }

        res += morseCodeTranslator.convert(substring);
        return s + ": " + res;
    }

}

