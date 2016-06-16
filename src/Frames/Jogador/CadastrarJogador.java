package Frames.Jogador;

import BancoDeDados.BancoDeDados;
import Frames.EditarTimes;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import src.Jogador;
import src.Time;
import src.enumeracao.EnumHabilidade;
import src.enumeracao.EnumLado;
import src.enumeracao.EnumPosicao;

/**
 *
 * @author bruno.souza
 */
public class CadastrarJogador extends javax.swing.JDialog {

    private BancoDeDados bd;
    private Time t;
    private EditarTimes et;
    private ImageIcon img16;
    private ImageIcon img24;
    private ImageIcon img128;
    
    public CadastrarJogador(BancoDeDados bd, Time t, EditarTimes et) {
        super(new JFrame(), true);
        initComponents();
        setBd(bd);        
        this.t = t;
        this.et = et;
        this.img16 = new ImageIcon(getClass().getResource("/resources/rostos/jogador/16/8.png"));
        this.img24 = new ImageIcon(getClass().getResource("/resources/rostos/jogador/24/8.png"));
        this.img128 = new ImageIcon(getClass().getResource("/resources/rostos/jogador/128/8.png"));
        this.lblNomeTime.setText(t.getNome());
        this.lblEscudoTime32.setIcon(t.getEscudo32());
        this.lblFotoJogador128.setIcon(new ImageIcon(getClass().getResource("/resources/rostos/jogador/128/8.png")));
        this.lblOk.setVisible(false);
        this.lblNok.setVisible(false);        
        this.campoId.setText(nextId() + "");   
        popularComboLado();
        popularComboPosicao();
        popularCombosHabilidade();
        validaAdicionarJogadorReserva();
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
        
    private int nextId(){
        return (getBd().getJogadores().get(getBd().getJogadores().size()-1).getId()+1);
    }
    
    private void popularComboLado(){
     
        EnumLado [] enumLado = EnumLado.values();
        
        for(int i=0; i < enumLado.length; i++){
            comboLado.addItem(enumLado[i]);
        }
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

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
        slider = new javax.swing.JSlider();
        campoNome = new javax.swing.JTextField();
        campoId = new javax.swing.JTextField();
        lblValue = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        lblOk = new javax.swing.JLabel();
        lblNok = new javax.swing.JLabel();
        lblFotoJogador128 = new javax.swing.JLabel();
        lblNomeTime = new javax.swing.JLabel();
        lblEscudoTime32 = new javax.swing.JLabel();
        btnFotoJogador = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblIconCraque = new javax.swing.JLabel();
        lblIconTitu = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboLado = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Jogador");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel4.setText("Posição:");

        jLabel5.setText("Idade:");

        jLabel3.setText("Habilidade 1:");

        jLabel7.setText("Habilidade 2:");

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

        campoId.setEditable(false);
        campoId.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        campoId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblValue.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, slider, org.jdesktop.beansbinding.ELProperty.create("${value}"), lblValue, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        btnCadastrar.setText("Adicionar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblOk.setBackground(new java.awt.Color(255, 255, 255));
        lblOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/16/success.png"))); // NOI18N

        lblNok.setBackground(new java.awt.Color(255, 255, 255));
        lblNok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/16/fail.png"))); // NOI18N

        lblFotoJogador128.setBackground(new java.awt.Color(255, 255, 255));
        lblFotoJogador128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoJogador128.setOpaque(true);

        lblNomeTime.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNomeTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblEscudoTime32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEscudoTime32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnFotoJogador.setBackground(new java.awt.Color(255, 255, 255));
        btnFotoJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/24/camera.png"))); // NOI18N
        btnFotoJogador.setBorderPainted(false);
        btnFotoJogador.setContentAreaFilled(false);
        btnFotoJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoJogadorActionPerformed(evt);
            }
        });

