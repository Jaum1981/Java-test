package aula_youtube;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) throws Exception {
    
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do personagem");
        String classe = JOptionPane.showInputDialog(null, "Digite a classe do personagem");
        Personagem personagem = new Personagem(nome, classe);
        personagem.imprimirStatus();
    }
}
