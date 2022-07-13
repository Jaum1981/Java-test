public class Principal {
    public static void main(String[] args) throws VException{

        try {

        AviaoBimotor ab = new AviaoBimotor();
        AviaoJato aj = new AviaoJato();
        Barco b = new Barco();
        Carro c = new Carro();
        Moto m = new Moto();

        ab.abastecer(100);
        aj.abastecer(100);
        b.abastecer(100);
        c.abastecer(100);
        m.abastecer(100);

        Estacionamento estacio = new Estacionamento();
        estacio.adicionarVeiculo(ab);
        ab.setIdentificador("identificador");

        //QUANTIDADE DE COMBUSTIVEL RESTANTE:
        System.out.println("Combustivel restante: " + ab.getCombustivel());
        System.out.println("Combustivel restante: " + aj.getCombustivel());

        //PASSEAR:
        estacio.passear("identificador", 1000);

        //QUANTIDADE DE COMBUSTIVEL RESTANTE:
        System.out.println("Combustivel restante: " + ab.getCombustivel());


        //Classe de veiculo que nao esxite:
        estacio.removerVeiculo("aaaaa");
        estacio.removerVeiculo("identificador");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
