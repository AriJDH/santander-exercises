package clases;

public class Nave implements Composite{

    private double x;
    private double y;

    public Nave(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double calcularDistancia(double x, double y) {
        //                          x1^2                   x2^2                         y1^2                    y2^2
        double xTotal=x-getX();
        double yTotal=y-getY();
        return Math.sqrt(   Math.pow(xTotal,2)  +      Math.pow(yTotal,2)      );
    }

}
