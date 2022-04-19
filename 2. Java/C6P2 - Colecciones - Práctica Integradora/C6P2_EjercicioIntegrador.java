package C6P2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class C6P2_EjercicioIntegrador {

    public static void main(String[] args) {
        Corredor c1 = new Corredor("Mariana","Rodriguez",29,12345,54321,98765,"0");
        Corredor c2 = new Corredor("Martin","Pérez",15,12345,54321,98765,"0");

        CircuitoChico cChico = new CircuitoChico();
        CircuitoMedio cMedio = new CircuitoMedio();
        CircuitoAvanzado cAvanzado = new CircuitoAvanzado();


        cChico.inscribirParticipante(c1);     //inscribo mayor al circuito chico
        System.out.println("Inscriptos al Circuito Chico");
        cChico.mostrarInscriptos();

        System.out.println("Inscriptos al Circuito Medio");  //no hay inscrip en el Medio
        cMedio.mostrarInscriptos();

        cAvanzado.inscribirParticipante(c2);        //intento inscribir un menor al Avanzado, NO SE PUEDE
        System.out.println("Inscriptos al Circuito Avanzado");
        cAvanzado.mostrarInscriptos();

        cChico.desinscribirParticipante(c1);   //desinscribo al mayor del circuito chico
        System.out.println("Inscriptos al Circuito Chico");
        cChico.mostrarInscriptos();

        cMedio.determinarMonto(c1);    //determino cuanto me saldria inscribir a un mayor al Medio

        System.out.println("---------------------------");

        cChico.inscribirParticipante(c1); //mayor al circuito chico
        cMedio.inscribirParticipante(c2);  //menor al circuito medio

        cChico.calcularTotalRecaudado();  //1500
        cMedio.calcularTotalRecaudado();  //2000
        cAvanzado.calcularTotalRecaudado(); //0

        System.out.println("---------------------------");
        System.out.println("El total recaudado entre los 3 circuitos es de: $" + Carrera.totalRecaudado);



    }

    public static class Corredor{

        private String nombre;
        private String apellido;
        private int edad;
        private int dni;
        private int celular;
        private int nroEmergencia;
        private String grupoSanguineo;
        private int nroInscripcion;

        public Corredor(String nombre, String apellido, int edad, int dni, int celular, int nroEmergencia, String grupoSanguineo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.dni = dni;
            this.celular = celular;
            this.nroEmergencia = nroEmergencia;
            this.grupoSanguineo = grupoSanguineo;
        }


        public String toString(){
            return "Nombre: " + nombre + " - Apellido: " + apellido + " - DNI: " + dni + " - Edad: " + edad +
                    " - Nro Inscripción: " + nroInscripcion;
        }



        public String getApellido() {
            return apellido;
        }

        public int getEdad() {
            return edad;
        }

        public int getDni() {
            return dni;
        }

        public int getCelular() {
            return celular;
        }

        public int getNroEmergencia() {
            return nroEmergencia;
        }

        public String getGrupoSanguineo() {
            return grupoSanguineo;
        }

        public int getNroInscripcion() {
            return nroInscripcion;
        }

        public void setNroInscripcion(int nroInscripcion) {
            this.nroInscripcion = nroInscripcion;
        }




    }

    public  abstract static class Carrera{
        public List<Corredor> listaCorredores;
        public double costoMenores;
        public double costoMayores;
        static double totalRecaudado=0;



        private Carrera(double costoMenores, double costoMayores) {
            this.listaCorredores = new ArrayList<>();
            this.costoMenores = costoMenores;
            this.costoMayores = costoMayores;

        }

        public void inscribirParticipante(Corredor corredor){
            listaCorredores.add(corredor);
            corredor.nroInscripcion = listaCorredores.size() - 1;
            if (corredor.edad < 18)
                totalRecaudado+=costoMenores;
            else
                totalRecaudado+=costoMayores;
        }

        public void mostrarInscriptos(){
            if (listaCorredores.size() == 0)
                System.out.println("** No hay inscriptos al Circuito seleccionado **");
            else
                for (Corredor corredor: listaCorredores) {
                    System.out.println(corredor.toString());
                }
            System.out.println("--------------------------------");
        }

        public void desinscribirParticipante(Corredor corredor){
            listaCorredores.remove(corredor);
            if (corredor.edad < 18)
                totalRecaudado-=costoMenores;
            else
                totalRecaudado-=costoMayores;
            System.out.println("Se desinscribió participante n°: " + corredor.nroInscripcion);
            System.out.println("-------------------------------------");
        }

        public void determinarMonto(Corredor corredor){
            if (corredor.edad < 18)
                System.out.println("Por ser menor de 18 años deberá abonar: $" + this.costoMenores);
            else
                System.out.println("Por ser mayor de 18 años deberá abonar: $" + this.costoMayores);
        }

        public void calcularTotalRecaudado(){
            double total=0;
            for (Corredor c: listaCorredores) {
                if (c.edad < 18)
                    total+=this.costoMenores;
                else
                    total+=costoMayores;
            }
            System.out.println("El total recaudado de la categoría es: $" + total);

        }




    }

    public static class CircuitoChico extends Carrera{

        public CircuitoChico() {
            super(1300,1500);

        }
    }

    public static class CircuitoMedio extends Carrera{

        public CircuitoMedio() {
            super(2000,2300);
        }
    }

    public static class CircuitoAvanzado extends Carrera{

        public CircuitoAvanzado() {
            super(-1,2800);
        }

        public void inscribirParticipante(Corredor corredor){
            if(corredor.edad < 18)
                System.out.println("No se permiten inscripciones a menores de 18 años");
            else{
                super.inscribirParticipante(corredor);
            }

        }


        public void determinarMonto(Corredor corredor){
            if (corredor.edad < 18)
                System.out.println("No se permiten inscripciones a menores de 18 años");
            else
                super.determinarMonto(corredor);
        }
    }




}
