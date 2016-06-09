package src.titulos;

import src.Time;
import src.enumeracao.EnumTitulo;

/**
 *
 * @author Bruno
 */
public class Estadual extends Titulo{

    public Estadual(Time time, int ano) {
        super(EnumTitulo.Estadual, time, 100, ano);
    }

    
    
}
