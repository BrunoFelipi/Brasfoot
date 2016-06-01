package teste;

import BancoDeDados.BancoDeDados;
import java.awt.Color;
import javax.swing.ImageIcon;
import src.Estadio;
import src.Time;
import src.Treinador;

/**
 *
 * @author Bruno
 */
public class CargaTimes {

    private BancoDeDados bd;

    public CargaTimes(BancoDeDados bd) {
        this.bd = bd;
    }
    
    public void inserirTimes(){        
        Time t1 = new Time(new ImageIcon(getClass().getResource("/resources/escudo/128/1.png")), "Time 1", 30, new Treinador("Treinador 1", 50, 40), new Estadio("Estadio 1"), Color.BLUE, Color.GRAY, this.bd);
        this.bd.getTimes().add(t1);
        Time t2 = new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 2", 30, new Treinador("Treinador 2", 50, 40), new Estadio("Estadio 2"), Color.ORANGE, Color.yellow,this.bd);
        this.bd.getTimes().add(t2);
        Time t3 = new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 3", 30, new Treinador("Treinador 3", 50, 40), new Estadio("Estadio 3"), Color.CYAN, Color.BLACK,this.bd);
        this.bd.getTimes().add(t3);
        Time t4 = new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 4", 30, new Treinador("Treinador 4", 50, 40), new Estadio("Estadio 4"), Color.green, Color.GRAY,this.bd);
        this.bd.getTimes().add(t4);
        Time t5 = new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 5", 30, new Treinador("Treinador 5", 50, 40), new Estadio("Estadio 5"), Color.DARK_GRAY, Color.BLACK,this.bd);
        this.bd.getTimes().add(t5);
        Time t6 = new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 6", 30, new Treinador("Treinador 6", 50, 40), new Estadio("Estadio 6"), Color.YELLOW, Color.WHITE,this.bd);
        this.bd.getTimes().add(t6);
        Time t7 = new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 7", 30, new Treinador("Treinador 7", 50, 40), new Estadio("Estadio 7"), Color.PINK, Color.BLUE,this.bd);
        this.bd.getTimes().add(t7);
        Time t8 = new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 8", 30, new Treinador("Treinador 8", 50, 40), new Estadio("Estadio 8"), Color.RED, Color.WHITE,this.bd);
        this.bd.getTimes().add(t8);
        Time t9 = new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 9", 30, new Treinador("Treinador 9", 50, 40), new Estadio("Estadio 9"), Color.BLUE, Color.RED,this.bd);
        this.bd.getTimes().add(t9);
        Time t10 = new Time(new ImageIcon(getClass().getResource("/resources/camisa/x128/1.png")), "Time 10", 30, new Treinador("Treinador 10", 50, 40), new Estadio("Estadio 10"), Color.CYAN, Color.MAGENTA,this.bd);
        this.bd.getTimes().add(t10);    
    }
}