        lblIconCraque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconCraque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/16/star.png"))); // NOI18N
        lblIconCraque.setToolTipText("Craque");
        lblIconCraque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIconCraque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconCraqueMouseClicked(evt);
            }
        });

        lblIconTitu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconTitu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/camisa/16/camisa-titular.png"))); // NOI18N
        lblIconTitu.setToolTipText("Titular");
        lblIconTitu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIconTitu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconTituMouseClicked(evt);
            }
        });

        jLabel6.setText("Lado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEscudoTime32, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeTime, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOk)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFotoJogador128, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFotoJogador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(campoId)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblIconCraque, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblIconTitu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboHabilidade2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboLado, 0, 142, Short.MAX_VALUE)))))
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFotoJogador128, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFotoJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(jLabel6)
                            .addComponent(comboLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconTitu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconCraque, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNok, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        //lblValue.setText(slider.getValue() + "");        
    }//GEN-LAST:event_sliderStateChanged

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        if(campoNome.getText().isEmpty()){            
            this.lblOk.setVisible(false);
            this.lblNok.setVisible(true);
            this.lblNok.setToolTipText("Campo 'Nome' não pode ser vazio!");
        } else {
            
            Jogador j = new Jogador(Integer.parseInt(campoId.getText()), getImg16(), getImg24(), getImg128(), campoNome.getText(), (EnumPosicao) comboPosicao.getSelectedItem(), 
                slider.getValue(), (EnumHabilidade) comboHabilidade1.getSelectedItem(), (EnumHabilidade) comboHabilidade2.getSelectedItem(),
                lblIconCraque.isEnabled(), this.t, getBd(), lblIconTitu.isEnabled(), (EnumLado) comboLado.getSelectedItem());
            
            this.t.getJogadores().add(j);

            if(lblIconTitu.isEnabled()){
                this.t.getJogadoresTitular().add(j);    
            } else {
                this.t.getJogadoresReserva().add(j);
            }

            getBd().getJogadores().add(j);
            this.lblOk.setVisible(true);
            this.lblOk.setToolTipText("Jogador \"" + j.getNome() + "\" cadastrado com sucesso!");
            this.lblNok.setVisible(false);
            campoId.setText(nextId() + "");
            campoNome.setText("");                
            slider.setValue(20); 
            this.et.carregarPainelReserva(this.t);
            validaAdicionarJogadorReserva();
            this.et.salvarJogo();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnFotoJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoJogadorActionPerformed

        FotoJogador fj = new FotoJogador(null, this);
        fj.setVisible(true);
        
    }//GEN-LAST:event_btnFotoJogadorActionPerformed

    private void lblIconCraqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconCraqueMouseClicked

        if(lblIconCraque.isEnabled()){
            lblIconCraque.setEnabled(false);  
        } else {
            lblIconCraque.setEnabled(true);    
        }
        
    }//GEN-LAST:event_lblIconCraqueMouseClicked

    private void lblIconTituMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconTituMouseClicked

        if(lblIconTitu.isEnabled()){
            lblIconTitu.setEnabled(false);
            lblIconTitu.setToolTipText("Reserva");
        } else {            
            lblIconTitu.setEnabled(true);
            lblIconTitu.setToolTipText("Titular");
        }
        
    }//GEN-LAST:event_lblIconTituMouseClicked

    private void validaAdicionarJogadorReserva(){
        
        if(this.bd.buscarTimeId(((Time)this.et.getListaTimes().getSelectedValue()).getId()).getJogadoresReserva().size() >= 12){
            btnCadastrar.setEnabled(false);
            btnCadastrar.setToolTipText("Foi atingido o número máximo de jogadores reserva!");
        } else {
            btnCadastrar.setEnabled(true);
            btnCadastrar.setToolTipText(null);
        }               
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnFotoJogador;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JComboBox comboHabilidade1;
    private javax.swing.JComboBox comboHabilidade2;
    private javax.swing.JComboBox comboLado;
    private javax.swing.JComboBox comboPosicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEscudoTime32;
    private javax.swing.JLabel lblFotoJogador128;
    private javax.swing.JLabel lblIconCraque;
    private javax.swing.JLabel lblIconTitu;
    private javax.swing.JLabel lblNok;
    private javax.swing.JLabel lblNomeTime;
    private javax.swing.JLabel lblOk;
    private javax.swing.JLabel lblValue;
    private javax.swing.JSlider slider;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
