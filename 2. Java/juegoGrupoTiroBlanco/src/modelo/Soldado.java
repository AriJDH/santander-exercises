package modelo;

import java.util.ArrayList;
import java.util.List;

public class Soldado extends Jugador{
    public Soldado(String nickname) {
        super(nickname);
    }

    @Override
    public List<Integer> disparar(int disparo) {
        List<Integer> disparos= new ArrayList<>();
        disparos.add(disparo);
        return disparos;
    }
}
