package Herencia;

public class Perecedero extends Producto{

    private int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;

    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }


    @Override
    public double calcular(int cantidadDeProductos) {
        double precioFinal= 0;

        double precio = super.calcular(cantidadDeProductos);
        switch (this.diasPorCaducar){
            case   1:
                precioFinal = (precio/4);
                break;
            case   2:
                precioFinal = (precio/3);
                break;
            case   3:
                precioFinal = (precio/2);
                break;
            default:
                System.out.println("no tienes descuento");
        }
        return precioFinal;

    }


}
