package Frames.Time;

import BancoDeDados.BancoDeDados;
import Frames.EditarTimes;
import Frames.EscolherCor;
import Frames.Jogador.CadastrarJogador;
import Frames.Treinador.CadastrarTreinador;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import src.Estadio;
import src.Time;
import src.Treinador;
import src.enumeracao.EnumEstado;
import src.enumeracao.EnumNivel;

/**
 *
 * @author bruno.souza
 */
public class CadastrarTime extends javax.swing.JDialog {

    private BancoDeDados bd;    
    private EditarTimes et;
    private ImageIcon img24;
    private ImageIcon img32;
    private ImageIcon img128;
    
    public CadastrarTime(BancoDeDados bd, EditarTimes et) {
        super(new JFrame(), true);
        initComponents();
        
        setBd(bd); 
        setEt(et);
        this.img24 = new ImageIcon(getClass().getResource("/resources/rostos/jogador/16/8.png"));
        this.img32 = new ImageIcon(getClass().getResource("/resources/rostos/jogador/24/8.png"));
        this.img128 = new ImageIcon(getClass().getResource("/resources/rostos/jogador/128/8.png"));
        
        this.lblOk.setVisible(false);
        this.lblNok.setVisible(false);        
        this.campoId.setText(nextId() + "");
        popularComboNivel();
        popularComboEstado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnFotoTime = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblEscudoTime32 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        lblFotoTime128 = new javax.swing.JLabel();
        lblNomeTime = new javax.swing.JLabel();
        lblOk = new javax.swing.JLabel();
        lblNok = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboNivel = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoCor1 = new javax.swing.JTextField();
        campoCor2 = new javax.swing.JTextField();
        comboTreinador = new javax.swing.JComboBox();
        comboEstadio = new javax.swing.JComboBox();
        btnAddTreinador = new javax.swing.JButton();
        btnAddEstadio = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Time");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnFotoTime.setBackground(new java.awt.Color(255, 255, 255));
        btnFotoTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/24/camera.png"))); // NOI18N
        btnFotoTime.setBorderPainted(false);
        btnFotoTime.setContentAreaFilled(false);
        btnFotoTime.setOpaque(true);
        btnFotoTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoTimeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        lblEscudoTime32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEscudoTime32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("ID:");

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Adicionar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblFotoTime128.setBackground(new java.awt.Color(255, 255, 255));
        lblFotoTime128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoTime128.setOpaque(true);

        lblNomeTime.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNomeTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblOk.setBackground(new java.awt.Color(255, 255, 255));
        lblOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/16/success.png"))); // NOI18N

        lblNok.setBackground(new java.awt.Color(255, 255, 255));
        lblNok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/16/fail.png"))); // NOI18N

        campoId.setEditable(false);
        campoId.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        campoId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Nível:");

        jLabel4.setText("Treinador:");

        jLabel5.setText("Estádio:");

        jLabel6.setText("Cor Principal:");

        jLabel7.setText("Cor Secundária:");

        campoCor1.setEditable(false);
        campoCor1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        campoCor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoCor1MouseClicked(evt);
            }
        });

        campoCor2.setEditable(false);
        campoCor2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        campoCor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoCor2MouseClicked(evt);
            }
        });

        comboTreinador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem Treinador" }));

        comboEstadio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem Estádio" }));

        btnAddTreinador.setBackground(new java.awt.Color(255, 255, 255));
        btnAddTreinador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/16/add-team.png"))); // NOI18N
        btnAddTreinador.setBorderPainted(false);
        btnAddTreinador.setContentAreaFilled(false);
        btnAddTreinador.setOpaque(true);
        btnAddTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTreinadorActionPerformed(evt);
            }
        });

        btnAddEstadio.setBackground(new java.awt.Color(255, 255, 255));
        btnAddEstadio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/16/add-team.png"))); // NOI18N
        btnAddEstadio.setBorderPainted(false);
        btnAddEstadio.setContentAreaFilled(false);
        btnAddEstadio.setOpaque(true);

        jLabel8.setText("Estado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOk)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFotoTime)
                                .addGap(83, 83, 83))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFotoTime128, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCor2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCor1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(comboEstadio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(comboTreinador, 0, 150, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnAddEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnAddTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(comboNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 18, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoId, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(campoNome))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEscudoTime32, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNomeTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeTime, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lblEscudoTime32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFotoTime128, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFotoTime)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddTreinador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comboEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddEstadio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoCor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campoCor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNok, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void popularComboNivel(){
        
        EnumNivel[] enumNivel = EnumNivel.values();
        
        for(EnumNivel e : enumNivel){
            comboNivel.addItem(e);
        }
    }
    
    private void popularComboEstado(){
        
        EnumEstado[] enumEstado = EnumEstado.values();
        
        for(EnumEstado e : enumEstado){
            comboEstado.addItem(e);
        }
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
    
    private int nextId(){
        return (getBd().getTimes().get(getBd().getTimes().size()-1).getId()+1);
    }
    
    public BancoDeDados getBd() {
        return bd;
    }

    public void setBd(BancoDeDados bd) {
        this.bd = bd;
    }

    public EditarTimes getEt() {
        return et;
    }

    public void setEt(EditarTimes et) {
        this.et = et;
    }

    public JLabel getLblFotoTime128() {
        return lblFotoTime128;
    }

    public void setLblFotoTime128(JLabel lblFotoTime128) {
        this.lblFotoTime128 = lblFotoTime128;
    }
        
    private void btnFotoTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoTimeActionPerformed

        FotoTime ft = new FotoTime(null, this);
        ft.setVisible(true);

    }//GEN-LAST:event_btnFotoTimeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        if(campoNome.getText().isEmpty()){
            this.lblOk.setVisible(false);
            this.lblNok.setVisible(true);
            this.lblNok.setToolTipText("Campo 'Nome' não pode ser vazio!");
        } else {

            Time t = new Time(getImg24(), getImg32(), getImg128(), Integer.parseInt(campoId.getText()),
                    campoNome.getText() + "", (EnumNivel) comboNivel.getSelectedItem(), 
                    (Treinador) comboTreinador.getSelectedItem(), (Estadio)comboEstadio.getSelectedItem(),
                    campoCor1.getBackground(), campoCor2.getBackground(), getBd(),
                    (EnumEstado) comboEstado.getSelectedItem());
            
            getBd().getTimes().add(t);
            
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void campoCor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoCor1MouseClicked
        new EscolherCor(campoCor1).setVisible(true);
    }//GEN-LAST:event_campoCor1MouseClicked

    private void campoCor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoCor2MouseClicked
        new EscolherCor(campoCor2).setVisible(true);
    }//GEN-LAST:event_campoCor2MouseClicked

    private void btnAddTreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTreinadorActionPerformed

        new CadastrarTreinador(getBd()).setVisible(true);
        
    }//GEN-LAST:event_btnAddTreinadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEstadio;
    private javax.swing.JButton btnAddTreinador;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnFotoTime;
    private javax.swing.JTextField campoCor1;
    private javax.swing.JTextField campoCor2;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JComboBox comboEstadio;
    private javax.swing.JComboBox comboEstado;
    private javax.swing.JComboBox comboNivel;
    private javax.swing.JComboBox comboTreinador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEscudoTime32;
    private javax.swing.JLabel lblFotoTime128;
    private javax.swing.JLabel lblNok;
    private javax.swing.JLabel lblNomeTime;
    private javax.swing.JLabel lblOk;
    // End of variables declaration//GEN-END:variables
}