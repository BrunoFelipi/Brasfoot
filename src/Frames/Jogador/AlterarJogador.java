package Frames.Jogador;

import BancoDeDados.BancoDeDados;
import Frames.EditarTimes;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import src.Jogador;
import src.Time;
import src.enumeracao.EnumHabilidade;
import src.enumeracao.EnumPosicao;

/**
 *
 * @author bruno.souza
 */
public class AlterarJogador extends javax.swing.JDialog {

    private BancoDeDados bd;
    private Jogador j;
    private EditarTimes et;
    private FotoJogador fj;
    private ImageIcon img16;
    private ImageIcon img24;
    private ImageIcon img128;
    
    public AlterarJogador(java.awt.Frame parent, BancoDeDados bd, Jogador j, EditarTimes et) {
        super(parent, true);
        initComponents();
        setBd(bd);         
        this.fj = new FotoJogador(null, this);
        this.j = j;
        this.et = et; 
        this.img16 = j.getImage16();
        this.img24 = j.getImage24();
        this.img128 = j.getImage128();
        this.j.getTime().getJogadoresReserva().remove(this.j);
        this.lblNomeTime.setText(j.getTime().getNome());
        this.lblEscudoTime32.setIcon(j.getTime().getEscudo32());
        this.lblFotoJogador128.setIcon(j.getImage128());
        this.campoId.setText(j.getId()+"");
        this.campoNome.setText(j.getNome());
        this.comboPosicao.setSelectedItem(j.getPosicao());
        this.sliderIdade.setValue(j.getIdade());        
        this.comboHabilidade1.setSelectedItem(j.getHabilidade1());
        this.comboHabilidade2.setSelectedItem(j.getHabilidade2());        
        this.checkTitular.setSelected(j.isTitular());
        this.checkCraque.setSelected(j.isCraque());
        this.lblOk.setVisible(false);
        this.lblNok.setVisible(false);
        popularComboPosicao();
        popularCombosHabilidade();
    }
    
    private void popularComboPosicao(){
     
        EnumPosicao [] enumPosi = EnumPosicao.values();
        
        for(int i=0; i < enumPosi.length; i++){
            comboPosicao.addItem(enumPosi[i]);
        }
    }
    
    private void popularCombosHabilidade(){
        
        EnumHabilidade [] enumHab = EnumHabilidade.values();
        
        for(int i=0; i < enumHab.length; i++){
            comboHabilidade1.addItem(enumHab[i]);
            comboHabilidade2.addItem(enumHab[i]);
        }
        
    }

    public JLabel getLblFotoJogador128() {
        return lblFotoJogador128;
    }

    public void setLblFotoJogador128(JLabel lblFotoJogador128) {
        this.lblFotoJogador128 = lblFotoJogador128;
    }
        
    public BancoDeDados getBd() {
        return bd;
    }

    public void setBd(BancoDeDados bd) {
        this.bd = bd;
    }

    public ImageIcon getImg16() {
        return img16;
    }

    public void setImg16(ImageIcon img16) {
        this.img16 = img16;
    }

    public ImageIcon getImg24() {
        return img24;
    }

    public void setImg24(ImageIcon img24) {
        this.img24 = img24;
    }

    public ImageIcon getImg128() {
        return img128;
    }

