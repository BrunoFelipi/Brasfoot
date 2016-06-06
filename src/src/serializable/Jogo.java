package src.serializable;

import BancoDeDados.BancoDeDados;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno.souza
 */
public class Jogo {
    
    public static BancoDeDados carregar(String caminho) {
        
        ObjectInputStream is = null;
        try {
            File f = new File(caminho);
            is = new ObjectInputStream(new FileInputStream(f));
            BancoDeDados bd = (BancoDeDados)is.readObject();
            is.close();
            return bd;
        } catch (IOException ex) {
            Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    public static void salvar(String caminho, BancoDeDados bd) {
        
        ObjectOutputStream oos = null;
        try {
            File f = new File(caminho);
            
            File cam = new File(System.getProperty("user.home") + "\\Documents\\Fussball");
            
            if(!cam.exists()){
                cam.mkdirs();
            }
            
            oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(bd);
            oos.flush();
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }  
    
}
