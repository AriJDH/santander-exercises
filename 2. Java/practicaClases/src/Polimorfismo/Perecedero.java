package Polimorfismo;

public class Perecedero extends Producto {
    private int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }


    public double calcular(int cantidadDeProductos) {
       double totalConDescuento = 0; 
       double total = cantidadDeProductos * precio;
        switch (diasPorCaducar) {
            case 1:  totalConDescuento = total / 4 ;
                break;
            case 2: totalConDescuento = total / 3 ;
                break;
            case 3: totalConDescuento = total / 3 ;
                break;
        }
        return totalConDescuento ;
    }

    public int getDiasPorCaducar () {
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
}
