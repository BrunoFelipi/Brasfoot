package teste;

import BancoDeDados.BancoDeDados;
import java.awt.Color;
import javax.swing.ImageIcon;
import src.Estadio;
import src.Pais;
import src.Time;
import src.Treinador;
import src.enumeracao.EnumEstado;
import src.enumeracao.EnumNivel;

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
        
        ImageIcon img24 = new ImageIcon(getClass().getResource("/resources/escudo/24/1.png"));
        ImageIcon img32 = new ImageIcon(getClass().getResource("/resources/escudo/32/1.png"));
        ImageIcon img128 = new ImageIcon(getClass().getResource("/resources/escudo/128/1.png"));
        
        Pais p1 = new Pais("Brasil");
        
        Time t1 = new Time(img24, img32, img128, 1, "Time 1", EnumNivel.Nacional, new Treinador(1, "Treinador 1", 50, 40, p1), new Estadio("Estadio 1"), Color.BLUE, Color.GRAY, this.bd, EnumEstado.Acre);
        this.bd.getTimes().add(t1);
        Time t2 = new Time(img24, img32, img128, 2, "Time 2", EnumNivel.Estadual, new Treinador(2, "Treinador 2", 50, 40, p1), new Estadio("Estadio 2"), Color.ORANGE, Color.yellow, this.bd, EnumEstado.Acre);
        this.bd.getTimes().add(t2);
        Time t3 = new Time(img24, img32, img128, 2, "Time 3", EnumNivel.Nacional, new Treinador(3, "Treinador 3", 50, 40, p1), new Estadio("Estadio 3"), Color.CYAN, Color.BLACK,this.bd, EnumEstado.Acre);
        this.bd.getTimes().add(t3);
        Time t4 = new Time(img24, img32, img128, 2,  "Time 4", EnumNivel.Mundial, new Treinador(4, "Treinador 4", 50, 40, p1), new Estadio("Estadio 4"), Color.green, Color.GRAY,this.bd, EnumEstado.Acre);
        this.bd.getTimes().add(t4);
        Time t5 = new Time(img24, img32, img128, 2,  "Time 5", EnumNivel.Nacional, new Treinador(5, "Treinador 5", 50, 40, p1), new Estadio("Estadio 5"), Color.DARK_GRAY, Color.BLACK,this.bd, EnumEstado.Acre);
        this.bd.getTimes().add(t5);
        Time t6 = new Time(img24, img32, img128, 2,  "Time 6", EnumNivel.Nacional, new Treinador(6, "Treinador 6", 50, 40, p1), new Estadio("Estadio 6"), Color.YELLOW, Color.WHITE,this.bd, EnumEstado.Acre);
        this.bd.getTimes().add(t6);
        Time t7 = new Time(img24, img32, img128, 2,  "Time 7", EnumNivel.Nacional, new Treinador(7, "Treinador 7", 50, 40, p1), new Estadio("Estadio 7"), Color.PINK, Color.BLUE,this.bd, EnumEstado.Acre);
        this.bd.getTimes().add(t7);
        Time t8 = new Time(img24, img32, img128, 2,  "Time 8", EnumNivel.Municipal, new Treinador(8, "Treinador 8", 50, 40, p1), new Estadio("Estadio 8"), Color.RED, Color.WHITE,this.bd, EnumEstado.Acre);
        this.bd.getTimes().add(t8);
        Time t9 = new Time(img24, img32, img128, 2,  "Time 9", EnumNivel.Nacional, new Treinador(9, "Treinador 9", 50, 40, p1), new Estadio("Estadio 9"), Color.BLUE, Color.RED,this.bd, EnumEstado.Acre);
        this.bd.getTimes().add(t9);
        Time t10 = new Time(img24, img32, img128, 2,  "Time 10", EnumNivel.Continental, new Treinador(10, "Treinador 10", 50, 40, p1), new Estadio("Estadio 10"), Color.CYAN, Color.MAGENTA,this.bd, EnumEstado.Acre);
        this.bd.getTimes().add(t10);    
    }
}