package PracticaIntegradora;

public class Persona {
    String nombre;
    int edad;
    String dni;
    double peso;
    double altura;

    public Persona(){

    }

    public Persona(String nombre, String dni, int edad){
        this.nombre= nombre;
        this.dni= dni;
        this.edad= edad;

    }

    public Persona(String nombre, String dni, int edad, double peso, double altura){
        this.nombre= nombre;
        this.dni= dni;
        this.edad= edad;
        this.peso= peso;
        this.altura= altura;

    }


    public Integer calcularIMC(double altura, double peso){
        double imc= this.peso/(Math.pow(this.altura, 2));
        if(imc<20){
            return -1;

        }else if(imc>=20 && imc<=25){
            return 0;
        }else{
            return 1;
        }
    }

    public boolean esMayorDeEdad(int edad){
        if(edad<18) {
            return false;
        }else{
            return true;
        }

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}