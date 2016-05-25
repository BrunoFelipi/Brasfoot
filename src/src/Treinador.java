package src;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno
 */
public class Treinador implements Serializable {
    
    private int id;
    private String nome;
    private int forca;
    private int idade;
    private List<Titulo> titulos;

    public Treinador(String nome, int forca, int idade) {
        setNome(nome);
        setForca(forca);
        setIdade(idade);
        this.titulos = new ArrayList<>();
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

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Titulo> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<Titulo> titulos) {
        this.titulos = titulos;
    }
        
    public void addTitulo(Titulo t){
        getTitulos().add(t);
    }
}