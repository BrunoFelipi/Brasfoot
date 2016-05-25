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
public class Jogador {
    
    // Número da camisa
    private int numero; 
    private String nome;    
    // GL - ZG - LT - MC - AT
    private String posicao; 
    // 17 - 50
    private int idade;
    // 10 - 100
    private int forca;
    // Armação - Cabeceio - Cruzamento - Desarme - Drible - Finalização - Marcação - Passe - Resistencia - Velocidade
    private String habilidade1; 
    private String habilidade2;
    // Departamento Médico (DM), Lesão leve, Suspenso, Em alta 
    private String status;    
    // 0 - 100
    private int resistencia;
    // True ou False
    private boolean craque;
    private int qtdCartaoAmarelo;
    private int qtdCartaoVermelho;
    private int jogosDisputados;
    
    public Jogador(int numero, String nome, String posicao, int idade, int forca, String habilidade1, 
            String habilidade2, String status, boolean craque) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.forca = forca;
        this.status = status;
        this.craque = craque;  
        this.habilidade1 = habilidade1;
        this.habilidade2 = habilidade2;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero > 0 && numero < 101){
            this.numero = numero;    
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.trim().isEmpty()){
            this.nome = nome;    
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {        
        if(idade >= 17 && idade <= 51){
            this.idade = idade;    
        }
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        
        switch(posicao){
            case "GL":
            case "ZG":
            case "LT":
            case "MC":
            case "AT":
                this.posicao = posicao;
        }
    }

    public int getForca() {
        return forc;
    }

    public void setForca(int forca) {
        
        if(forca >= 10 && forca <= 100){
            this.forca = forca;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCraque() {
        return craque;
    }

    public void setCraque(boolean craque) {
        this.craque = craque;
    }    

    public String getHabilidade1() {
        return habilidade1;
    }

    public void setHabilidade1(String habilidade1) {
        this.habilidade1 = habilidade1;
    }

    public String getHabilidade2() {
        return habilidade2;
    }

    public void setHabilidade2(String habilidade2) {
        this.habilidade2 = habilidade2;
    }

    public int getQtdCartaoAmarelo() {
        return qtdCartaoAmarelo;
    }

    public void setQtdCartaoAmarelo(int qtdCartaoAmarelo) {
        this.qtdCartaoAmarelo = qtdCartaoAmarelo;
    }

    public int getQtdCartaoVermelho() {
        return qtdCartaoVermelho;
    }

    public void setQtdCartaoVermelho(int qtdCartaoVermelho) {
        this.qtdCartaoVermelho = qtdCartaoVermelho;
    }

    public int getJogosDisputados() {
        return jogosDisputados;
    }

    public void setJogosDisputados(int jogosDisputados) {
        this.jogosDisputados = jogosDisputados;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }    
}