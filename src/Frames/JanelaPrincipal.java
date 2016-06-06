package Frames;

import BancoDeDados.BancoDeDados;
import java.text.SimpleDateFormat;
import java.util.Date;
import src.serializable.Jogo;

/**
 *
 * @author Bruno
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    private BancoDeDados bd;
    private Date data;
    private SimpleDateFormat df;
    private String localSalvamento;
    
    public JanelaPrincipal(BancoDeDados bd) {
        initComponents();
        this.bd = bd;
        this.data = new Date();
        this.df = new SimpleDateFormat("dd-MM-yyyy_HH-mm");
        this.localSalvamento = System.getProperty("user.home") + "\\Documents\\Fussball\\Fussball-" + df.format(data) + ".dat";
    }

    public BancoDeDados getBd() {
        return bd;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSalvarJogo = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelFundo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Fussball");
        jMenu1.setOpaque(true);
        jMenu1.setPreferredSize(new java.awt.Dimension(50, 40));

        menuSalvarJogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuSalvarJogo.setText("Salvar Jogo");
        menuSalvarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalvarJogoActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalvarJogo);

        jMenuBar1.add(jMenu1);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setBorder(null);
        jMenu4.setText("Pesquisar");
        jMenu4.setOpaque(true);

        jMenuItem1.setText("Jogador");
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Treinador");
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Juíz");
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(255, 255, 255));
        jMenu5.setBorder(null);
        jMenu5.setText("Estádio");
        jMenu5.setOpaque(true);

        jMenuItem6.setText("Reformar");
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Bilheteria");
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(255, 255, 255));
        jMenu6.setBorder(null);
        jMenu6.setText("Torcedores");
        jMenu6.setOpaque(true);

        jMenuItem4.setText("Visualizar Torcedores");
        jMenu6.add(jMenuItem4);

        jMenuItem5.setText("Configurações");
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setToolTipText("");
        jMenu3.setEnabled(false);
        jMenu3.setOpaque(true);
        jMenu3.setPreferredSize(new java.awt.Dimension(100, 19));
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalvarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalvarJogoActionPerformed

        Jogo.salvar(this.localSalvamento, this.bd); 
        
    }//GEN-LAST:event_menuSalvarJogoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem menuSalvarJogo;
    private javax.swing.JPanel painelFundo;
    // End of variables declaration//GEN-END:variables
}
