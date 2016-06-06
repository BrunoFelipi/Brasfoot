package Frames;

import BancoDeDados.BancoDeDados;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import src.serializable.Jogo;

/**
 *
 * @author bruno.souza
 */
public class CarregarJogo extends javax.swing.JDialog{

    private DefaultListModel listModel;
    private Entrada e;
    
    public CarregarJogo(java.awt.Frame parent, Entrada e) {
        super(parent, true);
        initComponents();
        this.listModel = new DefaultListModel();
        this.listaArquivos.setModel(listModel);
        this.e = e;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaArquivos = new javax.swing.JList();
        btnCarregar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        f5 = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carregar Jogo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setViewportView(listaArquivos);

        btnCarregar.setBackground(new java.awt.Color(255, 255, 255));
        btnCarregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/24/upload.png"))); // NOI18N
        btnCarregar.setToolTipText("Carregar jogo");
        btnCarregar.setBorderPainted(false);
        btnCarregar.setContentAreaFilled(false);
        btnCarregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarregar.setOpaque(true);
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/24/delete.png"))); // NOI18N
        btnExcluir.setToolTipText("Deletar jogo");
        btnExcluir.setBorderPainted(false);
        btnExcluir.setContentAreaFilled(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setEnabled(false);
        btnExcluir.setOpaque(true);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        f5.setBackground(new java.awt.Color(255, 255, 255));
        f5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/24/load.png"))); // NOI18N
        f5.setToolTipText("Atualizar");
        f5.setBorderPainted(false);
        f5.setContentAreaFilled(false);
        f5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        f5.setOpaque(true);
        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });

        lblMensagem.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(f5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarregar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCarregar)
                                .addComponent(f5)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        File f = new File(System.getProperty("user.home") + "\\Documents\\Fussball");
        
        if(!f.exists()){
            f.mkdirs();            
        }
        
        carregarArquivos(); 
        
    }//GEN-LAST:event_formWindowOpened

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        File f = new File(this.listaArquivos.getSelectedValue() + "");
        
        if(f.exists()){
                        
            Object[] options = {"Sim", "Não"};
            int i= JOptionPane.showOptionDialog(null, "Tem certeza que deseja deletar o arquivo \"" + f.getName() + "\"", "Alerta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            
            if(i == JOptionPane.YES_OPTION){
                f.delete();
                this.listaArquivos.setSelectedIndex(0);
            }
        }
        
        carregarArquivos();
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed

        carregarArquivos();
        
    }//GEN-LAST:event_f5ActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed

        File f = new File(this.listaArquivos.getSelectedValue() + "");
        BancoDeDados bd = Jogo.carregar(f.getAbsolutePath());
        this.dispose();
        this.e.dispose();
        new EditarTimes(null, bd).setVisible(true);
        
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void carregarArquivos(){
        
        boolean existe = false;
        
        this.listModel.setSize(0);
        
        String localCarregamento = System.getProperty("user.home") + "\\Documents\\Fussball";
        
        File f = new File(localCarregamento);
                
        File[] fs = f.listFiles();
                
        for(File fil : fs){
            if(fil.getName().contains("dat")){                                
                this.listModel.addElement(fil.getAbsolutePath());                
                btnCarregar.setEnabled(true);
                btnExcluir.setEnabled(true);  
                lblMensagem.setText("");
                existe = true;
            }
        }
        
        if(existe == false){
            lblMensagem.setText("Nenhum arquivo encontrado");
            btnCarregar.setEnabled(false);
            btnExcluir.setEnabled(false);     
        }
        this.listaArquivos.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton f5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JList listaArquivos;
    // End of variables declaration//GEN-END:variables
}