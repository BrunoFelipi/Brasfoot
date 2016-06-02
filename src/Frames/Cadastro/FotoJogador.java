package Frames.Cadastro;

import Frames.Alterar.AlterarJogador;
import java.awt.Color;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/**
 *
 * @author bruno.souza
 */
public class FotoJogador extends javax.swing.JDialog {

    private DefaultListModel listModel;
    private DefaultListCellRenderer listRenderer;
    private CadastrarJogador cj;
    private AlterarJogador aj;
    
    public FotoJogador(java.awt.Frame parent, CadastrarJogador cj) {
        super(parent, true);
        initComponents();
        this.listModel = new DefaultListModel();
        this.listaImagens.setModel(listModel);        
        this.listRenderer = (DefaultListCellRenderer) this.listaImagens.getCellRenderer();
        this.listRenderer.setHorizontalAlignment(SwingConstants.CENTER);        
        this.cj = cj;
        getContentPane().setBackground(Color.WHITE);
        popularLista();
    }
    
    public FotoJogador(java.awt.Frame parent, AlterarJogador aj) {
        super(parent, true);
        initComponents();
        this.listModel = new DefaultListModel();
        this.listaImagens.setModel(listModel);        
        this.listRenderer = (DefaultListCellRenderer) this.listaImagens.getCellRenderer();
        this.listRenderer.setHorizontalAlignment(SwingConstants.CENTER);        
        this.aj = aj;
        getContentPane().setBackground(Color.WHITE);
        popularLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaImagens = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listaImagens.setSelectionBackground(new java.awt.Color(204, 204, 204));
        listaImagens.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaImagensValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaImagens);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaImagensValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaImagensValueChanged

        lblImagem.setIcon(new ImageIcon(getClass().getResource("/resources/rostos/jogador/128/" + (this.listaImagens.getSelectedIndex() + 1) + ".png")));
                
    }//GEN-LAST:event_listaImagensValueChanged

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        if(this.cj != null){
            this.cj.getLblFotoJogador128().setIcon(lblImagem.getIcon());
            this.cj.setImg16(new ImageIcon(getClass().getResource("/resources/rostos/jogador/16/" + (listaImagens.getSelectedIndex()+1) + ".png")));
            this.cj.setImg24(new ImageIcon(getClass().getResource("/resources/rostos/jogador/24/" + (listaImagens.getSelectedIndex()+1) + ".png")));
            this.cj.setImg128((ImageIcon) lblImagem.getIcon());        
        } else if(this.aj != null){
            this.aj.getLblFotoJogador128().setIcon(lblImagem.getIcon());
            this.aj.setImg16(new ImageIcon(getClass().getResource("/resources/rostos/jogador/16/" + (listaImagens.getSelectedIndex()+1) + ".png")));
            this.aj.setImg24(new ImageIcon(getClass().getResource("/resources/rostos/jogador/24/" + (listaImagens.getSelectedIndex()+1) + ".png")));
            this.aj.setImg128((ImageIcon) lblImagem.getIcon());        
        }
        
        this.dispose();
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void popularLista(){
        
        int i = 1;
        
        while(i < 5){
            listModel.addElement(new ImageIcon(getClass().getResource("/resources/rostos/jogador/24/" + i + ".png")));            
            i++;
        }
        listModel.addElement(new ImageIcon(getClass().getResource("/resources/rostos/jogador/24/default.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JList listaImagens;
    // End of variables declaration//GEN-END:variables
}