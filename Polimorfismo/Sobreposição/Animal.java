package Polimorfismo.Sobreposição;

abstract public class Animal{

    public int peso;
    public int idade;
    public String membros;

    abstract public void locomover(){
    }

    abstract public void alimentar(){
    }

    abstract public void emitirSom(){
    }

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
