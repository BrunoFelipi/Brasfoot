package src;

import src.titulos.Titulo;
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
    private int nivel;
    private int idade;
    private Pais pais;
    private List<Titulo> titulos;

    public Treinador(int id, String nome, int nivel, int idade, Pais pais) {
        setId(id);
        setNome(nome);
        setNivel(nivel);
        setIdade(idade);
        setPais(pais);
        this.titulos = new ArrayList<>();
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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
    
    public String toString(){
        return getNome();
    }
}