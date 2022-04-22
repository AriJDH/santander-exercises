package C8P2;

import java.util.ArrayList;
import java.util.List;

public class C8P2_Ejercicio2 {

    public static void main(String[] args) {


        int[] coor1 = {1,2};
        int[] coor2 = {3,5};
        int[] coor3 = {2,1};
        int[] coor4 = {10,6};
        Nave n1 = new Nave("Nave1",coor1);
        Nave n2 = new Nave("Nave2",coor2);
        Nave n3 = new Nave("Nave3",coor2);
        Nave n4 = new Nave("Nave4",coor2);
        List<ICalculable> listaFlota = new ArrayList<>();
        listaFlota.add(n3);
        listaFlota.add(n4);
        FlotaNaves f1 = new FlotaNaves("Flota1",listaFlota);

        Jugador j1 = new Jugador("Jugador1",n1);
        Jugador j2= new Jugador("Jugador2",n2);
        Jugador j3 = new Jugador("Jugador3",f1);
        List<Jugador> inscriptos = new ArrayList<>();

        inscriptos.add(j1);
        inscriptos.add(j2);
        inscriptos.add(j3);


        int[] coor5 = {1,2};
        int[] coor6 = {3,5};
        List<int[]> listaBlancos = new ArrayList<>();
        listaBlancos.add(coor5);
        listaBlancos.add(coor6);



        for(int i=0; i<listaBlancos.size();i++){
            double menor= 9999999.999999;
            int indiceMenor = -1;
            for (int j=0; j<inscriptos.size();j++) {
                double distancia = inscriptos.get(j).tipo.calcularDistancia(listaBlancos.get(i)[0],listaBlancos.get(i)[1]);
                if(distancia < menor){
                    menor = distancia;
                    indiceMenor=j;
                }


            }
            System.out.println("Menor distancia: " + menor + " del jugador n°: " + indiceMenor);
            inscriptos.get(indiceMenor).puntuacion += 1;
        }

        int max=-999999;
        int indiceMax=-1;
        for (int j=0; j<inscriptos.size();j++) {
            if(inscriptos.get(j).puntuacion > max){
                max=inscriptos.get(j).puntuacion;
                indiceMax=j;
            }
            System.out.println("Jugador n°: " + j + " ----> Puntuación obtenida: " + inscriptos.get(j).puntuacion);
        }

        System.out.println("Con " + max + " puntos, el jugador n°: " + indiceMax + " es el ganador");


    }

    public static class Jugador {
        private String nombre;
        private int puntuacion;
        private ICalculable tipo;


        public Jugador(String nombre, ICalculable tipo) {
            this.nombre = nombre;
            this.puntuacion = 0;
            this.tipo=tipo;
        }



        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPuntuacion() {
            return puntuacion;
        }

        public void setPuntuacion(int puntuacion) {
            this.puntuacion = puntuacion;
        }
    }

    public static class Nave implements ICalculable{
        private int [] coordenadas = new int[2];


        public int[] getCoordenadas() {
            return coordenadas;
        }

        public Nave(String nombre, int[] coordenadas) {
            this.coordenadas = coordenadas;
        }

        @Override
        public double calcularDistancia(int x2, int y2) {
            return Math.sqrt((Math.pow((this.coordenadas[0]-x2),2)) + (Math.pow((this.coordenadas[1]-y2),2)));
        }
    }

    public static class FlotaNaves implements ICalculable{

        private List<ICalculable> naves;


        public List<ICalculable> getNaves() {
            return naves;
        }

        public void setNaves(List<ICalculable> naves) {
            this.naves = naves;
        }

        public FlotaNaves(String nombre, List<ICalculable> naves) {
            this.naves = naves;
        }

        @Override
        public double calcularDistancia(int x2, int y2) {
            double total =0;
            for (ICalculable nave: naves) {
                total+= nave.calcularDistancia(x2,y2);
            }
            return total/naves.size();
        }
    }
}
