package src;

import BancoDeDados.BancoDeDados;
import src.enumeracao.EnumPosicao;
import java.io.Serializable;
import javax.swing.ImageIcon;
import src.enumeracao.EnumCaracteristica;
import src.enumeracao.EnumHabilidade;
import src.enumeracao.EnumLado;
import src.enumeracao.EnumStatus;

/**
 *
 * @author Bruno
 */
public class Jogador implements Serializable{
    
    private int id;
    // Número da camisa
    private ImageIcon image16;
    private ImageIcon image24;
    private ImageIcon image128;
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
    private EnumCaracteristica caracteristica;
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
    private int valor;    
    private boolean titular;
    private BancoDeDados bd;
    private EnumLado lado;
    
    public Jogador(int numero, ImageIcon image16, ImageIcon image24, ImageIcon image128, String nome, EnumPosicao posicao, int idade, int forca, EnumHabilidade habilidade1, 
            EnumHabilidade habilidade2, EnumCaracteristica caracteristica, EnumStatus status, boolean craque, BancoDeDados bd, int valor, boolean titular, EnumLado lado) {
        this.bd = bd;
        setImage16(image16);
        setImage24(image24);
        setImage128(image128);
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
        setCaracteristica(caracteristica);
        setResistencia(100);
        setQtdCartaoAmarelo(0);
        setQtdCartaoVermelho(0);
        setJogosDisputados(0);
        setValor(valor);
        setTitular(titular);
        setLado(lado);
    }

    public Jogador(int id, ImageIcon image16, ImageIcon image24, ImageIcon image128, String nome, EnumPosicao posicao, int idade, EnumHabilidade habilidade1, EnumHabilidade habilidade2, 
            EnumCaracteristica caracteristica, boolean craque, Time time, BancoDeDados bd, boolean titular, EnumLado lado) {
        setId(id);
        setImage16(image16);
        setImage24(image24);
        setImage128(image128);
        setNome(nome);
        setPosicao(posicao);
        setIdade(idade);
        setHabilidade1(habilidade1);
        setHabilidade2(habilidade2);
        setCaracteristica(caracteristica);
        setCraque(craque);
        setTime(time);
        setBd(bd);
        setTitular(titular);
        setLado(lado);
    }

    public EnumCaracteristica getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(EnumCaracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

    public EnumLado getLado() {
        return lado;
    }

    public void setLado(EnumLado lado) {
        this.lado = lado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    public ImageIcon getImage16() {
        return image16;
    }

    public void setImage16(ImageIcon image16) {
        this.image16 = image16;
    }

    public ImageIcon getImage24() {
        return image24;
    }

    public void setImage24(ImageIcon image24) {
        this.image24 = image24;
    }

    public ImageIcon getImage128() {
        return image128;
    }

    public void setImage128(ImageIcon image128) {
        this.image128 = image128;
    }
    
    public BancoDeDados getBd() {
        return bd;
    }

    public void setBd(BancoDeDados bd) {
        this.bd = bd;
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
        this.numero = numero;            
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;    
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    private int nextID(){
        
        if(this.bd.getJogadores().isEmpty()){
            return 1;
        } else {
            return this.bd.getJogadores().get(this.bd.getJogadores().size()-1).getId() +1;
        }
    }
}