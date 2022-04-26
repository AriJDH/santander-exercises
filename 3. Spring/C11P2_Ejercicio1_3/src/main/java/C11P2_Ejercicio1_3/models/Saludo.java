package C11P2_Ejercicio1_3.models;

public class Saludo {

    public static String saludar(){
        return "Hello World!";
    }

    public static String saludarConNombre(String nombre){
        return "Hellor World: " + nombre;
    }

    public static String saludarCompleto(String nombre, String apellido, int años){
        return "Hellor World! Tu nombre es: " + nombre + ", tu apellido es: " + apellido + " y tenés: "
                + años + " años" ;
    }
}
