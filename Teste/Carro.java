public class Carro extends Terrestre{
    
    @Override
    public void consumirCombustivel(double distancia){
        super.consumirCombustivel(distancia);
        this.combustivel -= distancia/10;
    }

}
