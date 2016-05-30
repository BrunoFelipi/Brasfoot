package src;

import src.titulos.Titulo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno
 */
public class Time implements Serializable {

    private int id;
    private String nome;
    private int forca;
    private float caixa;
    private String estado;
    private List<Jogador> jogadores;
    private List<Jogador> jogadoresTitular;
    private List<Jogador> jogadoresReserva;
    private List<Titulo> titulos;
    private Treinador treinador;
    private Estadio estadio;

    public Time(String nome, int forca) {
        setNome(nome);
        setForca(forca);
    }
        
    public Time(String nome, int forca, Treinador treinador, Estadio estadio) {
        setNome(nome);
        setForca(forca);
        setTreinador(treinador);
        this.jogadores = new ArrayList<>();
        this.jogadoresReserva = new ArrayList<>();
        this.jogadoresTitular = new ArrayList<>();        
        this.titulos = new ArrayList<>();
        setCaixa(0);
        setEstadio(estadio);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
}