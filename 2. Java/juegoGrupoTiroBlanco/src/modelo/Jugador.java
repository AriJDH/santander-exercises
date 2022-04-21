package modelo;

import java.util.List;

public abstract class Jugador {
    private int puntaje;
    private String nickname;

    public Jugador(String nickname) {
        this.nickname = nickname;
        this.puntaje=0;
    }

    public abstract List<Integer> disparar(int disparo);

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "puntaje=" + puntaje +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
