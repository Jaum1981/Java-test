public abstract class Veiculo {
    
    protected String identificador;
    protected double combustivel=0;
    protected double consumo=0;

    public abstract void consumirCombustivel(double distancia);

    public void abastecer(double quantidadeCombustivel){
        this.combustivel=quantidadeCombustivel;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

}
