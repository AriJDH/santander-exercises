import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String alumnos []={"Carlos","Maria","Santiago","Gabi"};
        double notas[][]={{4,5,6},{3,8,5},{4,6,10},{6,8,2}};
        double promedio;
        for (int f = 0; f < alumnos.length; f++) {
            promedio=0;
            System.out.println("El  alumno "+ alumnos[f]+" tiene un promedio de");
            for (int c = 0; c < notas[f].length; c++) {

                promedio=promedio+notas[f][c];
            }
            System.out.printf("%.2f \n",promedio/ notas[f].length);
        }

    }
}
