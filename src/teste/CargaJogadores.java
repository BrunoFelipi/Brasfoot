package teste;

import BancoDeDados.BancoDeDados;
import java.awt.Color;
import javax.swing.ImageIcon;
import src.Estadio;
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
        
        Jogador j1 = new Jogador(1, new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")),"Teste 1", EnumPosicao.GL, 20, 1, EnumHabilidade.Reflexo, EnumHabilidade.DefesaPenalti, EnumStatus.EmAlta, "Não", this.bd, 5000);                
        j1.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 1", 50, new Treinador("Treinador 1", 50, 45), new Estadio("Estadio 1"), Color.BLUE, Color.GRAY, this.bd));
        this.bd.getJogadores().add(j1);
        
        Jogador j2 = new Jogador(2, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 2", EnumPosicao.LT, 21, 2, EnumHabilidade.Cruzamento, EnumHabilidade.Passe, EnumStatus.EmAlta, "Não", this.bd, 5000);
        j2.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 2", 50, new Treinador("Treinador 2", 50, 45), new Estadio("Estadio 2"), Color.ORANGE, Color.yellow, this.bd));
        this.bd.getJogadores().add(j2);
        
        Jogador j3 = new Jogador(3, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 3", EnumPosicao.ZG, 21, 3, EnumHabilidade.Cabeceio, EnumHabilidade.Marcação, EnumStatus.LevementeLesionado, "Sim", this.bd, 5000);
        j3.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 3", 50, new Treinador("Treinador 3", 50, 45), new Estadio("Estadio 3"), Color.CYAN, Color.BLACK, this.bd));
        this.bd.getJogadores().add(j3);
        
        Jogador j4 = new Jogador(4, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 4", EnumPosicao.ZG, 22, 4, EnumHabilidade.Desarme, EnumHabilidade.Cabeceio, EnumStatus.DepartamentoMedico, "Não", this.bd, 5000);
        j4.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 4", 50, new Treinador("Treinador 4", 50, 45), new Estadio("Estadio 4"), Color.green, Color.GRAY, this.bd));
        this.bd.getJogadores().add(j4);
                
        Jogador j5 = new Jogador(5, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 5", EnumPosicao.MC, 23, 5, EnumHabilidade.Passe, EnumHabilidade.Finalização, EnumStatus.EmAlta, "Não", this.bd, 5000);
        j5.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 5", 50, new Treinador("Treinador 5", 50, 45), new Estadio("Estadio 5"), Color.DARK_GRAY, Color.BLACK, this.bd));        
        this.bd.getJogadores().add(j5);
        
        Jogador j6 = new Jogador(6, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 6", EnumPosicao.LT, 24, 6, EnumHabilidade.Resistencia, EnumHabilidade.BolaParada, EnumStatus.EmAlta, "Sim", this.bd, 5000);
        j6.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 1", 50, new Treinador("Treinador 1", 50, 45), new Estadio("Estadio 6"), Color.YELLOW, Color.WHITE, this.bd));
        this.bd.getJogadores().add(j6);
        
        Jogador j7 = new Jogador(7, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 7", EnumPosicao.MC, 25, 7, EnumHabilidade.Armação, EnumHabilidade.Armação, EnumStatus.DepartamentoMedico, "Não", this.bd, 5000);
        j7.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 2", 50, new Treinador("Treinador 2", 50, 45), new Estadio("Estadio 7"), Color.PINK, Color.BLUE, this.bd));
        this.bd.getJogadores().add(j7);
        
        Jogador j8 = new Jogador(8, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 8", EnumPosicao.MC, 26, 8, EnumHabilidade.Velocidade, EnumHabilidade.Finalização, EnumStatus.EmAlta, "Sim", this.bd, 5000);
        j8.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 3", 50, new Treinador("Treinador 3", 50, 45), new Estadio("Estadio 8"), Color.RED, Color.WHITE, this.bd));
        this.bd.getJogadores().add(j8);
        
        Jogador j9 = new Jogador(9, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 9", EnumPosicao.AT, 27, 9, EnumHabilidade.Velocidade, EnumHabilidade.Finalização, EnumStatus.EmAlta, "Sim", this.bd, 5000);
        j9.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 4", 50, new Treinador("Treinador 4", 50, 45), new Estadio("Estadio 9"), Color.BLUE, Color.RED, this.bd));
        this.bd.getJogadores().add(j9);
        
        Jogador j10 = new Jogador(10, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 10", EnumPosicao.MC, 28, 10, EnumHabilidade.Armação, EnumHabilidade.Velocidade, EnumStatus.EmAlta, "Sim", this.bd, 5000);
        j10.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 5", 50, new Treinador("Treinador 5", 50, 45), new Estadio("Estadio 10"), Color.CYAN, Color.MAGENTA, this.bd));        
        this.bd.getJogadores().add(j10);
        
        Jogador j11 = new Jogador(11, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 11", EnumPosicao.AT, 29, 11, EnumHabilidade.Drible, EnumHabilidade.Drible, EnumStatus.LevementeLesionado, "Não", this.bd, 5000);
        j11.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 1", 50, new Treinador("Treinador 1", 50, 45), new Estadio("Estadio 11"), Color.yellow, Color.YELLOW, this.bd));
        this.bd.getJogadores().add(j11);
        
        Jogador j12 = new Jogador(12, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 12", EnumPosicao.GL, 22, 12, EnumHabilidade.Elasticidade, EnumHabilidade.SaidaGol, EnumStatus.Suspenso, "Sim", this.bd, 5000);
        j12.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 2", 50, new Treinador("Treinador 2", 50, 45), new Estadio("Estadio 12"), Color.GREEN, Color.BLUE, this.bd));
        this.bd.getJogadores().add(j12);
        
        Jogador j13 = new Jogador(13, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 13", EnumPosicao.AT, 24, 13, EnumHabilidade.Drible, EnumHabilidade.Finalização, EnumStatus.EmAlta, "Não", this.bd, 5000);
        j13.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 3", 50, new Treinador("Treinador 3", 50, 45), new Estadio("Estadio 13"), Color.DARK_GRAY, Color.GRAY, this.bd));
        this.bd.getJogadores().add(j13);
        
        Jogador j14 = new Jogador(14, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 14", EnumPosicao.AT, 26, 14, EnumHabilidade.Velocidade, EnumHabilidade.Finalização, EnumStatus.EmAlta, "Sim", this.bd, 5000);
        j14.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 4", 50, new Treinador("Treinador 4", 50, 45), new Estadio("Estadio 14"), Color.WHITE, Color.BLACK, this.bd));
        this.bd.getJogadores().add(j14);
       
        Jogador j15 = new Jogador(15, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 15", EnumPosicao.MC, 28, 15, EnumHabilidade.Armação, EnumHabilidade.Passe, EnumStatus.EmAlta, "sim", this.bd, 5000);
        j15.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 5", 50, new Treinador("Treinador 5", 50, 45), new Estadio("Estadio 15"), Color.GREEN, Color.green, this.bd));        
        this.bd.getJogadores().add(j15);
        
        Jogador j16 = new Jogador(16, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 16", EnumPosicao.MC, 24, 16, EnumHabilidade.Finalização, EnumHabilidade.Velocidade, EnumStatus.EmAlta, "Sim", this.bd, 5000);
        j16.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 1", 50, new Treinador("Treinador 1", 50, 45), new Estadio("Estadio 16"), Color.red, Color.GRAY, this.bd));
        this.bd.getJogadores().add(j16);
       
        Jogador j17 = new Jogador(17, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 17", EnumPosicao.ZG, 23, 17, EnumHabilidade.Desarme, EnumHabilidade.Marcação, EnumStatus.EmAlta, "Não", this.bd, 5000);
        j17.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 2", 50, new Treinador("Treinador 2", 50, 45), new Estadio("Estadio 17"), Color.cyan, Color.WHITE, this.bd));
        this.bd.getJogadores().add(j17);
        
        Jogador j18 = new Jogador(18, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 18", EnumPosicao.ZG, 21, 18, EnumHabilidade.Velocidade, EnumHabilidade.Marcação, EnumStatus.EmAlta, "Sim", this.bd, 5000);
        j18.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 3", 50, new Treinador("Treinador 3", 50, 45), new Estadio("Estadio 18"), Color.PINK, Color.YELLOW, this.bd));
        this.bd.getJogadores().add(j18);
        
        Jogador j19 = new Jogador(19, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 19", EnumPosicao.LT, 20, 19, EnumHabilidade.Resistencia, EnumHabilidade.Cabeceio, EnumStatus.EmAlta, "Sim", this.bd, 5000);
        j19.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 4", 50, new Treinador("Treinador 4", 50, 45), new Estadio("Estadio 19"), Color.yellow, Color.BLUE, this.bd));
        this.bd.getJogadores().add(j19);   
        
        Jogador j20 = new Jogador(20, new ImageIcon(getClass().getResource("/resources/rostos/jogador/2.png")),"Teste 20", EnumPosicao.LT, 20, 20, EnumHabilidade.Velocidade, EnumHabilidade.Finalização, EnumStatus.EmAlta, "Sim", this.bd, 5000);
        j20.setTime(new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 5", 50, new Treinador("Treinador 5", 50, 45), new Estadio("Estadio 20"), Color.BLUE, Color.WHITE, this.bd));
        this.bd.getJogadores().add(j20);
    }    
}