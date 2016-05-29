package teste;

import BancoDeDados.BancoDeDados;
import src.Jogador;
import src.Time;
import src.Treinador;
import src.enumeracao.EnumHabilidade;
import src.enumeracao.EnumPosicao;
import src.enumeracao.EnumStatus;

/**
 *
 * @author bruno.souza
 */
public class CargaJogadores {

    private BancoDeDados bd;
    
    public CargaJogadores(BancoDeDados bd) {
        this.bd = bd;
    }

    public void inserirJogadores(){
        Jogador j1 = new Jogador(1, "Teste 1", EnumPosicao.GL, 20, 1, EnumHabilidade.Reflexo, EnumHabilidade.DefesaPenalti, EnumStatus.EmAlta, false, this.bd);                
        j1.setTime(new Time("Time 1", 50, new Treinador("Treinador 1", 50, 45)));
        this.bd.getJogadores().add(j1);
        
        Jogador j2 = new Jogador(2, "Teste 2", EnumPosicao.LT, 21, 2, EnumHabilidade.Cruzamento, EnumHabilidade.Passe, EnumStatus.EmAlta, false, this.bd);
        j2.setTime(new Time("Time 2", 50, new Treinador("Treinador 2", 50, 45)));
        this.bd.getJogadores().add(j2);
        
        Jogador j3 = new Jogador(3, "Teste 3", EnumPosicao.ZG, 21, 3, EnumHabilidade.Cabeceio, EnumHabilidade.Marcação, EnumStatus.EmAlta, true, this.bd);
        j3.setTime(new Time("Time 3", 50, new Treinador("Treinador 3", 50, 45)));
        this.bd.getJogadores().add(j3);
        
        Jogador j4 = new Jogador(4, "Teste 4", EnumPosicao.ZG, 22, 4, EnumHabilidade.Desarme, EnumHabilidade.Cabeceio, EnumStatus.EmAlta, false, this.bd);
        j4.setTime(new Time("Time 4", 50, new Treinador("Treinador 4", 50, 45)));
        this.bd.getJogadores().add(j4);
                
        Jogador j5 = new Jogador(5, "Teste 5", EnumPosicao.MC, 23, 5, EnumHabilidade.Passe, EnumHabilidade.Finalização, EnumStatus.EmAlta, false, this.bd);
        j5.setTime(new Time("Time 5", 50, new Treinador("Treinador 5", 50, 45)));        
        this.bd.getJogadores().add(j5);
        
        Jogador j6 = new Jogador(6, "Teste 6", EnumPosicao.LT, 24, 6, EnumHabilidade.Resistencia, EnumHabilidade.BolaParada, EnumStatus.EmAlta, true, this.bd);
        j6.setTime(new Time("Time 1", 50, new Treinador("Treinador 1", 50, 45)));
        this.bd.getJogadores().add(j6);
        
        Jogador j7 = new Jogador(7, "Teste 7", EnumPosicao.MC, 25, 7, EnumHabilidade.Armação, EnumHabilidade.Armação, EnumStatus.EmAlta, true, this.bd);
        j7.setTime(new Time("Time 2", 50, new Treinador("Treinador 2", 50, 45)));
        this.bd.getJogadores().add(j7);
        
        Jogador j8 = new Jogador(8, "Teste 8", EnumPosicao.MC, 26, 8, EnumHabilidade.Velocidade, EnumHabilidade.Finalização, EnumStatus.EmAlta, true, this.bd);
        j8.setTime(new Time("Time 3", 50, new Treinador("Treinador 3", 50, 45)));
        this.bd.getJogadores().add(j8);
        
        Jogador j9 = new Jogador(9, "Teste 9", EnumPosicao.AT, 27, 9, EnumHabilidade.Velocidade, EnumHabilidade.Finalização, EnumStatus.EmAlta, true, this.bd);
        j9.setTime(new Time("Time 4", 50, new Treinador("Treinador 4", 50, 45)));
        this.bd.getJogadores().add(j9);
        
        Jogador j10 = new Jogador(10, "Teste 10", EnumPosicao.MC, 28, 10, EnumHabilidade.Armação, EnumHabilidade.Armação, EnumStatus.EmAlta, true, this.bd);
        j10.setTime(new Time("Time 5", 50, new Treinador("Treinador 5", 50, 45)));        
        this.bd.getJogadores().add(j10);
        
        Jogador j11 = new Jogador(11, "Teste 11", EnumPosicao.AT, 29, 11, EnumHabilidade.Drible, EnumHabilidade.Drible, EnumStatus.EmAlta, false, this.bd);
        j11.setTime(new Time("Time 1", 50, new Treinador("Treinador 1", 50, 45)));
        this.bd.getJogadores().add(j11);
        
        Jogador j12 = new Jogador(12, "Teste 12", EnumPosicao.GL, 22, 12, EnumHabilidade.Elasticidade, EnumHabilidade.SaidaGol, EnumStatus.EmAlta, true, this.bd);
        j12.setTime(new Time("Time 2", 50, new Treinador("Treinador 2", 50, 45)));
        this.bd.getJogadores().add(j12);
        
        Jogador j13 = new Jogador(13, "Teste 13", EnumPosicao.AT, 24, 13, EnumHabilidade.Drible, EnumHabilidade.Finalização, EnumStatus.EmAlta, false, this.bd);
        j13.setTime(new Time("Time 3", 50, new Treinador("Treinador 3", 50, 45)));
        this.bd.getJogadores().add(j13);
        
        Jogador j14 = new Jogador(14, "Teste 14", EnumPosicao.AT, 26, 14, EnumHabilidade.Velocidade, EnumHabilidade.Finalização, EnumStatus.EmAlta, true, this.bd);
        j14.setTime(new Time("Time 4", 50, new Treinador("Treinador 4", 50, 45)));
        this.bd.getJogadores().add(j14);
       
        Jogador j15 = new Jogador(15, "Teste 15", EnumPosicao.MC, 28, 15, EnumHabilidade.Armação, EnumHabilidade.Passe, EnumStatus.EmAlta, true, this.bd);
        j15.setTime(new Time("Time 5", 50, new Treinador("Treinador 5", 50, 45)));        
        this.bd.getJogadores().add(j15);
        
        Jogador j16 = new Jogador(16, "Teste 16", EnumPosicao.MC, 24, 16, EnumHabilidade.Finalização, EnumHabilidade.Velocidade, EnumStatus.EmAlta, true, this.bd);
        j16.setTime(new Time("Time 1", 50, new Treinador("Treinador 1", 50, 45)));
        this.bd.getJogadores().add(j16);
       
        Jogador j17 = new Jogador(17, "Teste 17", EnumPosicao.ZG, 23, 17, EnumHabilidade.Desarme, EnumHabilidade.Marcação, EnumStatus.EmAlta, false, this.bd);
        j17.setTime(new Time("Time 2", 50, new Treinador("Treinador 2", 50, 45)));
        this.bd.getJogadores().add(j17);
        
        Jogador j18 = new Jogador(18, "Teste 18", EnumPosicao.ZG, 21, 18, EnumHabilidade.Velocidade, EnumHabilidade.Marcação, EnumStatus.EmAlta, true, this.bd);
        j18.setTime(new Time("Time 3", 50, new Treinador("Treinador 3", 50, 45)));
        this.bd.getJogadores().add(j18);
        
        Jogador j19 = new Jogador(19, "Teste 19", EnumPosicao.LT, 20, 19, EnumHabilidade.Resistencia, EnumHabilidade.Cabeceio, EnumStatus.EmAlta, true, this.bd);
        j19.setTime(new Time("Time 4", 50, new Treinador("Treinador 4", 50, 45)));
        this.bd.getJogadores().add(j19);   
        
        Jogador j20 = new Jogador(20, "Teste 20", EnumPosicao.LT, 20, 20, EnumHabilidade.Velocidade, EnumHabilidade.Finalização, EnumStatus.EmAlta, true, this.bd);
        j20.setTime(new Time("Time 5", 50, new Treinador("Treinador 5", 50, 45)));
        this.bd.getJogadores().add(j20);
    }    
}