package src;

import BancoDeDados.BancoDeDados;
import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import src.enumeracao.EnumEstado;
import src.enumeracao.EnumNivel;
import src.titulos.Titulo;

/**
 *
 * @author Bruno
 */
public class Time implements Serializable {

    private int id;
    private ImageIcon escudo24;
    private ImageIcon escudo32;
    private ImageIcon escudo128;
    private EnumEstado estado;
    private String nome;
    private int forca;
    private EnumNivel nivel;
    private float caixa;
    private List<Jogador> jogadores;
    private List<Jogador> jogadoresTitular;
    private List<Jogador> jogadoresReserva;
    private List<Titulo> titulos;
    private Treinador treinador;
    private Estadio estadio;
    private Color cor1;
    private Color cor2;
    private int qtdTorcedores;    
    private BancoDeDados bd;
    private int qtdMaxJogadores;
    
    public Time(ImageIcon escudo24, ImageIcon escudo32, ImageIcon escudo128, int id, String nome, EnumNivel nivel, Treinador treinador, Estadio estadio, Color cor1, Color cor2, 
            BancoDeDados bd, EnumEstado estado) {
        setEscudo24(escudo24);
        setEscudo32(escudo32);
        setEscudo128(escudo128);
        setNome(nome);
        setNivel(nivel);
        setTreinador(treinador);
        setEstado(estado);
        this.jogadores = new ArrayList<>();
        this.jogadoresReserva = new ArrayList<>();
        this.jogadoresTitular = new ArrayList<>();        
        this.titulos = new ArrayList<>();
        setId(id);
        setCaixa(0);
        setEstadio(estadio);
        setBd(bd);
        setId(nextID());
        setCor1(cor1);
        setCor2(cor2);
        setQtdTorcedores(0);
        setQtdMaxJogadores(25);
    }

    public EnumEstado getEstado() {
        return estado;
    }

    public void setEstado(EnumEstado estado) {
        this.estado = estado;
    }
    
    public ImageIcon getEscudo24() {
        return escudo24;
    }

    public void setEscudo24(ImageIcon escudo24) {
        this.escudo24 = escudo24;
    }

    public ImageIcon getEscudo32() {
        return escudo32;
    }

    public void setEscudo32(ImageIcon escudo32) {
        this.escudo32 = escudo32;
    }

    public ImageIcon getEscudo128() {
        return escudo128;
    }

    public void setEscudo128(ImageIcon escudo128) {
        this.escudo128 = escudo128;
    }

    public int getQtdMaxJogadores() {
        return qtdMaxJogadores;
    }

    public void setQtdMaxJogadores(int qtdMaxJogadores) {
        this.qtdMaxJogadores = qtdMaxJogadores;
    }

    public int getQtdTorcedores() {
        return qtdTorcedores;
    }

    public void setQtdTorcedores(int qtdTorcedores) {
        this.qtdTorcedores = qtdTorcedores;
    }

    public BancoDeDados getBd() {
        return bd;
    }

    public void setBd(BancoDeDados bd) {
        this.bd = bd;
    }

    public Color getCor1() {
        return cor1;
    }

    public void setCor1(Color cor1) {
        this.cor1 = cor1;
    }

    public Color getCor2() {
        return cor2;
    }

    public void setCor2(Color cor2) {
        this.cor2 = cor2;
    }

    public EnumNivel getNivel() {
        return nivel;
    }

    public void setNivel(EnumNivel nivel) {
        this.nivel = nivel;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
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

    public List<Titulo> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<Titulo> titulos) {
        this.titulos = titulos;
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

    public float getCaixa() {
        return caixa;
    }

    public void setCaixa(float caixa) {
        this.caixa = caixa;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    
    public List<Jogador> getJogadoresTitular() {
        return jogadoresTitular;
    }

    public void setJogadoresTitular(List<Jogador> jogadoresTitular) {
        this.jogadoresTitular = jogadoresTitular;
    }

    public List<Jogador> getJogadoresReserva() {
        return jogadoresReserva;
    }

    public void setJogadoresReserva(List<Jogador> jogadoresReserva) {
        this.jogadoresReserva = jogadoresReserva;
    }
    
    public void addTitulo(Titulo t){
        getTitulos().add(t);
    }
    
    public void addJogador(Jogador j){
        getJogadores().add(j);            
    }
    
    public void addJogadorTitular(Jogador j){
        getJogadoresTitular().add(j);            
    }
    
    public void addJogadorReserva(Jogador j){
        getJogadoresReserva().add(j);
    }
    
    private int nextID(){
        
        if(getBd().getTimes().isEmpty()){
            return 1;
        } else {
            return getBd().getTimes().get(getBd().getTimes().size()-1).getId() +1;
        }
    }
    
    public String toString(){
        return getNome();
    }
    
}