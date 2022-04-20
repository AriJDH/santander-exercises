package bootcamp.dia20;

public class App {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Federico Sanchez", "42382857", 22);
        Persona persona3 = new Persona("asdasd", "42285921", 23, 75.7, 172);

        if(persona3.calcularIMC() == -1) {
            System.out.println("La persona tiene bajo peso");
        }else if(persona3.calcularIMC() == 0) {
            System.out.println("La persona tiene un peso saludable");
        }else{
            System.out.println("La persona tiene sobrepeso");
        }

        if(persona3.esMayorDeEdad()){
            System.out.println("La persona es mayor de edad.");
        }else{
            System.out.println("La persona no es mayor de edad.");
        }
    }
}
