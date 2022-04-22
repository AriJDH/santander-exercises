package practica1;

public class DesdeHasta <Atributo1,Atributo2>{

    private Atributo1 atributo1;
    private Atributo2 atributo2;

    //De esta forma hago generico el tipo de dato sin usar object

    public DesdeHasta(Atributo1 atributo1, Atributo2 atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public Atributo1 getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(Atributo1 atributo1) {
        this.atributo1 = atributo1;
    }

    public Atributo2 getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(Atributo2 atributo2) {
        this.atributo2 = atributo2;
    }
}
