package Ejercicio1;

public class Perecedero extends Producto{
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
    public double calcular(int cantProductos) {
     double resultado = 0;
        if(diasPorCaducar == 1){
            resultado =super.calcular(cantProductos) / 4;
        }else if(diasPorCaducar == 2){
           resultado = super.calcular(cantProductos)/3;
        }else if(diasPorCaducar == 3){
            resultado =super.calcular(cantProductos)/2;
        }else{
            System.out.println("No tenés descuento");
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

