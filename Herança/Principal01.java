package Herança;

public class Principal01 {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();

        p1.setNome("João");
        p2.setNome("André");
        p3.setNome("Mario");

        p1.setIdade(20);
        p2.setIdade(25);
        p3.setIdade(30);

        p1.fazerAniversario();
        p2.fazerAniversario();
        p3.fazerAniversario();

        p2.alterarCurso("Sistemas de Informação");
        p2.setMatricula(510466);
        p2.verMatricula();

        p3.setEspecialidade("Informatica");
        p3.setSalario(12655);
        p3.receberAumento(500);
        p3.getSalario();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }
}
