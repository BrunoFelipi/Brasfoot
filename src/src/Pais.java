package src;

import javax.swing.ImageIcon;

/**
 *
 * @author bruno.souza
 */
public class Pais {

    private ImageIcon bandeira;
    private String nome;

    public Pais(String nome) {        
        this.nome = nome;
        setBandeira();
    }    

    public ImageIcon getBandeira() {
        return bandeira;
    }

    public void setBandeira() {        
        this.bandeira = new ImageIcon(getClass().getResource("/resources/bandeiras/paises/" + getNome() + ".png"));               
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString(){
        return getNome();
    }
}