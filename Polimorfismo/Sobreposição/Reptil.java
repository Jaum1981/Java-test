package Polimorfismo.Sobreposição;

public class Reptil extends Animal{
    
    public String corEscama;

    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Reptil não faz som");
    }

    @Override
    public void alimentar(){
        System.out.println("Reptil comendo");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
