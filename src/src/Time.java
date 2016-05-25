/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

import java.util.List;

/**
 *
 * @author Bruno
 */
public class Time {

    private String nome;
    private int forca;
    private List<Jogador> jogadores;
    private Treinador treinador;

    public Time(String nome, int forca, List<Jogador> jogadores, Treinador treinador) {
        this.nome = nome;
        this.forca = forca;
        this.jogadores = jogadores;
        this.treinador = treinador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getExperiencia() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }
    
    public void addJogador(Jogador j){
        getJogadores().add(j);
    }
}