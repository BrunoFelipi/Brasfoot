package src;

/**
 *
 * @author bruno.souza
 */
public class Estadio {

    private String nome;
    private int qtdGeral;
    private int qtdArquibancada;
    private int qtdCadeiras;
    private int qtdCamarote;
    private int capacidadeTotal;

    public Estadio(String nome) {
        this.nome = nome;
        this.qtdGeral = 0;
        this.qtdArquibancada = 0;
        this.qtdCadeiras = 0;
        this.qtdCamarote = 0;
        this.capacidadeTotal = 0;
    }

    public Estadio(String nome, int qtdGeral, int qtdArquibancada, int qtdCadeiras, int qtdCamarote) {
        this.nome = nome;
        this.qtdGeral = qtdGeral;
        this.qtdArquibancada = qtdArquibancada;
        this.qtdCadeiras = qtdCadeiras;
        this.qtdCamarote = qtdCamarote;        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdGeral() {
        return qtdGeral;
    }

    public void setQtdGeral(int qtdGeral) {
        this.qtdGeral = qtdGeral;
    }

    public int getQtdArquibancada() {
        return qtdArquibancada;
    }

    public void setQtdArquibancada(int qtdArquibancada) {
        this.qtdArquibancada = qtdArquibancada;
    }

    public int getQtdCadeiras() {
        return qtdCadeiras;
    }

    public void setQtdCadeiras(int qtdCadeiras) {
        this.qtdCadeiras = qtdCadeiras;
    }

    public int getQtdCamarote() {
        return qtdCamarote;
    }

    public void setQtdCamarote(int qtdCamarote) {
        this.qtdCamarote = qtdCamarote;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal() {
        this.capacidadeTotal = getQtdGeral() + getQtdArquibancada() + getQtdCadeiras() + getQtdCamarote();
    }    
}