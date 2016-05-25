package src;

import java.io.Serializable;

/**
 *
 * @author Bruno
 */
public class Juiz implements Serializable {
    
    private int id;
    private String nome;
    private int idade;
    private int forca;
    private String nacionalidade;

    public Juiz(String nome, int idade, int forca, String nacionalidade) {
        setNome(nome);
        setIdade(idade);
        setForca(forca);
        setNacionalidade(nacionalidade);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}