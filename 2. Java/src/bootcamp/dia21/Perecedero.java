package bootcamp.dia21;

public class Perecedero extends Producto {
    int diasPorCaducar;

    public Perecedero(int diasPorCaducar, String nombre, double precio) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }



    @Override
    public double calcular(int cantidadDeProductos) {
        if(this.diasPorCaducar <= 1){
            return super.calcular(cantidadDeProductos)/4;
        }else if(this.diasPorCaducar <= 2){
            return super.calcular(cantidadDeProductos)/3;
        }else if(this.diasPorCaducar <= 3){
            return super.calcular(cantidadDeProductos)/2;
        }
        return super.calcular(cantidadDeProductos);
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
}
