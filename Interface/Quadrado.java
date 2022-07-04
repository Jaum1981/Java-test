package Interface;

public class Quadrado implements FiguraGeo {
    
    //Atributo
    private int lado;

    //Contrutor
    public Quadrado(int lado) {
        this.lado = lado;
    }

    //Metodo especifico

    public double area(){
        return lado * lado;
    }

    //Get e Set
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
}
