package clases;

public class Perecedero extends Producto {
    private int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
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
    public double calcular(int cantidadProducto) {
        double precioTotal=super.calcular(cantidadProducto);
        double precioFinal;
        switch (diasPorCaducar){
            case 1:
                precioFinal= precioTotal-precioTotal/4;
                break;
            case 2:
                precioFinal= precioTotal-precioTotal/3;
                break;
            case 3:
                precioFinal= precioTotal/2;
                break;
            default:
                precioFinal= precioTotal;
                break;
        }
        return precioFinal;

    }
}
