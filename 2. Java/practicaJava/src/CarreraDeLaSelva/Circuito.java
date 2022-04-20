package CarreraDeLaSelva;

import java.util.ArrayList;
import java.util.List;

public class Circuito {
    List<Corredor> chico = new ArrayList<Corredor>();
    List<Corredor> medio = new ArrayList<Corredor>();
    List<Corredor> grande = new ArrayList<Corredor>();

    public Circuito() {
        this.chico = chico;
        this.medio = medio;
        this.grande = grande;
    }

    public void inscribirAChico(Corredor corredor){
        if (chico.contains(corredor)||medio.contains(corredor)||grande.contains(corredor)){
            System.out.println("El corredor ya esta inscripto");
        }
        else {
            chico.add(corredor);
            System.out.println("Inscirpto correctamente");
        }

    }
    public void inscribirAMedio(Corredor corredor){
        if (chico.contains(corredor)||medio.contains(corredor)||grande.contains(corredor)){
            System.out.println("El corredor ya esta inscripto");
        }
        else {
            medio.add(corredor);
        }

    }
    public void inscribirAGrande(Corredor corredor){
        if (chico.contains(corredor)||medio.contains(corredor)||grande.contains(corredor)){
            System.out.println("El corredor ya esta inscripto");
        }
        else { if(corredor.getEdad()>18) {
                    grande.add(corredor);
                }
                else {
                    System.out.println("El corredor debe ser mayor de 18");
                }

        }

    }

    public void getChico() {
        System.out.println("Circuito Chico");
        for (Corredor corredor : chico) {
            System.out.println(corredor);
        }
    }

    public void getMedio() {
        System.out.println("Circuito Medio");
        for (Corredor corredor : medio) {
            System.out.println(corredor);
        }
    }

    public void getGrande() {
        System.out.println("Circuito Grande");
        for (Corredor corredor : grande) {
            System.out.println(corredor);
        }
    }
}
