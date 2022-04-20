package bootcamp.carreraDeLaSelva;

public class TipoCircuito {
    String nombre;


    public TipoCircuito(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecioTarifa(Participante participante){

        if(participante.getEdad() >= 18){
            if (this.nombre.equals("Circuito chico")){
                return 1500;
            }
            if (this.nombre.equals("Circuito medio")){
                return 2300;
            }
            if (this.nombre.equals("Circuito avanzado")){
                return 2800;
            }
        }else{
            if (this.nombre.equals("Circuito chico")){
                return 1300;
            }
            if (this.nombre.equals("Circuito medio")){
                return 2000;
            }
            if (this.nombre.equals("Circuito avanzado")){
                System.out.println("No se puede inscribir a este circuito debido a la edad.");
                return 0;
            }
        }
        return 0;
    }
}
