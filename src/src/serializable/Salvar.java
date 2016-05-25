package src.serializable;

import BancoDeDados.BancoDeDados;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno.souza
 */
public class Salvar {

    public void salvar(String caminho) {
        
        ObjectOutputStream oos = null;
        try {
            File f = new File(caminho);
            oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(BancoDeDados.class);
            oos.flush();
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(Salvar.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Salvar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    
}