/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

/**
 *
 * @author Bruno
 */
public class Treinador {
    
    private String nome;
    private int forca;
    private int idade;

    public Treinador(String nome, int forca, int idade) {
        this.nome = nome;
        this.forca = forca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}