    public void setImg128(ImageIcon img128) {
        this.img128 = img128;
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
        sliderIdade = new javax.swing.JSlider();
        campoNome = new javax.swing.JTextField();
        campoId = new javax.swing.JTextField();
        lblValue = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        lblOk = new javax.swing.JLabel();
        lblNok = new javax.swing.JLabel();
        lblFotoJogador128 = new javax.swing.JLabel();
        lblNomeTime = new javax.swing.JLabel();
        lblEscudoTime32 = new javax.swing.JLabel();
        btnFotoJogador = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        checkTitular = new javax.swing.JCheckBox();

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

        sliderIdade.setBackground(new java.awt.Color(255, 255, 255));
        sliderIdade.setMaximum(40);
        sliderIdade.setMinimum(17);
        sliderIdade.setPaintLabels(true);
        sliderIdade.setToolTipText("");
        sliderIdade.setValue(20);
        sliderIdade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderIdadeStateChanged(evt);
            }
        });

        campoId.setEditable(false);
        campoId.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        campoId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblValue.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValue.setText("20");

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblOk.setBackground(new java.awt.Color(255, 255, 255));
        lblOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/16/success.png"))); // NOI18N

        lblNok.setBackground(new java.awt.Color(255, 255, 255));
        lblNok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/16/fail.png"))); // NOI18N

        lblFotoJogador128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNomeTime.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNomeTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblEscudoTime32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEscudoTime32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnFotoJogador.setText("Foto");
        btnFotoJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoJogadorActionPerformed(evt);
            }
        });

        checkTitular.setBackground(new java.awt.Color(255, 255, 255));
        checkTitular.setText("Titular:");
        checkTitular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkTitular.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEscudoTime32, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeTime, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblFotoJogador128, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(btnFotoJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboHabilidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboPosicao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboHabilidade1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoNome)
                                    .addComponent(campoId)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sliderIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(checkTitular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkCraque))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOk)))
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
                    .addComponent(lblFotoJogador128, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(sliderIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(btnFotoJogador)
                            .addComponent(checkCraque)
                            .addComponent(checkTitular))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sliderIdadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderIdadeStateChanged
        lblValue.setText(sliderIdade.getValue() + "");        
    }//GEN-LAST:event_sliderIdadeStateChanged

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        if(campoNome.getText().isEmpty()){            
            this.lblOk.setVisible(false);
            this.lblNok.setVisible(true);
            this.lblNok.setToolTipText("Campo 'Nome' não pode ser vazio!");
        } else {
            
//            if(this.j.getImage16() == null){
//                this.j.setImage16(new ImageIcon(getClass().getResource("/resources/rostos/jogador/16/8.png")));
//            } else {
                this.j.setImage16(getImg16());
//            }

//            if(this.j.getImage24() == null){
//                this.j.setImage24(new ImageIcon(getClass().getResource("/resources/rostos/jogador/24/8.png")));
//            } else {
                this.j.setImage24(getImg24());
//            }

//            if(this.j.getImage128() == null){
//                this.j.setImage128(new ImageIcon(getClass().getResource("/resources/rostos/jogador/128/8.png")));
//            } else {
                this.j.setImage128(getImg128());
//            }
           
            this.j.setNome(campoNome.getText());
            this.j.setPosicao((EnumPosicao) comboPosicao.getSelectedItem());
            this.j.setIdade(sliderIdade.getValue());
            this.j.setHabilidade1((EnumHabilidade) comboHabilidade1.getSelectedItem());
            this.j.setHabilidade2((EnumHabilidade) comboHabilidade2.getSelectedItem());
            this.j.setCraque(checkCraque.isSelected());
            this.j.setTitular(checkTitular.isSelected());
            
            if(checkTitular.isSelected()){
                this.j.getTime().getJogadoresTitular().remove(this.j);
                this.j.getTime().getJogadoresReserva().remove(this.j);
                this.j.getTime().getJogadoresTitular().add(this.j);                
            } else {
                this.j.getTime().getJogadoresTitular().remove(this.j);
                this.j.getTime().getJogadoresReserva().remove(this.j);
                this.j.getTime().getJogadoresReserva().add(this.j);
            }
            
            getBd().getJogadores().add(j);
            this.lblOk.setVisible(true);
            this.lblNok.setVisible(false);
                        
            this.et.carregarPainelReserva(this.bd.buscarTimeId(((Time)this.et.getListaTimes().getSelectedValue()).getId()));
                   
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnFotoJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoJogadorActionPerformed

        this.fj.setVisible(true);
        
    }//GEN-LAST:event_btnFotoJogadorActionPerformed
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnFotoJogador;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JCheckBox checkCraque;
    private javax.swing.JCheckBox checkTitular;
    private javax.swing.JComboBox comboHabilidade1;
    private javax.swing.JComboBox comboHabilidade2;
    private javax.swing.JComboBox comboPosicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEscudoTime32;
    private javax.swing.JLabel lblFotoJogador128;
    private javax.swing.JLabel lblNok;
    private javax.swing.JLabel lblNomeTime;
    private javax.swing.JLabel lblOk;
    private javax.swing.JLabel lblValue;
    private javax.swing.JSlider sliderIdade;
    // End of variables declaration//GEN-END:variables
}
