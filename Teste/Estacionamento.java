import java.util.ArrayList;

public class Estacionamento {
    
    private ArrayList<Veiculo> veiculos;

    public Estacionamento(){
        veiculos = new ArrayList<Veiculo>();
    }

    public void adicionarVeiculo(Veiculo identificador){
        veiculos.add(identificador);
    }

    public void removerVeiculo(String identificador) throws VException{
        boolean achou = false;
        int i=0;
        while((!achou)&&i<(veiculos.size())){
            if(veiculos.get(i).getIdentificador().equals(identificador)){
                System.out.println("Veiculod de ID: " + identificador + "removido com sucesso");
                achou=true;
            }else{
                i++;
            }
        }
        if(achou==false){
            throw new VException(identificador);
        }
    }

    public Veiculo passear(String identificador, double distancia) throws VException{
        for (Veiculo v1 : veiculos) {
            if (v1.identificador.equals(identificador)) {
                v1.consumirCombustivel(distancia);
                return v1;
            }else{
                throw new VException(identificador);
            }    
        }
        return null;
    }
}

