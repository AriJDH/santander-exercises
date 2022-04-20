package C7P1;

public class C7P1_Ejercicio1_6 {

    public static void main(String[] args) {


        Persona pVacia = new Persona();
        Persona pNombreEdadDni = new Persona("Martin",30,"37456123");
        Persona pCompleta = new Persona("Juan",25,"12345678",62,1.70);


        pCompleta.determinarNivelDePeso(pCompleta.calcularIMC());
        System.out.println("--------------------------");

        if(pCompleta.esMayorDeEdad())
            System.out.println(pCompleta.getNombre() + " es mayor de edad");
        else
            System.out.println(pCompleta.getNombre() + " NO es mayor de edad");
        System.out.println("--------------------------");

        System.out.println("DATOS DE LA PERSONA");
        System.out.println(pCompleta.toString());



    }

}
