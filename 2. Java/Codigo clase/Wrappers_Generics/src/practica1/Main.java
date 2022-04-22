package practica1;

public class Main {

    public static void main(String[] args) {

        int variable= 10;
        Integer variableInteger= 10;

        DesdeHasta<Integer,Integer>desdeHasta=new DesdeHasta<>(3,2);
        System.out.println(desdeHasta.getAtributo1());
    }
}
