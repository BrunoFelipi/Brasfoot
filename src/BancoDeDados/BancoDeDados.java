package BancoDeDados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import src.Jogador;
import src.Juiz;
import src.Partida;
import src.Time;
import src.Titulo;
import src.Treinador;

/**
 *
 * @author Bruno
 */
public class BancoDeDados implements Serializable{
    
    private List<Jogador> jogadores = new ArrayList<>();
    private List<Treinador> treinadores = new ArrayList<>();
    private List<Juiz> juizes = new ArrayList<>();
    private List<Titulo> titulos = new ArrayList<>();
    private List<Time> times = new ArrayList<>();
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

    public List<Titulo> getTitulos() {
        return titulos;
    }

    public List<Time> getTimes() {
        return times;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }
    
    /**
     * Buscar jogador pelo ID
     * @param id
     * @return 
     */    
    public List<Jogador> buscarJogadorID(int id){
        
        List<Jogador> jogador = new ArrayList<>();
        
        for(Jogador j : getJogadores()){
            if(j.getId() == id){
                jogador.add(j);
            }
        }
        
        return jogador;
    }
    
    /**
     * Buscar jogador pelo Nome
     * @param nome
     * @return 
     */    
    public List<Jogador> buscarJogadorNome(String nome){
        
        List<Jogador> jogador = new ArrayList<>();
        
        for(Jogador j : getJogadores()){
            if(j.getNome().contains(nome)){
                jogador.add(j);
            }
        }
        
        return jogador;
    }
    
    /**
     * Buscar jogador pelo Número
     * @param numero
     * @return 
     */
    public List<Jogador> buscarJogadorNumero(int numero){
        
        List<Jogador> jogador = new ArrayList<>();
        
        for(Jogador j : getJogadores()){
            if(j.getNumero() == numero){
                jogador.add(j);
            }
        }
        
        return jogador;        
    }
    
    /**
     * Buscar jogador pela Posição
     * @param posicao
     * @return 
     */
    public List<Jogador> buscarJogadorPosicao(String posicao){
        
        List<Jogador> jogador = new ArrayList<>();
        
        for(Jogador j : getJogadores()){
            if(j.getPosicao().equals(posicao)){
                jogador.add(j);
            }
        }
        
        return jogador;        
    }
    
    
}
