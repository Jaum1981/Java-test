package aula_youtube;

import javax.swing.JOptionPane;

public class Personagem {

    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;

    //metódo contrutor
    public Personagem(String nome, String classe){

        this.nome = nome;
        this.classe = classe;
        this.nivel = 10;
        this.vida = nivel*150;
        if(classe.equals("Guerreiro")){
            this.forca = nivel*10;
        }else if(classe.equals("Mago")){
            this.forca = nivel*5;
        }else if(classe.equals("Arqueiro")){
            this.forca = nivel*7;
        }else if(classe.equals("Ladino")){
            this.forca = nivel*8;
        }

    }
    //metódo especifico

    public void imprimirStatus(){
        String status = String.format("Personagem: %s\nNível: %d\nForça: %d\nVida: %d\nClasse: %s\n", 
        nome, 
        nivel, 
        forca, 
        vida, 
        classe);
        JOptionPane.showMessageDialog(null, status, "Status do personagem", JOptionPane.INFORMATION_MESSAGE);
    }

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    
}
