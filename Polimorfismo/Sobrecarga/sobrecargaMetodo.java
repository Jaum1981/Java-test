package SobrecargaDeMetodo;

public class Sobrecarga {

    public static void imprime(int x)
    {
        System.out.println("imprime int:" + x);
    }
    public static void imprime(String y)
    {
        System.out.println("imprime String:" + y);
    }

    public static void main(String[] args) {
        imprime(10);
        imprime("aaaaa");
    }
}
