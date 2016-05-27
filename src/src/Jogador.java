package src;

import BancoDeDados.BancoDeDados;
import src.enumeracao.EnumPosicao;
import java.io.Serializable;
import src.enumeracao.EnumHabilidade;
import src.enumeracao.EnumStatus;

/**
 *
 * @author Bruno
 */
public class Jogador implements Serializable{
    
    private int id;
    // Número da camisa
    private int numero; 
    private String nome;    
    // GL - ZG - LT - MC - AT
    private EnumPosicao posicao; 
    // 17 - 50
    private int idade;
    // 10 - 100
    private int forca;
    // Armação - Cabeceio - Cruzamento - Desarme - Drible - Finalização - Marcação - Passe - Resistencia - Velocidade - Bola Parada - Defesa Penalti - Reflexo 
    // - Saida Gol - Elasticidade
    private EnumHabilidade habilidade1; 
    private EnumHabilidade habilidade2;
    // Departamento Médico (DM), Levemente Lesionado, Suspenso, Em alta 
    private EnumStatus status;    
    // 0 - 100
    private int resistencia;
    // True ou False
    private boolean craque;
    private Time time;
    private int qtdCartaoAmarelo;
    private int qtdCartaoVermelho;
    private int jogosDisputados;
    
    private BancoDeDados bd;
    
    public Jogador(int numero, String nome, EnumPosicao posicao, int idade, int forca, EnumHabilidade habilidade1, 
            EnumHabilidade habilidade2, EnumStatus status, boolean craque, BancoDeDados bd) {
        this.bd = bd;
        setId(nextID());
        setNumero(numero);
        setNome(nome);
        setIdade(idade);
        setPosicao(posicao);
        setForca(forca);
        setStatus(status);
        setCraque(craque);        
        setHabilidade1(habilidade1);
        setHabilidade2(habilidade2);
        setResistencia(100);
        setQtdCartaoAmarelo(0);
        setQtdCartaoVermelho(0);
        setJogosDisputados(0);        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
       return numero;
    }

    public void setNumero(int numero) {
        if(numero > 0 && numero < Integer.MAX_VALUE){
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
        this.idade = idade;    
    }

    public EnumPosicao getPosicao() {
        return posicao;
    }

    public void setPosicao(EnumPosicao posicao) {
        this.posicao = posicao;
    }    

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;        
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;        
    }

    public boolean isCraque() {
        return craque;
    }

    public void setCraque(boolean craque) {
        this.craque = craque;
    }    

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    public EnumHabilidade getHabilidade1() {
        return habilidade1;
    }

    public void setHabilidade1(EnumHabilidade habilidade1) {
        this.habilidade1 = habilidade1;    
    }

    public EnumHabilidade getHabilidade2() {
        return habilidade2;
    }

    public void setHabilidade2(EnumHabilidade habilidade2) {
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
    
    private int nextID(){
        
        if(this.bd.getJogadores().isEmpty()){
            return 1;
        } else {
            return this.bd.getJogadores().get(this.bd.getJogadores().size()-1).getId() +1;
        }
    }
    
    @Override
    public String toString() {
        return "Numero: " + getNumero() + 
               "\nNome: " + getNome() + 
                "\nPosicao: " + getPosicao() + 
                "\nIdade: " + getIdade() + 
                "\nForca: " + getForca() + 
                "\nHabilidade1: " + getHabilidade1() + 
                "\nHabilidade2: " + getHabilidade2() + 
                "\nStatus: " + getStatus() + 
                "\nCraque: " + isCraque();
    }
}