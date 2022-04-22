package com.Wrapper;

public class DesdeHasta <T1 , T2> {
    private Integer desde;
    private  Integer hasta;

    public DesdeHasta() {
    }

    public Integer getDesde() {
        return desde;
    }

    public void setDesde(Integer desde) {
        this.desde = desde;
    }

    public Integer getHasta() {
        return hasta;
    }

    public void setHasta(Integer hasta) {
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
