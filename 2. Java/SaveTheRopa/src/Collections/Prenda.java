package Collections;
import java.util.Scanner;
//Creo la clase Prenda con un constructor para definir sus atributos

public class Prenda {
    private String marca;
    private String modelo;



    public Prenda(String marca, String modelo){
        this.marca= marca;
        this.modelo= modelo;

    }
    //Creo un método toString para imprimir la prenda
    public String toString(){
        return "marca: " + marca + " modelo: " + modelo;
    }




}
