package src.titulos;

import java.io.Serializable;
import src.Time;

/**
 * 
 * @author Bruno
 */
public class Titulo <T> implements Serializable {
    
    private Enum<T> nome;
    private Time time;
    private float premiacao;
    private int ano;

    public Titulo(Enum<T> nome, Time time, float premiacao, int ano) {
        setNome(nome);
        setTime(time);
        setPremiacao(premiacao);
        setAno(ano);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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