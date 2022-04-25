package C11P1_Ejercicio_1.models;



public class ConvertidorARomano {


    public static String convertir(int numero){
        String romanNumbers[] = {"M", "CMXC", "CM", "D", "CDXC", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (numero > 0 || arab.length == (i - 1)) {
            while ((numero - arab[i]) >= 0) {
                numero -= arab[i];
                result.append(romanNumbers[i]);
            }
            i++;
        }
        return result.toString();
    }

}


















