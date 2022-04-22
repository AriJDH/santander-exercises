package com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio1.modelos;

public class Nota {
    private double primerNota;
    private double segundaNota;

    public Nota() {
        primerNota = -1.0;
        segundaNota = -1.0;
    }

    private boolean esNotaValida(double nota) {
        return nota >= 0.0 && nota <= 10.0;
    }

    public double getPrimerNota() throws Exception {
        if (primerNota == -1.0) {
            throw new Exception("No tiene primer nota");
        }
        return primerNota;
    }

    public void setPrimerNota(double primerNota) {
        if (esNotaValida(primerNota)) {
            this.primerNota = primerNota;
        }
    }

    public double getSegundaNota() throws Exception {
        if (segundaNota == -1.0) {
            throw new Exception("No tiene primer nota");
        }
        return segundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        if (esNotaValida(segundaNota)) {
            this.segundaNota = segundaNota;
        }
    }

    public boolean estaAprobado() {
        return primerNota >= 7.0 && segundaNota >= 7.0;
    }

    @Override
    public String toString() {
        String nota1 = "";
        String nota2 = "";
        if (esNotaValida(primerNota)) {
            nota1 += primerNota;
        }
        else {
            nota1 = "Sin nota";
        }
        if (esNotaValida(segundaNota)) {
            nota2 += segundaNota;
        }
        else {
            nota2 = "Sin nota";
        }
        return "Nota{" +
                "primerNota=" + nota1 +
                ", segundaNota=" + nota2 +
                '}';
    }
}
