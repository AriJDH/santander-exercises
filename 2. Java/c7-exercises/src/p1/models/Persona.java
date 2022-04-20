package p1.models;

public class Persona {
    private String name;
    private int age;
    private String dni;
    private double weight;
    private double height;

    public Persona() {

    }
    public Persona(String name, int age, String dni) {
        this.name = name;
        this.age = age;
        this.dni = dni;
    }

    public Persona(String name, int age, String dni, double weight, double height) {
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.weight = weight;
        this.height = height;
    }

    public int calcularIMC() {
        double imc =  weight/(Math.pow(height, 2));

        if (imc<20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return this.age>=18;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + ". Edad: " + this.age + " DNI: " + this.dni + ". Peso: " + this.weight + ". Altura: " + this.height;
    }
}
