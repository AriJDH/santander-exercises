package CarreraDeLaSelva;

public class Main {
        public static void main(String[] args) {
        Corredor corredor1= new Corredor (123, "pepe", "Gomez", 17, 11222222, 1133333333, "O+");
        Corredor corredor2= new Corredor (124, "martina", "Perez", 20, 11222222, 1133333333, "O+");
        Corredor corredor3= new Corredor (125, "roberto", "Gomez", 20, 11222222, 1133333333, "O+");
        Corredor corredor4= new Corredor (125, "sebastian", "Gomez", 20, 11222222, 1133333333, "O+");
        Circuito circuito = new Circuito();

        circuito.inscribirAGrande(corredor1);
        circuito.getChico();
        circuito.inscribirAChico(corredor1);
        circuito.getChico();
        circuito.inscribirAMedio(corredor1);
        circuito.inscribirAMedio(corredor2);
        circuito.getMedio();
        circuito.inscribirAGrande(corredor1);
        circuito.inscribirAGrande(corredor3);
        circuito.inscribirAGrande(corredor4);
        circuito.getGrande();


        }
}

