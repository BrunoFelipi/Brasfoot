package BancoDeDados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import src.Jogador;
import src.Juiz;
import src.Partida;
import src.Time;
import src.Treinador;
import src.enumeracao.EnumHabilidade;
import src.enumeracao.EnumPosicao;
import src.enumeracao.EnumStatus;
import src.titulos.CopaBrasil;
import src.titulos.Estadual;
import src.titulos.Libertadores;
import src.titulos.Titulo;

/**
 *
 * @author Bruno
 */
public class BancoDeDados implements Serializable{
    
    //Lista de Jogadores
    private List<Jogador> jogadores = new ArrayList<>();
    
    //Lista de Treinadores
    private List<Treinador> treinadores = new ArrayList<>();
    
    //Lista de Juizes
    private List<Juiz> juizes = new ArrayList<>();
    
    //Lista de Titulos
    private List<CopaBrasil> copaBrasil = new ArrayList<>();
    private List<Libertadores> libertadores = new ArrayList<>();
    private List<Estadual> estadual = new ArrayList<>();
    
    //Lista de Times
    private List<Time> times = new ArrayList<>();
    
    //Lista de Partidas
    private List<Partida> partidas = new ArrayList<>();

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public List<Treinador> getTreinadores() {
        return treinadores;
    }

    public List<Juiz> getJuizes() {
        return juizes;
    }

    public List<CopaBrasil> getCopaBrasil() {
        return copaBrasil;
    }

    public void setCopaBrasil(List<CopaBrasil> copaBrasil) {
        this.copaBrasil = copaBrasil;
    }

    public List<Libertadores> getLibertadores() {
        return libertadores;
    }

    public void setLibertadores(List<Libertadores> libertadores) {
        this.libertadores = libertadores;
    }

    public List<Estadual> getEstadual() {
        return estadual;
    }

    public void setEstadual(List<Estadual> estadual) {
        this.estadual = estadual;
    }

    public List<Time> getTimes() {
        return times;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;    
    }
    
    public List<Jogador> pesquisaJogador(int idMin, int idMax, String nome, 
            String posicao, int numMin, int numMax, String time, 
            String habilidade, int idadeMin, int idadeMax, int forcaMin,
            int forcaMax, String status, boolean craque, boolean todos){
        
        List<Jogador> jogador = new ArrayList<>();
        
        if(todos){
            return getJogadores();
        }
        
        for(Jogador j : getJogadores()){
        
            if(j.isCraque() == craque){
                jogador.add(j);
            } else {
                
            }
            
            
        }
        
        return jogador;
        
    }
    
}
