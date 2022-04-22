package C8P2;

public interface ICalculable {

    default double calcularDistancia(int x1, int y1, int x2, int y2){
        return Math.sqrt((Math.pow((x1-x2),2)) + (Math.pow((y1-y2),2)));
    }


}
