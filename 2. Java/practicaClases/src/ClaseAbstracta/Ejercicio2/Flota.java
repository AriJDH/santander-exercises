package ClaseAbstracta.Ejercicio2;



import java.util.*;

public class Flota implements ICalculable{
    ArrayList<Nave> naves = new ArrayList<Nave>();

    @Override
    public double Calcular(int x, int y) {
        int count = 0, acum = 0;
        for(Nave n:naves){
            n.Calcular(x,y);
            count ++;
            acum += n.Calcular(x,y);
        }
        return acum / count;
    }

}
