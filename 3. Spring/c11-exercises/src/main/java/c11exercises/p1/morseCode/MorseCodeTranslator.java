package c11exercises.p1.morseCode;


import java.util.HashMap;
import java.util.Map;

public class MorseCodeTranslator {

    private final Map<String, String> mapMorseToString;
    private final String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
            ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};


    public MorseCodeTranslator() {
        this.mapMorseToString = new HashMap<>();

        int aux_counter=0;
        for(char alphabet = 'A'; alphabet<='Z' && aux_counter<26 ; ++alphabet, ++aux_counter) {
            mapMorseToString.put(morse[aux_counter], String.valueOf(alphabet));
        }
    }

    public String convert(String code) {
        return this.mapMorseToString.get(code);
    }

    public Map<String, String> getMap() {
        return mapMorseToString;
    }
}
