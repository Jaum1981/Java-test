package Interface;

public class Circulo implements FiguraGeo {
    //Atributos
    private int raio;

    //Construtor
    Circulo(int raio){
        this.raio = raio;
    }

    //Get e Set
    public int getRaio() {
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * (raio * raio);
    }
}