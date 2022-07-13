public class AviaoJato extends Aereo{

    @Override
    public void consumirCombustivel(double distancia) {
        super.consumirCombustivel(distancia);
        this.combustivel -=distancia/20;
    }
    
}
