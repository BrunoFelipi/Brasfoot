package src.titulos;

import src.Time;
import src.enumeracao.EnumTitulo;

/**
 *
 * @author Bruno
 */
public class CampeonatoBrasileiro extends Titulo{

    public CampeonatoBrasileiro(Time time, int ano) {
        super(EnumTitulo.CampeonatoBrasileiro, time, 1000, ano);
    }
}