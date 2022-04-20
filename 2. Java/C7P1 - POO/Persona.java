package C7P1;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private double peso;



    public String getNombre() {
        return nombre;
    }

    private double altura;

    public Persona(){
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }


    public Persona(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = this.peso / Math.pow(this.altura,2);
        if (imc < 20)
            return -1;
        else
        if(imc >= 20 && imc <= 25)
            return 0;
        else
            return 1;
    }

    public void determinarNivelDePeso(int imc){
        if(imc == -1)
            System.out.println(this.nombre + " se encuentra con bajo peso");
        else
        if(imc == 0)
            System.out.println(this.nombre + " se encuentra con peso saludable");
        else
            System.out.println(this.nombre + " se encuentra con sobrepeso");
    }



    public boolean esMayorDeEdad(){
        return this.edad > 18;
    }


    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " - Edad: " + this.edad + " - DNI: " + this.dni + " - Peso: " + this.peso +
                " kg - Altura: " + this.altura + " mts";
    }

}
