package Polimorfismo.Sobreposição;

abstract public class Animal{

    protected int peso;
    protected int idade;
    protected String membros;

    public abstract void locomover();
    
    public abstract void alimentar();

    public abstract void emitirSom();

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMembros() {
        return membros;
    }

    public void setMembros(String membros) {
        this.membros = membros;
    }

}
