package p1.models;

public class Perecedero extends Producto{

    private int diasPorCaducar;

    public Perecedero(String name, double price, int diasPorCaducar) {
        super(name, price);
        this.diasPorCaducar = diasPorCaducar;
    }

    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                '}';
    }

    @Override
    public double calcular(int cantidadDeProductos) {
        double finalPrice =  super.calcular(cantidadDeProductos);
        if (this.diasPorCaducar == 1) {
            return finalPrice/4;
        } else if (this.diasPorCaducar == 2) {
            return finalPrice/3;
        } else if (this.diasPorCaducar == 3) {
            return finalPrice/2;
        } else {
            return finalPrice;
        }
    }
}
