package teste;

import BancoDeDados.BancoDeDados;
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
        Time t1 = new Time("Time 1", 30, new Treinador("Treinador 1", 50, 40), new Estadio("Estadio 1"));
        this.bd.getTimes().add(t1);
        Time t2 = new Time("Time 2", 30, new Treinador("Treinador 2", 50, 40), new Estadio("Estadio 2"));
        this.bd.getTimes().add(t2);
        Time t3 = new Time("Time 3", 30, new Treinador("Treinador 3", 50, 40), new Estadio("Estadio 3"));
        this.bd.getTimes().add(t3);
        Time t4 = new Time("Time 4", 30, new Treinador("Treinador 4", 50, 40), new Estadio("Estadio 4"));
        this.bd.getTimes().add(t4);
        Time t5 = new Time("Time 5", 30, new Treinador("Treinador 5", 50, 40), new Estadio("Estadio 5"));
        this.bd.getTimes().add(t5);
        Time t6 = new Time("Time 6", 30, new Treinador("Treinador 6", 50, 40), new Estadio("Estadio 6"));
        this.bd.getTimes().add(t6);
        Time t7 = new Time("Time 7", 30, new Treinador("Treinador 7", 50, 40), new Estadio("Estadio 7"));
        this.bd.getTimes().add(t7);
        Time t8 = new Time("Time 8", 30, new Treinador("Treinador 8", 50, 40), new Estadio("Estadio 8"));
        this.bd.getTimes().add(t8);
        Time t9 = new Time("Time 9", 30, new Treinador("Treinador 9", 50, 40), new Estadio("Estadio 9"));
        this.bd.getTimes().add(t9);
        Time t10 = new Time("Time 10", 30, new Treinador("Treinador 10", 50, 40), new Estadio("Estadio 10"));
        this.bd.getTimes().add(t10);        
    }
}