package PracticaIntegradora;

public class Main {
    public static void main(String[] args) {

        Persona personaConstructor1= new Persona();

        //instancio un objeto persona con todos los atributos
        Persona personaCOnstructor3= new Persona("Carlos", "9424512", 18, 25.5, 1.75);

       //Presento la información

        //IMC
        if(personaCOnstructor3.calcularIMC(personaCOnstructor3.altura, personaCOnstructor3.peso) == -1){
            System.out.println("Tiene muy bajo peso");
        }else if(personaCOnstructor3.calcularIMC(personaCOnstructor3.altura, personaCOnstructor3.peso) == 0){
            System.out.println("Tiene un peso saludable ");
        }else{
            System.out.println("Tiene sobrepeso");
        }
        //Si es mayor de edad
        if(personaCOnstructor3.esMayorDeEdad(personaCOnstructor3.edad)){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }

        System.out.println(personaCOnstructor3.toString());



    }
}
