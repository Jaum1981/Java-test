public class Barco extends Maritimo{

    @Override
    public void consumirCombustivel(double distancia) {
        super.consumirCombustivel(distancia);
        this.combustivel -= distancia/50;
    }
    
}
