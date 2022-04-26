package ejercicioPracticoEncapsulamientoHerenciaPolimorfismo;

public class Perecedero extends Producto{
    private int diasPorCaducar;

    public Perecedero(String nombre, double precio,int diasPorCaducar) {
        super(nombre, precio);
        this.setDiasPorCaducar(diasPorCaducar);

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
    public double calcular(int cantidadProductos){
        double precioFinal;
              switch (this.diasPorCaducar){
                  case 1:precioFinal=(super.getPrecio()*cantidadProductos)/4;break;
                  case 2:precioFinal=(super.getPrecio()*cantidadProductos)/3;break;
                  case 3:precioFinal=(super.getPrecio()*cantidadProductos)/2;break;
                  default:precioFinal=super.getPrecio()*cantidadProductos;
              }
        return precioFinal;
    }

}
