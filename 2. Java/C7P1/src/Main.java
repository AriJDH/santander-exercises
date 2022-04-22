public class Main {
    public static void main(String[] args) {


        // Lo hicimos en conjunto con Gonzalo Aguirre, Hernán Romero, Agustin Leguizamon, Florencia Argañaraz

        Persona personaSinAtributos = new Persona();
        Persona personaConAlgunos = new Persona("JORGE",20,"6666");
        Persona personaConTodos = new Persona("Mati",20,"41128",50.1f,168.2f);

        //Persona personaConPocos = new Persona("mati",41); Nos tira error porque no existe el constructor en particular



        switch (personaConTodos.calcularIMC()){
            case -1:
                System.out.println("Bajo peso");
                break;
            case 0:
                System.out.println("Peso saludable");
                break;

            case 1:
                System.out.println("Rellenito");
                break;
        }

        if (personaConTodos.esMayorDeEdad()){
            System.out.println("La persona es mayor de edad");
        } else{
            System.out.println("La persona es menor de edad");
        }


        System.out.println(personaConTodos.toString());
    }
}
