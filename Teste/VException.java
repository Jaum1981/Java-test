public class VException extends Exception{

    String identificadorVeiculo;

    public VException(String indentificador) {
        super("Veiculo nao encontrado!!");
        this.identificadorVeiculo = indentificador;
    }
    
}



