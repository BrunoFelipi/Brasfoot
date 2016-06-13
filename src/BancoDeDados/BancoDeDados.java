package BancoDeDados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import src.Jogador;
import src.Juiz;
import src.Pais;
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

    public BancoDeDados() {
        carregarPaises();
    }
    
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

    //Lista de países
    private List<Pais> paises = new ArrayList<Pais>();
    
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

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }
    
    private void carregarPaises(){        
        getPaises().add(new Pais("Alemanha"));
        getPaises().add(new Pais("Argentina"));
        getPaises().add(new Pais("Austrália"));
        getPaises().add(new Pais("Bélgica"));
        getPaises().add(new Pais("Bolívia"));     
        getPaises().add(new Pais("Brasil"));
        getPaises().add(new Pais("Canadá"));
        getPaises().add(new Pais("Camarões"));             
        getPaises().add(new Pais("Chile"));
        getPaises().add(new Pais("China"));
        getPaises().add(new Pais("Colômbia"));        
        getPaises().add(new Pais("Coréia do Norte"));     
        getPaises().add(new Pais("Coréia do Sul"));     
        getPaises().add(new Pais("Croácia"));         
        getPaises().add(new Pais("Dinamarca"));     
        getPaises().add(new Pais("Estados Unidos"));     
        getPaises().add(new Pais("Equador")); 
        getPaises().add(new Pais("Espanha")); 
        getPaises().add(new Pais("Finlândia")); 
        getPaises().add(new Pais("França"));
        getPaises().add(new Pais("Grécia"));  
        getPaises().add(new Pais("Holanda"));
        getPaises().add(new Pais("Israel"));     
        getPaises().add(new Pais("Itália"));     
        getPaises().add(new Pais("Jamaica"));     
        getPaises().add(new Pais("Japão"));             
        getPaises().add(new Pais("Líbano"));     
        getPaises().add(new Pais("México"));     
        getPaises().add(new Pais("Nigéria"));     
        getPaises().add(new Pais("Noruega"));     
        getPaises().add(new Pais("Nova Zelândia"));     
        getPaises().add(new Pais("Panamá"));     
        getPaises().add(new Pais("Peru"));  
        getPaises().add(new Pais("Polônia"));     
        getPaises().add(new Pais("Portugal"));    
        getPaises().add(new Pais("República Tcheca"));
        getPaises().add(new Pais("Rússia"));  
        getPaises().add(new Pais("Suíça"));     
        getPaises().add(new Pais("Trindade e Tobago"));     
        getPaises().add(new Pais("Uruguai"));     
        getPaises().add(new Pais("Venezuela"));     
    }
    
    public ImageIcon getImagePais(Pais p){
        
        for(Pais pa : getPaises()){
            if(pa.equals(p)){
                return pa.getBandeira();
            }
        }
        return null;
    }
    
    public List<Jogador> pesquisaJogador(int idMin, int idMax, String nome, 
            String posicao, int numMin, int numMax, String time, 
            String habilidade, int idadeMin, int idadeMax, int forcaMin,
            int forcaMax, String status, int valorMin, int valorMax, String craque, boolean todos, String lado){
        
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
        String sLado = lado + "";
        
        for(Jogador j : getJogadores()){        
            if(j.getId() >= idMin && j.getId() <= idMax){
                if(j.getNumero() >= numMin && j.getNumero() <= numMax){
                    if(j.getIdade() >= idadeMin && j.getIdade() <= idadeMax){
                        if(j.getForca() >= forcaMin && j.getForca() <= forcaMax){
                            if(j.getValor() >= valorMin && j.getValor() <= valorMax){
                                
                                if(!sCraque.equals("Ambos")){
                                    if(!sCraque.equals("Sim") && j.isCraque()){
                                        continue;
                                    }
                                
                                    if(!sCraque.equals("Não") && !j.isCraque()){
                                        continue;
                                    }
                                } 
                                                                
                                if(!filtro(sLado, j.getLado() + "")){
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