package src.titulos;

import src.Time;

/**
 *
 * @author Bruno
 */
public class Estadual extends Titulo{

    public Estadual(Time time, int ano) {
        super(time.getEstado(), time, 100, ano);
    }

    
    
}
