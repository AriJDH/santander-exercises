package bootcamp.dia20;

public class Persona {
    private String nombre, dni;
    private int edad;
    private double peso, altura;

    public Persona() {
    }

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, String dni, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double IMC = this.peso/(this.altura*this.altura);
        if (IMC < 20){
            return -1;
        }else if (IMC < 25){
            return 0;
        }else{
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        if (this.edad >= 18){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
