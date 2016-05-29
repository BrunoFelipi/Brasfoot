package Main;

import BancoDeDados.BancoDeDados;
import Frames.JanelaPrincipal;
import Frames.Pesquisa.PesquisarJogador;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import teste.CargaJogadores;
import teste.CargaTimes;

/**
 *
 * @author Bruno
 */
public class Brasfoot {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        BancoDeDados bd = new BancoDeDados();
        
        CargaJogadores c = new CargaJogadores(bd);
        c.inserirJogadores();
        CargaTimes t = new CargaTimes(bd);
        t.inserirTimes();
        
        PesquisarJogador p = new PesquisarJogador(new JanelaPrincipal(bd), bd);
        p.setVisible(true);
//        Entrada e = new Entrada(bd);
//        e.setVisible(true);
    }
    
}
