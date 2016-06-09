package src.titulos;

import src.Time;
import src.enumeracao.EnumTitulo;

/**
 *
 * @author Bruno
 */

public class CopaBrasil extends Titulo{

    public CopaBrasil(Time time, int ano) {
        super(EnumTitulo.CopaDoBrasil, time, 100, ano);
    }
}