public class Vehiculo  implements Comparable{
    private String modelo;
    private String marca;
    private Integer costo;

    public Vehiculo(String modelo, String marca, int costo) {

        this.modelo = modelo;
        this.marca = marca;
        this.costo = costo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    @Override
    public String toString()
    {    return "Vehiculo [modelo " + modelo + ", marca " + marca + ", costo " + costo + "]";

    }

    @Override
    public int compareTo(Object o) {
        Vehiculo otro = (Vehiculo) o;
        return this.getCosto().compareTo(otro.getCosto());
    }
}
