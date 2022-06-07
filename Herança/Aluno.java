package Herança;

public class Aluno extends Pessoa{

    private String curso;
    private int matricula;

    public String alterarCurso(String curso){
        this.curso = curso;
        return this.curso;
    }

    public void verMatricula(){
        System.out.println("Matricula: " + this.matricula);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }  

}
