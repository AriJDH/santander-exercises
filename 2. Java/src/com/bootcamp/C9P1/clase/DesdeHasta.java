package com.bootcamp.C9P1.clase;

public class DesdeHasta <T1,T2>{
    private T1 desde;
    private T2 hasta;

    public DesdeHasta(T1 desde, T2 hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }

    @Override
    public String toString() {
        return "DesdeHasta{" +
                "desde=" + desde +
                ", hasta=" + hasta +
                '}';
    }
}
