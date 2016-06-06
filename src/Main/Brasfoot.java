package Main;

import BancoDeDados.BancoDeDados;
import Frames.Jogador.CadastrarJogador;
import Frames.EditarTimes;
import Frames.Entrada;
import Frames.Pesquisa.PesquisarJogador;
import java.awt.Image;
import javax.swing.ImageIcon;
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
        
        CargaTimes t = new CargaTimes(bd);
        t.inserirTimes();
        CargaJogadores c = new CargaJogadores(bd);
        c.inserirJogadores();
        
        
//        CadastrarJogador cj = new CadastrarJogador(null, bd, bd.getTimes().get(0));
//        cj.setVisible(true);
        
//        
//        PesquisarJogador p = new PesquisarJogador(null, bd);
//        p.setVisible(true);
//        EditarTimes et = new EditarTimes(null, bd);
//        et.setVisible(true);
                
        Entrada e = new Entrada(bd);
        e.setVisible(true);
    }
    
}
