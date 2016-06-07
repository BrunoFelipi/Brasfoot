package Frames.Time;

import java.awt.Color;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/**
 *
 * @author bruno.souza
 */
public class FotoTime extends javax.swing.JDialog {

    private DefaultListModel listModel;
    private DefaultListCellRenderer listRenderer;
    private CadastrarTime ct;
    private AlterarTime at;
    
    public FotoTime(java.awt.Frame parent, CadastrarTime ct) {
        super(parent, true);
        initComponents();
        this.listModel = new DefaultListModel();
        this.listaImagens.setModel(listModel);        
        this.listRenderer = (DefaultListCellRenderer) this.listaImagens.getCellRenderer();
        this.listRenderer.setHorizontalAlignment(SwingConstants.CENTER);        
        this.ct = ct;
        getContentPane().setBackground(Color.WHITE);        
        popularLista();
    }
    
    public FotoTime(java.awt.Frame parent, AlterarTime at) {
        super(parent, true);
        initComponents();
        this.listModel = new DefaultListModel();
        this.listaImagens.setModel(listModel);        
        this.listRenderer = (DefaultListCellRenderer) this.listaImagens.getCellRenderer();
        this.listRenderer.setHorizontalAlignment(SwingConstants.CENTER);        
        this.at = at;        
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

        listaImagens.setSelectionBackground(new java.awt.Color(235, 235, 235));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        lblImagem.setIcon(new ImageIcon(getClass().getResource("/resources/escudo/128/" + (this.listaImagens.getSelectedIndex() + 1) + ".png")));
                
    }//GEN-LAST:event_listaImagensValueChanged

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        if(this.ct != null){
            this.ct.getLblFotoTime128().setIcon(lblImagem.getIcon());
            this.ct.setImg24(new ImageIcon(getClass().getResource("/resources/escudo/24/" + (listaImagens.getSelectedIndex()+1) + ".png")));
            this.ct.setImg32(new ImageIcon(getClass().getResource("/resources/escudo/32/" + (listaImagens.getSelectedIndex()+1) + ".png")));
            this.ct.setImg128((ImageIcon) lblImagem.getIcon());        
        } else if(this.at != null){
            this.at.getLblFotoTime128().setIcon(lblImagem.getIcon());
            this.at.setImg24(new ImageIcon(getClass().getResource("/resources/escudo/24/" + (listaImagens.getSelectedIndex()+1) + ".png")));
            this.at.setImg32(new ImageIcon(getClass().getResource("/resources/escudo/32/" + (listaImagens.getSelectedIndex()+1) + ".png")));
            this.at.setImg128((ImageIcon) lblImagem.getIcon());        
        }
        
        this.dispose();
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void popularLista(){
        
        int i = 1;
        
        while(i < 30){
            listModel.addElement(new ImageIcon(getClass().getResource("/resources/escudo/24/" + i + ".png")));            
            i++;
        }        
        
        this.listaImagens.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JList listaImagens;
    // End of variables declaration//GEN-END:variables
}