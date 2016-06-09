package src.titulos;

import java.io.Serializable;
import src.Time;
import src.enumeracao.EnumTitulo;

/**
 * 
 * @author Bruno
 */
public class Titulo implements Serializable {
    
    private EnumTitulo enumTitulo;
    private Time time;
    private float premiacao;
    private int ano;

    public Titulo(EnumTitulo enumTitulo, Time time, float premiacao, int ano) {
        setEnumTitulo(enumTitulo);
        setTime(time);
        setPremiacao(premiacao);
        setAno(ano);
    }

    public EnumTitulo getEnumTitulo() {
        return enumTitulo;
    }

    public void setEnumTitulo(EnumTitulo enumTitulo) {
        this.enumTitulo = enumTitulo;
    }
    
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public double getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(float premiacao) {
        this.premiacao = premiacao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}