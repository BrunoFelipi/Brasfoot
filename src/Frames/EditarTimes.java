package Frames;

import BancoDeDados.BancoDeDados;
import Frames.Jogador.AlterarJogador;
import Frames.Jogador.CadastrarJogador;
import Frames.Time.AlterarTime;
import Frames.Time.CadastrarTime;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import src.Jogador;
import src.Time;
import src.serializable.Jogo;

/**
 *
 * @author bruno.souza
 */
public class EditarTimes extends javax.swing.JDialog {

    private BancoDeDados bd;
    private DefaultListModel listModel;
    private Date data;
    private SimpleDateFormat df;
    private String localSalvamento;
    
    public EditarTimes(java.awt.Frame parent, BancoDeDados bd) {
        super(parent, true);
        initComponents();
        this.bd = bd;
        this.listModel = new DefaultListModel();
        this.listaTimes.setModel(this.listModel);         
        this.data = new Date();
        this.df = new SimpleDateFormat("dd-MM-yyyy_HH-mm");
        this.localSalvamento = System.getProperty("user.home") + "\\Documents\\Fussball\\Fussball-" + df.format(data) + ".dat";
        popularLista();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAddTime = new javax.swing.JButton();
        btnRemoverTime = new javax.swing.JButton();
        btnAlterarTime = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTimes = new javax.swing.JList();
        painelReserva = new javax.swing.JPanel();
        btnRemoverJogador = new javax.swing.JButton();
        btnAddJogador = new javax.swing.JButton();
        btnAlterarJogador = new javax.swing.JButton();
        painelTitular = new javax.swing.JPanel();
        painelCampo = new javax.swing.JLabel();
        painelHab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPosicao = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblHabilidade1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblHabilidade2 = new javax.swing.JLabel();
        lblCraque = new javax.swing.JLabel();
        lblTituReser = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblLado = new javax.swing.JLabel();
        btnSalvarJogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAddTime.setBackground(new java.awt.Color(255, 255, 255));
        btnAddTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/24/add-team.png"))); // NOI18N
        btnAddTime.setToolTipText("Adicionar Time");
        btnAddTime.setBorderPainted(false);
        btnAddTime.setContentAreaFilled(false);
        btnAddTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddTime.setOpaque(true);
        btnAddTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTimeActionPerformed(evt);
            }
        });

        btnRemoverTime.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoverTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/24/remove-team.png"))); // NOI18N
        btnRemoverTime.setToolTipText("Excluir Time");
        btnRemoverTime.setBorderPainted(false);
        btnRemoverTime.setContentAreaFilled(false);
        btnRemoverTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoverTime.setEnabled(false);
        btnRemoverTime.setOpaque(true);
        btnRemoverTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverTimeActionPerformed(evt);
            }
        });

        btnAlterarTime.setBackground(new java.awt.Color(255, 255, 255));
        btnAlterarTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/24/change.png"))); // NOI18N
        btnAlterarTime.setToolTipText("Editar Time");
        btnAlterarTime.setBorderPainted(false);
        btnAlterarTime.setContentAreaFilled(false);
        btnAlterarTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarTime.setEnabled(false);
        btnAlterarTime.setOpaque(true);
        btnAlterarTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarTimeActionPerformed(evt);
            }
        });

        listaTimes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaTimes.setSelectionBackground(new Color(235, 235, 235));
        listaTimes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        listaTimes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaTimesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaTimes);

        painelReserva.setBackground(new java.awt.Color(255, 255, 255));
        painelReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRemoverJogador.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoverJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/24/remove-user.png"))); // NOI18N
        btnRemoverJogador.setToolTipText("Excluir Jogador");
        btnRemoverJogador.setBorderPainted(false);
        btnRemoverJogador.setContentAreaFilled(false);
        btnRemoverJogador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoverJogador.setEnabled(false);
        btnRemoverJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverJogadorActionPerformed(evt);
            }
        });

        btnAddJogador.setBackground(new java.awt.Color(255, 255, 255));
        btnAddJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/24/new-user.png"))); // NOI18N
        btnAddJogador.setToolTipText("Adicionar Jogador");
        btnAddJogador.setBorderPainted(false);
        btnAddJogador.setContentAreaFilled(false);
        btnAddJogador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddJogadorActionPerformed(evt);
            }
        });

        btnAlterarJogador.setBackground(new java.awt.Color(255, 255, 255));
        btnAlterarJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/24/change.png"))); // NOI18N
        btnAlterarJogador.setToolTipText("Editar Jogador");
        btnAlterarJogador.setBorderPainted(false);
        btnAlterarJogador.setContentAreaFilled(false);
        btnAlterarJogador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarJogador.setEnabled(false);
        btnAlterarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarJogadorActionPerformed(evt);
            }
        });

        painelTitular.setBackground(new java.awt.Color(255, 255, 255));
        painelTitular.setLayout(null);

        painelCampo.setBackground(new java.awt.Color(0, 153, 51));
        painelCampo.setOpaque(true);
        painelTitular.add(painelCampo);
        painelCampo.setBounds(0, 0, 460, 250);

        painelHab.setBackground(new java.awt.Color(255, 255, 255));
        painelHab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Posição:");

        jLabel4.setText("Idade:");

        jLabel5.setText("Habilidade 1:");

        lblPosicao.setText(" ");

        lblNome.setText(" ");

        lblID.setText(" ");

        lblIdade.setText(" ");

        lblHabilidade1.setText(" ");

        jLabel6.setText("Habilidade 2:");

        lblHabilidade2.setText(" ");

        lblCraque.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblCraque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCraque.setToolTipText("Craque");

        jLabel7.setText("Lado:");

        javax.swing.GroupLayout painelHabLayout = new javax.swing.GroupLayout(painelHab);
        painelHab.setLayout(painelHabLayout);
        painelHabLayout.setHorizontalGroup(
            painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelHabLayout.createSequentialGroup()
                        .addComponent(lblCraque, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTituReser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelHabLayout.createSequentialGroup()
                        .addGroup(painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPosicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHabilidade2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(lblHabilidade1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelHabLayout.setVerticalGroup(
            painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelHabLayout.createSequentialGroup()
                        .addGroup(painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituReser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCraque, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblNome)))
                    .addGroup(painelHabLayout.createSequentialGroup()
                        .addGroup(painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblIdade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblHabilidade1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblHabilidade2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblPosicao)
                    .addComponent(jLabel7)
                    .addComponent(lblLado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnSalvarJogo.setText("Salvar");
        btnSalvarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddTime, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarTime, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverTime, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvarJogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelTitular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelHab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(painelReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(painelTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAlterarTime, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRemoverTime, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAddTime, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRemoverJogador, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAlterarJogador, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAddJogador, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnSalvarJogo))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTimeActionPerformed

        CadastrarTime ct = new CadastrarTime(getBd(), this);
        ct.setVisible(true);
        
    }//GEN-LAST:event_btnAddTimeActionPerformed

    private void btnRemoverTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverTimeActionPerformed

    }//GEN-LAST:event_btnRemoverTimeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                
        if(this.listModel.getSize() > 0){
            this.listaTimes.setSelectedIndex(0);
            carregarPainelReserva(getTime());
        }        
    }//GEN-LAST:event_formWindowOpened

    private void listaTimesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaTimesValueChanged
        
        //carregarPanelTitular(this.bd.buscarTimeId(((Time)listaTimes.getSelectedValue()).getId()));
        carregarPainelReserva(getTime());
                
        lblCraque.setIcon(null);
        lblTituReser.setIcon(null);
        lblID.setText("");
        lblNome.setText("");
        lblPosicao.setText("");
        lblIdade.setText("");
        lblHabilidade1.setText("");
        lblHabilidade2.setText("");
        
    }//GEN-LAST:event_listaTimesValueChanged

    private void btnAddJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddJogadorActionPerformed

        CadastrarJogador cj = new CadastrarJogador(this.bd, getTime(), this);
        cj.setVisible(true);
        
    }//GEN-LAST:event_btnAddJogadorActionPerformed

    private void btnAlterarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarJogadorActionPerformed

        AlterarJogador aj = new AlterarJogador(this.bd, this.bd.buscarJogadorId(Integer.parseInt(lblID.getText())), this);
        aj.setVisible(true);
        
    }//GEN-LAST:event_btnAlterarJogadorActionPerformed

    private void btnRemoverJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverJogadorActionPerformed

        if(!lblID.getText().isEmpty()){
            
            getTime().getJogadores().remove(getJogador());
        
            if(getJogador().isTitular()){
                getTime().getJogadoresTitular().remove(getJogador());    
            } else {
                getTime().getJogadoresReserva().remove(getJogador());
            }

            carregarPainelReserva(getTime());            
            preencherInfoJogador(getJogador());
        }        
    }//GEN-LAST:event_btnRemoverJogadorActionPerformed

    private void btnSalvarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarJogoActionPerformed
        salvarJogo();
    }//GEN-LAST:event_btnSalvarJogoActionPerformed

    private void btnAlterarTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarTimeActionPerformed

        AlterarTime at = new AlterarTime(this.bd, (Time)this.listaTimes.getSelectedValue(), this);
        at.setVisible(true);
        
    }//GEN-LAST:event_btnAlterarTimeActionPerformed

    public void salvarJogo(){
        Jogo.salvar(this.localSalvamento, this.bd); 
    }
    
    public EditarTimes getEditarTime() {
        return this;
    }
    
    public BancoDeDados getBd() {
        return bd;
    }
    public Time getTime(){
        return (Time)listaTimes.getSelectedValue();
    }
    
    public Jogador getJogador(){
        return this.bd.buscarJogadorId(Integer.parseInt(lblID.getText()));
    }
    
    public JList getListaTimes() {
        return listaTimes;
    }

    public void setListaTimes(JList listaTimes) {
        this.listaTimes = listaTimes;
    }
    
    public JPanel getPainelReserva() {
        return painelReserva;
    }

    public void setPainelReserva(JPanel painelReserva) {
        this.painelReserva = painelReserva;
    }

    public JPanel getPainelTitular() {
        return painelTitular;
    }

    public void setPainelTitular(JPanel painelTitular) {
        this.painelTitular = painelTitular;
    }
    
    private void removerLabelsPainelTitular(){        
        painelTitular.removeAll();
        painelTitular.repaint();
        painelTitular.validate();       
    }
    
    private void removerLabelsPainelReserva(){        
        painelReserva.removeAll();
        painelReserva.repaint();
        painelReserva.validate();       
    }
    
    private void popularLista(){
        
        for(Time t : this.bd.getTimes()){            
            this.listModel.addElement(t); 
        }
        
        if(this.listModel.getSize() > 0){
            this.listaTimes.setSelectedIndex(0);   
            btnAlterarTime.setEnabled(true);
        } else {
            btnAlterarTime.setEnabled(false);
        }
    }
    
    public void carregarPainelReserva(Time t){        
                
        removerLabelsPainelReserva();
                
        for(final Jogador jr : t.getJogadoresReserva()){            
            
            final JLabel lbl = new JLabel(jr.getImage24(), JLabel.CENTER); 
                        
            String toolTip = "<html>Posição: " + jr.getPosicao() + "<br>" + "Nome: " + jr.getNome() + "</html>";
            
            lbl.setToolTipText(toolTip);
            
            lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
            Dimension dMax = new Dimension(painelReserva.getWidth() -2, 25);
            Dimension dMin = new Dimension(painelReserva.getWidth() -2, 25);
            Dimension dPref = new Dimension(painelReserva.getWidth() -2, 25);

            lbl.setMaximumSize(dMax);
            lbl.setMinimumSize(dMin);
            lbl.setPreferredSize(dPref);
            lbl.setOpaque(true);
            lbl.setBackground(Color.WHITE);
            
            painelReserva.add(lbl);  
            painelReserva.repaint();
            painelReserva.validate();
            
            lbl.addMouseListener(new MouseAdapter(){  
                public void mouseClicked(MouseEvent e){
                   
                    if(e.getClickCount() == 2){
                        AlterarJogador aj = new AlterarJogador(getBd(), jr, getEditarTime());
                        aj.setVisible(true);
                        return;
                    }
                    
                    resetBackgroundColorReserva();
                    lbl.setBackground(new Color(235, 235, 235));
                    preencherInfoJogador(jr);
                    
                    if(!lblID.getText().isEmpty()){
                        btnAlterarJogador.setEnabled(true);
                        btnRemoverJogador.setEnabled(true);
                    } else {
                        btnAlterarJogador.setEnabled(false);
                        btnRemoverJogador.setEnabled(false);
                    }
                    
                }
                
            });             
        }                
    }

    private void preencherInfoJogador(Jogador j){
                  
        lblID.setText(j.getId() + "");
        lblNome.setText(j.getNome());
        lblPosicao.setText(j.getPosicao() + "");
        lblIdade.setText(j.getIdade() + "");
        lblHabilidade1.setText(j.getHabilidade1() + "");
        lblHabilidade2.setText(j.getHabilidade2() + "");
        lblLado.setText(j.getLado() + "");
        
        if(j.isTitular()){
            lblTituReser.setIcon(new ImageIcon(getClass().getResource("/resources/camisa/16/camisa-titular.png")));
            lblTituReser.setToolTipText("Titular");
        } else {
            lblTituReser.setIcon(new ImageIcon(getClass().getResource("/resources/camisa/16/camisa-reserva.png")));
            lblTituReser.setToolTipText("Reserva");
        }

        if(j.isCraque()){
            lblCraque.setIcon(new ImageIcon(getClass().getResource("/resources/diversos/16/star.png")));
        } else {
            lblCraque.setIcon(null);
        }
    }
    
    private void resetBackgroundColorReserva(){
        
        Component[] comp = painelReserva.getComponents();
        
        for(int i=0; i < comp.length; i++){            
            if(comp[i] instanceof JLabel){                
                JLabel label = (JLabel) comp[i];
                label.setBackground(Color.white);
            }            
        }
    }
    
    private void carregarPanelTitular(Time t){        
         
        removerLabelsPainelTitular();
                
        for(final Jogador jr : t.getJogadoresTitular()){            
            
            JLabel lbl = new JLabel(jr.getImage24(), JLabel.CENTER); 
                        
            String toolTip = "<html>Posição: " + jr.getPosicao() + "<br>" + "Nome: " + jr.getNome() + "</html>";
            
            lbl.setToolTipText(toolTip);
            
            lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
            Dimension dMax = new Dimension(painelTitular.getWidth() -2, 25);
            Dimension dMin = new Dimension(painelTitular.getWidth() -2, 25);
            Dimension dPref = new Dimension(painelTitular.getWidth() -2, 25);

            lbl.setMaximumSize(dMax);
            lbl.setMinimumSize(dMin);
            lbl.setPreferredSize(dPref);
            lbl.setOpaque(true);
            lbl.setBackground(Color.WHITE);
            
            painelTitular.add(lbl);  
            painelTitular.repaint();
            painelTitular.validate();
            
            lbl.addMouseListener(new MouseAdapter(){  
                @Override
                public void mouseClicked(MouseEvent e){
                    lblID.setText(jr.getId() + "");
                    lblNome.setText(jr.getNome());
                    lblPosicao.setText(jr.getPosicao() + "");
                    lblIdade.setText(jr.getIdade() + "");
                    lblHabilidade1.setText(jr.getHabilidade1() + "");
                    lblHabilidade2.setText(jr.getHabilidade2() + "");
                    lblLado.setText(jr.getLado() + "");
                    
                    if(jr.isTitular()){
                        lblTituReser.setIcon(new ImageIcon(getClass().getResource("/resources/camisa/16/camisa-titular.png")));
                        lblTituReser.setToolTipText("Titular");
                    } else {
                        lblTituReser.setIcon(new ImageIcon(getClass().getResource("/resources/camisa/16/camisa-reserva.png")));
                        lblTituReser.setToolTipText("Reserva");
                    }
                    
                    if(jr.isCraque()){
                        lblCraque.setIcon(new ImageIcon(getClass().getResource("/resources/diversos/16/star.png")));
                    } else {
                        lblCraque.setIcon(null);
                    }    
                }  
            });             
        }                
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddJogador;
    private javax.swing.JButton btnAddTime;
    private javax.swing.JButton btnAlterarJogador;
    private javax.swing.JButton btnAlterarTime;
    private javax.swing.JButton btnRemoverJogador;
    private javax.swing.JButton btnRemoverTime;
    private javax.swing.JButton btnSalvarJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCraque;
    private javax.swing.JLabel lblHabilidade1;
    private javax.swing.JLabel lblHabilidade2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblLado;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPosicao;
    private javax.swing.JLabel lblTituReser;
    private javax.swing.JList listaTimes;
    private javax.swing.JLabel painelCampo;
    private javax.swing.JPanel painelHab;
    private javax.swing.JPanel painelReserva;
    private javax.swing.JPanel painelTitular;
    // End of variables declaration//GEN-END:variables
}