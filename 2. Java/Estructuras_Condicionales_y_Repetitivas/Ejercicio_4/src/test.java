import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Cuantas personas quiere ingresar");
        int cantidadPersonas= scanner.nextInt();
        //variables para guardar la decision de la persona
        int diarioA,diarioB,diarioC;
        //contadores para guardar las combinaciones deseadas
        int diarioAyC=0,diarioAyB=0,diarioByC=0,diarioSoloA=0,diarioAyByC=0;

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Persona" + (i + 1));
            System.out.println("Esta suscripto al diario A? si(1) no(0)");
            diarioA=scanner.nextInt();
            while(diarioA<0 || diarioA>1){
                System.out.println("Esta suscripto al diario A? si(1) no(0)");
                diarioA=scanner.nextInt();
            }
            System.out.println("Esta suscripto al diario B? si(1) no(0)");
            diarioB=scanner.nextInt();
            while(diarioB<0 || diarioB>1){
                System.out.println("Esta suscripto al diario B? si(1) no(0)");
                diarioB=scanner.nextInt();
            }

            System.out.println("Esta suscripto al diario C? si(1) no(0)");
            diarioC=scanner.nextInt();
            while(diarioC<0 || diarioC>1){
                System.out.println("Esta suscripto al diario C? si(1) no(0)");
                diarioC=scanner.nextInt();
            }

            if(diarioA==1 &&diarioB==1 &&diarioC==1){
                diarioAyByC++;
            }
            else if(diarioA==1 && diarioC==1){
                diarioAyC++;
            }
            else if(diarioA==1 && diarioB==1){
                diarioAyB++;
            }
            else if(diarioB==1 && diarioC==1){
                diarioByC++;
            }
            else if(diarioA==1 &&diarioB==0 &&diarioC==0){
                diarioSoloA++;
            }



        }
        System.out.println("Hay "+diarioAyByC+" personas que estan suscriptos a los tres diarios");
        System.out.println("Hay "+diarioAyC+" personas que estan suscriptos al diario A y C");
        System.out.println("Hay "+diarioAyB+" personas que estan suscriptos al diario A y B");
        System.out.println("Hay "+diarioByC+" personas que estan suscriptos al diario B y C");
        System.out.println("Hay "+diarioSoloA+" personas que estan suscriptos solo al diario A");


    }
}
