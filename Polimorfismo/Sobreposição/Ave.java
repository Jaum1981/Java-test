package Polimorfismo.Sobreposição;

public class Ave extends Animal{
    
    public String corPena;

    public void fazerNinho(){
        System.out.println("Ave faz Ninho");
    }

    @Override
    public void locomover(){
        System.out.println("Voando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Ave cantando");
    }

    @Override
    public void alimentar(){
        System.out.println("Ave não come nada");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
