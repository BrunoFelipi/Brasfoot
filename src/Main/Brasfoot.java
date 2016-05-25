/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import BancoDeDados.BancoDeDados;
import Frames.Entrada;
import Frames.JanelaPrincipal;
import Frames.Pesquisa.PesquisarJogador;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Bruno
 */
public class Brasfoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        BancoDeDados bd = new BancoDeDados();
        
        PesquisarJogador p = new PesquisarJogador(new JanelaPrincipal(bd));
        p.setVisible(true);
//        Entrada e = new Entrada(bd);
//        e.setVisible(true);
    }
    
}
