/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import BancoDeDados.BancoDeDados;
import Frames.JanelaPrincipal;

/**
 *
 * @author Bruno
 */
public class Brasfoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BancoDeDados bd = new BancoDeDados();
        JanelaPrincipal jp = new JanelaPrincipal(bd);
        jp.setVisible(true);
        
    }
    
}
