package Frames.Time;

import BancoDeDados.BancoDeDados;
import Frames.EditarTimes;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import src.Time;

/**
 *
 * @author bruno.souza
 */
public class AlterarTime extends javax.swing.JDialog {

    private BancoDeDados bd;
    private Time t;
    private EditarTimes et;
    private FotoTime ft;
    private ImageIcon img24;
    private ImageIcon img32;
    private ImageIcon img128;
    
    public AlterarTime(BancoDeDados bd, Time t, EditarTimes et) {
        super(new JFrame(), true);
        initComponents();
        this.ft = new FotoTime(null, this);
        this.t = t;
        this.et = et; 
        this.img24 = this.t.getEscudo24();
        this.img32 = this.t.getEscudo32();
        this.img128 = this.t.getEscudo128();        
        this.lblOk.setVisible(false);
        this.lblNok.setVisible(false);
        preencherCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        lblOk = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnFotoTime = new javax.swing.JButton();
        campoNome = new javax.swing.JTextField();
        lblEscudoTime32 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNomeTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFotoTime128 = new javax.swing.JLabel();
        lblNok = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblOk.setBackground(new java.awt.Color(255, 255, 255));
        lblOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/16/success.png"))); // NOI18N

        campoId.setEditable(false);
        campoId.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        campoId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnFotoTime.setBackground(new java.awt.Color(255, 255, 255));
        btnFotoTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/diversos/24/camera.png"))); // NOI18N
        btnFotoTime.setBorderPainted(false);
        btnFotoTime.setContentAreaFilled(false);
        btnFotoTime.setOpaque(true);
        btnFotoTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoTimeActionPerformed(evt);
            }
        });

        lblEscudoTime32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEscudoTime32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Nome:");

        lblNomeTime.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNomeTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("ID:");

        lblFotoTime128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNok.setBackground(new java.awt.Color(255, 255, 255));
        lblNok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/16/fail.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEscudoTime32, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeTime, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOk)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFotoTime128, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFotoTime))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(campoId)))
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEscudoTime32, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lblNomeTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFotoTime128, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addComponent(btnFotoTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNok, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    public JLabel getLblFotoTime128() {
        return lblFotoTime128;
    }

    public void setLblFotoTime128(JLabel lblFotoTime128) {
        this.lblFotoTime128 = lblFotoTime128;
    }
    
    public ImageIcon getImg24() {
        return img24;
    }

    public void setImg24(ImageIcon img24) {
        this.img24 = img24;
    }

    public ImageIcon getImg32() {
        return img32;
    }

    public void setImg32(ImageIcon img32) {
        this.img32 = img32;
    }

    public ImageIcon getImg128() {
        return img128;
    }

    public void setImg128(ImageIcon img128) {
        this.img128 = img128;
    }
    
    public BancoDeDados getBd() {
        return bd;
    }

    public void setBd(BancoDeDados bd) {
        this.bd = bd;
    }
    
    private void preencherCampos(){
        
        campoId.setText(this.t.getId() + "");
        campoNome.setText(this.t.getNome());
        
    }
    
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        if(campoNome.getText().isEmpty()){
            this.lblOk.setVisible(false);
            this.lblNok.setVisible(true);
            this.lblNok.setToolTipText("Campo 'Nome' não pode ser vazio!");
        } else {


            getBd().getTimes().add(this.t);
            this.lblOk.setVisible(true);
            this.lblNok.setVisible(false);
            this.et.carregarPainelReserva(this.bd.buscarTimeId(((Time)this.et.getListaTimes().getSelectedValue()).getId()));
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnFotoTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoTimeActionPerformed

        this.ft.setVisible(true);

    }//GEN-LAST:event_btnFotoTimeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnFotoTime;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEscudoTime32;
    private javax.swing.JLabel lblFotoTime128;
    private javax.swing.JLabel lblNok;
    private javax.swing.JLabel lblNomeTime;
    private javax.swing.JLabel lblOk;
    // End of variables declaration//GEN-END:variables
}