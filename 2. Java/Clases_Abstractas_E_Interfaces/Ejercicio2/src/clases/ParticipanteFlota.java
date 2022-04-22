package clases;

import java.util.List;

public class ParticipanteFlota implements Composite {
    private List<Nave> naves;

    public ParticipanteFlota(List<Nave> naves) {
        this.naves = naves;
    }


    @Override
    public String toString() {
        return "ParticipanteFlota{" + "naves=" + naves + "} " + super.toString();
    }

    @Override
    public double calcularDistancia(double x, double y) {
        int totalX = 0, totalY = 0;
        for (Nave nave : naves) {
            totalX += nave.getX();
            totalY += nave.getY();
        }
        double promedioX = 0, promedioY = 0;
        promedioX=totalX/naves.size();
        promedioY=totalY/naves.size();
        double xTotal=x-promedioX;
        double yTotal=y-promedioY;
        return Math.sqrt(   Math.pow(xTotal,2)  +      Math.pow(yTotal,2)      );

    }
}
