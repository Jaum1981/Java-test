package Herança.CursoEmVideo;

public class Professor extends Pessoa{
    
    private int salario;
    private String especialidade;

    public int receberAumento(int aumento){
        this.salario += aumento;
        return this.salario;
    }

    public int getSalario() {
        System.out.println("Salario: " + this.salario);
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
