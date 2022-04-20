package practicaIntegradora.ejerciciosObjetos.ejercicioUno;

public class Main {
    public static void main(String[] args) {
        Persona personaUno = new Persona();
        Persona personaDos = new Persona("Brian", 27, "38059294");
        Persona personaTres = new Persona("Pepe", 20, "34059244", 83, 1.83);

        mostrarValores(personaTres);
        esMayor(personaTres);


    }

    private static void esMayor(Persona persona){
        System.out.println("\tCalculando si es mayor de edad...");
        if(persona.esMayorDeEdad()){
            System.out.println(persona.getNombre()+" Es mayor de edad\n");
        }else{
            System.out.println(persona.getNombre()+" Es menor de edad\n");
        }
    }
    private static void mostrarValores(Persona persona){
        System.out.println("\t---indice masa corporal:---");
        int valorImc = persona.calcularImc();
        switch (valorImc){
            case -1:
                System.out.println("Bajo peso\n");break;
            case 0:
                System.out.println("Peso saludable\n");break;
            case 1:
                System.out.println("Sobre peso\n");break;
        }
    }
}
