package src.serializable;

import BancoDeDados.BancoDeDados;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno.souza
 */
public class Carregar {
    
    public void carregar(String caminho) {
        
        ObjectInputStream is = null;
        try {
            File f = new File(caminho);
            is = new ObjectInputStream(new FileInputStream(f));
            BancoDeDados bd = (BancoDeDados)is.readObject();
            is.close();
        } catch (IOException ex) {
            Logger.getLogger(Carregar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Carregar.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(Carregar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
