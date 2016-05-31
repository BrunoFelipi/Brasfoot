package Frames.Cadastro;

import BancoDeDados.BancoDeDados;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import src.Jogador;
import src.Time;
import src.enumeracao.EnumHabilidade;
import src.enumeracao.EnumPosicao;

/**
 *
 * @author bruno.souza
 */
public class CadastrarJogador extends javax.swing.JDialog {

    private BancoDeDados bd;
    private Border b;
    
    public CadastrarJogador(java.awt.Frame parent, BancoDeDados bd) {
        super(parent, true);
        initComponents();
        setBd(bd);        
        campoId.setText(nextId() + "");
        popularComboPosicao();
        popularComboTime();
        popularCombosHabilidade();
        this.b = campoNome.getBorder();
        this.lblOk.setVisible(false);
        this.lblNok.setVisible(false);
    }

    private int nextId(){
        return (getBd().getJogadores().get(getBd().getJogadores().size()-1).getId()+1);
    }
    
    private void popularComboPosicao(){
     
        EnumPosicao [] enumPosi = EnumPosicao.values();
        
        for(int i=0; i < enumPosi.length; i++){
            comboPosicao.addItem(enumPosi[i]);
        }
    }
    
    private void popularComboTime(){
     
        for(Time t : getBd().getTimes()){
            comboTime.addItem(t.getNome());
        }
    }
    
    private void popularCombosHabilidade(){
        
        EnumHabilidade [] enumHab = EnumHabilidade.values();
        
        for(int i=0; i < enumHab.length; i++){
            comboHabilidade1.addItem(enumHab[i]);
            comboHabilidade2.addItem(enumHab[i]);
        }
        
    }
    
    public BancoDeDados getBd() {
        return bd;
    }

    public void setBd(BancoDeDados bd) {
        this.bd = bd;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboPosicao = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboHabilidade1 = new javax.swing.JComboBox();
        comboHabilidade2 = new javax.swing.JComboBox();
        checkCraque = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        comboTime = new javax.swing.JComboBox();
        slider = new javax.swing.JSlider();
        campoNome = new javax.swing.JTextField();
        campoId = new javax.swing.JTextField();
        lblValue = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        lblEscudo = new javax.swing.JLabel();
        lblOk = new javax.swing.JLabel();
        lblNok = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Jogador");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel4.setText("Posição:");

        jLabel5.setText("Idade:");

        jLabel3.setText("Habilidade 1:");

        jLabel7.setText("Habilidade 2:");

        checkCraque.setBackground(new java.awt.Color(255, 255, 255));
        checkCraque.setText("Craque:");
        checkCraque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        checkCraque.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel9.setText("Time:");

        comboTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem Time" }));
        comboTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTimeActionPerformed(evt);
            }
        });

        slider.setBackground(new java.awt.Color(255, 255, 255));
        slider.setMaximum(40);
        slider.setMinimum(17);
        slider.setPaintLabels(true);
        slider.setToolTipText("");
        slider.setValue(20);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        campoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNomeFocusLost(evt);
            }
        });
        campoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNomeKeyPressed(evt);
            }
        });

        campoId.setEditable(false);
        campoId.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        campoId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblValue.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValue.setText("20");

        btnCadastrar.setText("Adicionar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblEscudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblOk.setBackground(new java.awt.Color(0, 153, 102));
        lblOk.setText("OK");
        lblOk.setOpaque(true);

        lblNok.setBackground(new java.awt.Color(255, 51, 0));
        lblNok.setText("NOK");
        lblNok.setOpaque(true);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboHabilidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkCraque, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboPosicao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboHabilidade1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoNome)
                                    .addComponent(campoId)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblValue, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblOk)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNok)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboHabilidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboHabilidade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkCraque)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
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

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        lblValue.setText(slider.getValue() + "");        
    }//GEN-LAST:event_sliderStateChanged

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        if(campoNome.getText().isEmpty()){            
            this.lblOk.setVisible(false);
            this.lblNok.setVisible(false);
        } else {
           
            if(getBd().existJogador(campoNome.getText())){
                this.lblNok.setVisible(true);
                this.lblOk.setVisible(false);
            } else {
                      
                Time t;
                
                if((comboTime.getSelectedItem() + "").equalsIgnoreCase("Sem Time")){
                    t = new Time("Sem Time");
                } else {
                    t = getBd().buscarTimeNome(comboTime.getSelectedItem()+"");
                }
                
                Jogador j = new Jogador(Integer.parseInt(campoId.getText()), null, campoNome.getText(), (EnumPosicao) comboPosicao.getSelectedItem(), 
                    slider.getValue(), (EnumHabilidade) comboHabilidade1.getSelectedItem(), (EnumHabilidade) comboHabilidade2.getSelectedItem(),
                    checkCraque.isSelected()+"", t, getBd());
                
                getBd().getJogadores().add(j);
                this.lblOk.setVisible(true);
                this.lblNok.setVisible(false);
                campoId.setText(nextId() + "");
                campoNome.setText("");
                comboTime.setSelectedIndex(0);
                slider.setValue(20);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void comboTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTimeActionPerformed

        if((comboTime.getSelectedItem() + "").equals("Sem Time")){
            lblEscudo.setIcon(null);
        } else {
        
            for(Time t : getBd().getTimes()){            
                if(t.getNome().equalsIgnoreCase(comboTime.getSelectedItem() + "")){
                    lblEscudo.setIcon(t.getEscudo());
                }            
            }        
        }
    }//GEN-LAST:event_comboTimeActionPerformed

    private void campoNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeKeyPressed

        if(!campoNome.getText().isEmpty()){
            campoNome.setBorder(this.b);
        }
        
    }//GEN-LAST:event_campoNomeKeyPressed

    private void campoNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusLost

        if(campoNome.getText().isEmpty()){            
            campoNome.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            campoNome.setBorder(this.b);
        }
        
    }//GEN-LAST:event_campoNomeFocusLost

    private void campoNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusGained

        if(campoNome.getText().isEmpty()){            
            campoNome.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            campoNome.setBorder(this.b);
        }
        
    }//GEN-LAST:event_campoNomeFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        for(Jogador j : getBd().getJogadores()){
            System.out.println("ID: " + j.getId() + "\nNome: " + j.getNome() + "\nTime: " + j.getTime().getNome() + "\n-----------------------");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JCheckBox checkCraque;
    private javax.swing.JComboBox comboHabilidade1;
    private javax.swing.JComboBox comboHabilidade2;
    private javax.swing.JComboBox comboPosicao;
    private javax.swing.JComboBox comboTime;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEscudo;
    private javax.swing.JLabel lblNok;
    private javax.swing.JLabel lblOk;
    private javax.swing.JLabel lblValue;
    private javax.swing.JSlider slider;
    // End of variables declaration//GEN-END:variables
}
