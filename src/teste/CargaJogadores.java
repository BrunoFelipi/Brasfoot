package teste;

import BancoDeDados.BancoDeDados;
import java.awt.Color;
import javax.swing.ImageIcon;
import src.Estadio;
import src.Jogador;
import src.Pais;
import src.Time;
import src.Treinador;
import src.enumeracao.EnumEstado;
import src.enumeracao.EnumHabilidade;
import src.enumeracao.EnumLado;
import src.enumeracao.EnumNivel;
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
        
        ImageIcon img24Time = new ImageIcon(getClass().getResource("/resources/escudo/24/1.png"));
        ImageIcon img32Time = new ImageIcon(getClass().getResource("/resources/escudo/32/1.png"));
        ImageIcon img128Time = new ImageIcon(getClass().getResource("/resources/escudo/128/1.png"));
        
        ImageIcon img16Jog = new ImageIcon(getClass().getResource("/resources/rostos/jogador/16/4.png"));
        ImageIcon img24Jog = new ImageIcon(getClass().getResource("/resources/rostos/jogador/24/4.png"));
        ImageIcon img128Jog = new ImageIcon(getClass().getResource("/resources/rostos/jogador/128/4.png"));

        Pais p1 = new Pais("Brasil");
        
        Treinador t1 = new Treinador(1, "Treinador 1", 50, 45, p1);
        Treinador t2 = new Treinador(2, "Treinador 2", 50, 45, p1);
        Treinador t3 = new Treinador(3, "Treinador 3", 50, 45, p1);
        Treinador t4 = new Treinador(4, "Treinador 4", 50, 45, p1);
        Treinador t5 = new Treinador(5, "Treinador 5", 50, 45, p1);
                        
        Jogador j1 = new Jogador(1, img16Jog, img24Jog, img128Jog, "Teste 1", EnumPosicao.GL, 20, 1, EnumHabilidade.Reflexo, EnumHabilidade.DefesaPenalti, EnumStatus.EmAlta, false, this.bd, 5000, false, EnumLado.Esquerdo);                
        j1.setTime(new Time(img24Time, img32Time, img128Time, 1, "Time 1", EnumNivel.Continental, t1, new Estadio("Estadio 1"), Color.BLUE, Color.GRAY, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j1);
        
        Jogador j2 = new Jogador(2, img16Jog, img24Jog, img128Jog, "Teste 2", EnumPosicao.LT, 21, 2, EnumHabilidade.Cruzamento, EnumHabilidade.Passe, EnumStatus.EmAlta, false, this.bd, 5000, false, EnumLado.Direito);
        j2.setTime(new Time(img24Time, img32Time, img128Time, 2,  "Time 2", EnumNivel.Continental, t2, new Estadio("Estadio 2"), Color.ORANGE, Color.yellow, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j2);
        
        Jogador j3 = new Jogador(3, img16Jog, img24Jog, img128Jog, "Teste 3", EnumPosicao.ZG, 21, 3, EnumHabilidade.Cabeceio, EnumHabilidade.Marcação, EnumStatus.LevementeLesionado, true, this.bd, 5000, false, EnumLado.Direito);
        j3.setTime(new Time(img24Time, img32Time, img128Time, 3,  "Time 3", EnumNivel.Continental, t3, new Estadio("Estadio 3"), Color.CYAN, Color.BLACK, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j3);
        
        Jogador j4 = new Jogador(4, img16Jog, img24Jog, img128Jog, "Teste 4", EnumPosicao.ZG, 22, 4, EnumHabilidade.Desarme, EnumHabilidade.Cabeceio, EnumStatus.DepartamentoMedico, false, this.bd, 5000, false, EnumLado.Direito);
        j4.setTime(new Time(img24Time, img32Time, img128Time, 4,  "Time 4", EnumNivel.Continental, t4, new Estadio("Estadio 4"), Color.green, Color.GRAY, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j4);
                
        Jogador j5 = new Jogador(5, img16Jog, img24Jog, img128Jog, "Teste 5", EnumPosicao.MC, 23, 5, EnumHabilidade.Passe, EnumHabilidade.Finalização, EnumStatus.EmAlta, false, this.bd, 5000, false, EnumLado.Esquerdo);
        j5.setTime(new Time(img24Time, img32Time, img128Time, 5,  "Time 5", EnumNivel.Continental, t5, new Estadio("Estadio 5"), Color.DARK_GRAY, Color.BLACK, this.bd, EnumEstado.Acre));        
        this.bd.getJogadores().add(j5);
        
        Jogador j6 = new Jogador(6, img16Jog, img24Jog, img128Jog, "Teste 6", EnumPosicao.LT, 24, 6, EnumHabilidade.Resistencia, EnumHabilidade.BolaParada, EnumStatus.EmAlta, true, this.bd, 5000, false, EnumLado.Direito);
        j6.setTime(new Time(img24Time, img32Time, img128Time, 6,  "Time 1", EnumNivel.Nacional, t1, new Estadio("Estadio 6"), Color.YELLOW, Color.WHITE, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j6);
        
        Jogador j7 = new Jogador(7, img16Jog, img24Jog, img128Jog, "Teste 7", EnumPosicao.MC, 25, 7, EnumHabilidade.Armação, EnumHabilidade.Armação, EnumStatus.DepartamentoMedico, false, this.bd, 5000, false, EnumLado.Direito);
        j7.setTime(new Time(img24Time, img32Time, img128Time, 7,  "Time 2", EnumNivel.Nacional, t2, new Estadio("Estadio 7"), Color.PINK, Color.BLUE, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j7);
        
        Jogador j8 = new Jogador(8, img16Jog, img24Jog, img128Jog, "Teste 8", EnumPosicao.MC, 26, 8, EnumHabilidade.Velocidade, EnumHabilidade.Finalização, EnumStatus.EmAlta, true, this.bd, 5000, false, EnumLado.Direito);
        j8.setTime(new Time(img24Time, img32Time, img128Time, 8,  "Time 3", EnumNivel.Nacional, t3, new Estadio("Estadio 8"), Color.RED, Color.WHITE, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j8);
        
        Jogador j9 = new Jogador(9, img16Jog, img24Jog, img128Jog, "Teste 9", EnumPosicao.AT, 27, 9, EnumHabilidade.Velocidade, EnumHabilidade.Finalização, EnumStatus.EmAlta, true, this.bd, 5000, false, EnumLado.Direito);
        j9.setTime(new Time(img24Time, img32Time, img128Time, 9,  "Time 4", EnumNivel.Estadual, t4, new Estadio("Estadio 9"), Color.BLUE, Color.RED, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j9);
        
        Jogador j10 = new Jogador(10, img16Jog, img24Jog, img128Jog, "Teste 10", EnumPosicao.MC, 28, 10, EnumHabilidade.Armação, EnumHabilidade.Velocidade, EnumStatus.EmAlta, true, this.bd, 5000, false, EnumLado.Direito);
        j10.setTime(new Time(img24Time, img32Time, img128Time, 10,  "Time 5", EnumNivel.Continental, t5, new Estadio("Estadio 10"), Color.CYAN, Color.MAGENTA, this.bd, EnumEstado.Acre));        
        this.bd.getJogadores().add(j10);
        
        Jogador j11 = new Jogador(11, img16Jog, img24Jog, img128Jog, "Teste 11", EnumPosicao.AT, 29, 11, EnumHabilidade.Drible, EnumHabilidade.Drible, EnumStatus.LevementeLesionado, false, this.bd, 5000, true, EnumLado.Direito);
        j11.setTime(new Time(img24Time, img32Time, img128Time, 11,  "Time 1", EnumNivel.Municipal, t1, new Estadio("Estadio 11"), Color.yellow, Color.YELLOW, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j11);
        
        Jogador j12 = new Jogador(12, img16Jog, img24Jog, img128Jog, "Teste 12", EnumPosicao.GL, 22, 12, EnumHabilidade.Elasticidade, EnumHabilidade.SaidaGol, EnumStatus.Suspenso, true, this.bd, 5000, true, EnumLado.Direito);
        j12.setTime(new Time(img24Time, img32Time, img128Time, 12,  "Time 2", EnumNivel.Estadual, t2, new Estadio("Estadio 12"), Color.GREEN, Color.BLUE, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j12);
        
        Jogador j13 = new Jogador(13, img16Jog, img24Jog, img128Jog, "Teste 13", EnumPosicao.AT, 24, 13, EnumHabilidade.Drible, EnumHabilidade.Finalização, EnumStatus.EmAlta, false, this.bd, 5000, true, EnumLado.Direito);
        j13.setTime(new Time(img24Time, img32Time, img128Time, 13,  "Time 3", EnumNivel.Mundial, t3, new Estadio("Estadio 13"), Color.DARK_GRAY, Color.GRAY, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j13);
        
        Jogador j14 = new Jogador(14, img16Jog, img24Jog, img128Jog, "Teste 14", EnumPosicao.AT, 26, 14, EnumHabilidade.Velocidade, EnumHabilidade.Finalização, EnumStatus.EmAlta, true, this.bd, 5000, true, EnumLado.Direito);
        j14.setTime(new Time(img24Time, img32Time, img128Time, 14,  "Time 4", EnumNivel.Continental, t4, new Estadio("Estadio 14"), Color.WHITE, Color.BLACK, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j14);
       
        Jogador j15 = new Jogador(15, img16Jog, img24Jog, img128Jog, "Teste 15", EnumPosicao.MC, 28, 15, EnumHabilidade.Armação, EnumHabilidade.Passe, EnumStatus.EmAlta, true, this.bd, 5000, true, EnumLado.Direito);
        j15.setTime(new Time(img24Time, img32Time, img128Time, 15,  "Time 5", EnumNivel.Nacional, t5, new Estadio("Estadio 15"), Color.GREEN, Color.green, this.bd, EnumEstado.Acre));        
        this.bd.getJogadores().add(j15);
        
        Jogador j16 = new Jogador(16, img16Jog, img24Jog, img128Jog, "Teste 16", EnumPosicao.MC, 24, 16, EnumHabilidade.Finalização, EnumHabilidade.Velocidade, EnumStatus.EmAlta, true, this.bd, 5000, true, EnumLado.Direito);
        j16.setTime(new Time(img24Time, img32Time, img128Time, 16,  "Time 1", EnumNivel.Continental, t1, new Estadio("Estadio 16"), Color.red, Color.GRAY, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j16);
       
        Jogador j17 = new Jogador(17, img16Jog, img24Jog, img128Jog, "Teste 17", EnumPosicao.ZG, 23, 17, EnumHabilidade.Desarme, EnumHabilidade.Marcação, EnumStatus.EmAlta, false, this.bd, 5000, true, EnumLado.Direito);
        j17.setTime(new Time(img24Time, img32Time, img128Time, 17,  "Time 2", EnumNivel.Estadual, t2, new Estadio("Estadio 17"), Color.cyan, Color.WHITE, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j17);
        
        Jogador j18 = new Jogador(18, img16Jog, img24Jog, img128Jog, "Teste 18", EnumPosicao.ZG, 21, 18, EnumHabilidade.Velocidade, EnumHabilidade.Marcação, EnumStatus.EmAlta, true, this.bd, 5000, true, EnumLado.Direito);
        j18.setTime(new Time(img24Time, img32Time, img128Time, 18,  "Time 3", EnumNivel.Municipal , t3, new Estadio("Estadio 18"), Color.PINK, Color.YELLOW, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j18);
        
        Jogador j19 = new Jogador(19, img16Jog, img24Jog, img128Jog, "Teste 19", EnumPosicao.LT, 20, 19, EnumHabilidade.Resistencia, EnumHabilidade.Cabeceio, EnumStatus.EmAlta, true, this.bd, 5000, true, EnumLado.Direito);
        j19.setTime(new Time(img24Time, img32Time, img128Time, 19,  "Time 4", EnumNivel.Nacional, t4, new Estadio("Estadio 19"), Color.yellow, Color.BLUE, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j19);   
        
        Jogador j20 = new Jogador(20, img16Jog, img24Jog, img128Jog, "Teste 20", EnumPosicao.LT, 20, 20, EnumHabilidade.Velocidade, EnumHabilidade.Finalização, EnumStatus.EmAlta, true, this.bd, 5000, true, EnumLado.Direito);
        j20.setTime(new Time(img24Time, img32Time, img128Time, 20,  "Time 5", EnumNivel.Continental, t5, new Estadio("Estadio 20"), Color.BLUE, Color.WHITE, this.bd, EnumEstado.Acre));
        this.bd.getJogadores().add(j20);
        
        this.bd.getTimes().get(0).addJogadorReserva(j1);
        this.bd.getTimes().get(0).addJogadorReserva(j2);
        this.bd.getTimes().get(0).addJogadorReserva(j3);
        this.bd.getTimes().get(0).addJogadorReserva(j4);
        this.bd.getTimes().get(0).addJogadorReserva(j5);
        this.bd.getTimes().get(0).addJogadorReserva(j6);
        this.bd.getTimes().get(0).addJogadorReserva(j7);
        this.bd.getTimes().get(0).addJogadorReserva(j8);
        this.bd.getTimes().get(0).addJogadorReserva(j9);
        this.bd.getTimes().get(0).addJogadorReserva(j10);
        
        this.bd.getTimes().get(0).addJogadorTitular(j1);
        this.bd.getTimes().get(0).addJogadorTitular(j2);
        this.bd.getTimes().get(0).addJogadorTitular(j3);
        this.bd.getTimes().get(0).addJogadorTitular(j4);
        
        this.bd.getTreinadores().add(t1);
        this.bd.getTreinadores().add(t2);
        this.bd.getTreinadores().add(t3);
        this.bd.getTreinadores().add(t4);
        this.bd.getTreinadores().add(t5);
        
    }    
}