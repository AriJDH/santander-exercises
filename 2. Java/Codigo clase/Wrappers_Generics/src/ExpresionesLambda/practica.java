package ExpresionesLambda;

public class practica{
    public static void main(String[] args) {
        IScoring iScoring;
        iScoring= (a,b) -> a+b; //armas la funcion () los parametros y -> vas a indicar que hace
        //si haces otro entonces lo va a terminar pisando
        //iScoring=(a,b) -> a*b;
        //puede funcar sin parametros
        // si tenes mas de una sentencia encerras entre {} desp del ->
        System.out.println(iScoring.calcular(3,4));
    }
}
