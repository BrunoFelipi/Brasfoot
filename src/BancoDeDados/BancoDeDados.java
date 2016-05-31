package BancoDeDados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import src.Jogador;
import src.Juiz;
import src.Partida;
import src.Time;
import src.Treinador;
import src.titulos.CopaBrasil;
import src.titulos.Estadual;
import src.titulos.Libertadores;

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
            int forcaMax, String status, int valorMin, int valorMax, String craque, boolean todos){
        
        List<Jogador> jogador = new ArrayList<>();
        
        if(todos){
            return getJogadores();
        }
        
        String sNome = nome + "";
        String sPosicao = posicao + "";        
        String sTime = time + "";
        String sHabilidade = habilidade + "";
        String sStatus = status + "";
        String sCraque = craque + "";        
        
        for(Jogador j : getJogadores()){        
            if(j.getId() >= idMin && j.getId() <= idMax){
                if(j.getNumero() >= numMin && j.getNumero() <= numMax){
                    if(j.getIdade() >= idadeMin && j.getIdade() <= idadeMax){
                        if(j.getForca() >= forcaMin && j.getForca() <= forcaMax){
                            if(j.getValor() >= valorMin && j.getValor() <= valorMax){
                                
                                if(!filtro(sCraque, j.getCraque())){
                                    continue;
                                } 

                                if(!filtro(sNome, j.getNome() + "")){
                                    continue;
                                } 

                                if(!filtro(sPosicao, j.getPosicao() + "")){
                                    continue;
                                } 

                                if(!filtro(sTime, j.getTime().getNome())){
                                    continue;
                                }

                                if(!filtro(sHabilidade, j.getHabilidade1() + "")){
                                    if(!filtro(sHabilidade, j.getHabilidade2() + "")){
                                        continue;
                                    }
                                }

                                if(!filtro(sStatus, j.getStatus() + "")){
                                    continue;
                                }

                                jogador.add(j);
                            }
                        }
                    }
                }
            }
        }
        
        return jogador;        
    }
    
    private boolean filtro(String filtro, String vlr){
        if(filtro.equals("") || filtro.equals("Todos") || filtro.equals("Todas") || filtro.equals("Ambos")){
            return true;
        }
        return vlr.contains(filtro);
    }
    
    public Time buscarTimeId(int id){
        
        for(Time t : getTimes()){            
            if(t.getId() == id){
                return t;
            }
        }
        
        return null;        
    }
    
    public Time buscarTimeNome(String nome){
        
        for(Time t : getTimes()){
            
            if(t.getNome().contains(nome)){
                return t;
            }
        }
        
        return null;        
    }
    
    public boolean existJogador(String nome){
        
        for(Jogador j : getJogadores()){
            if(j.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }
    
    public Jogador buscarJogadorId(int id){
        
        for(Jogador j : getJogadores()){
            
            if(j.getId() == id){
                return j;
            }
        }
        return null;
    }
}