package src;

import java.io.Serializable;

/**
 *
 * @author Bruno
 */
public class Titulo implements Serializable {
    
    private String nome;
    private Time time;
    
    public Titulo(String nome, Time time) {
        this.nome = nome;
        this.time = time;
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
}