package Interface;

public class Principal {
    public static void main(String[] args) {
        Circulo circulopequeno = new Circulo(5);

        Quadrado quadradopequeno = new Quadrado(5);

        CalcSomaAreas calc = new CalcSomaAreas();

        System.out.println("Soma das areas: " + calc.somarAreas(circulopequeno, quadradopequeno));

    }
}
