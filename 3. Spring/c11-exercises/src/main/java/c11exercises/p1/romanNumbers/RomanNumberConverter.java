package c11exercises.p1.romanNumbers;

public class RomanNumberConverter {

    private int c1000;
    private int c500;
    private int c100;
    private int c50;
    private int c10;
    private int c5;
    private int c1;

    public RomanNumberConverter() {
        this.c1000 = 0;
        this.c500 = 0;
        this.c100 = 0;
        this.c50 = 0;
        this.c10 = 0;
        this.c5 = 0;
        this.c1 = 0;
    }

    public String convert(int x) {

        int aux = x;
        String res = "";

        //get the number of times 1000, 500, 100, 50, 10, 5 and 1 appears in the number
        this.c1000 = aux/1000;
        aux -= this.c1000 * 1000;
        this.c500 = aux/500;
        aux -= this.c500 * 500;
        this.c100 = aux/100;
        aux -= this.c100 * 100;
        this.c50 = aux/50;
        aux -= this.c50 * 50;
        this.c10 = aux/10;
        aux -= this.c10 * 10;
        this.c5 = aux/5;
        aux -= this.c5 * 5;
        this.c1 = aux;

        for(int i=0; i<this.c1000; ++i) {
            res += "M";
        }

        /*
         * If 100 appears 4 times, it means that there is a 400 or a 900.
         * To detect if there is a 900 or a 400, the algorithm watches how many times 500 appears (0 or 1).
         * If 500 appears 1 time, then it is a 900, and it should add "CM" (1000 - 100).
         * If 500 appears 0 times, then it is a 400, and it should add "CD" (500 - 100).
         *
         * The same logic is applied in the cases of 10 appearing four times (90 or 40) and 1 appearing
         * four times (9 or 4).
         *
         * */

        if (this.c100 == 4) {
            if (this.c500 == 1) {
                res += "CM";
            } else {
                res += "CD";
            }
        } else {
            for(int i=0; i<this.c500; ++i) {
                res += "D";
            }

            for(int i=0; i<this.c100; ++i) {
                res += "C";
            }
        }

        if (this.c10 == 4) {
            if (this.c50 == 1) {
                res += "XC";
            } else {
                res += "XL";
            }
        } else {
            for(int i=0; i<this.c50; ++i) {
                res += "L";
            }

            for(int i=0; i<this.c10; ++i) {
                res += "X";
            }
        }

        if (this.c1 == 4) {
            if (this.c5 == 1) {
                res += "IX";
            }
            else {
                res += "IV";
            }
        } else {
            for(int i=0; i<this.c5; ++i) {
                res += "V";
            }

            for(int i=0; i<this.c1; ++i) {
                res += "I";
            }
        }

        return res;
    }

}
