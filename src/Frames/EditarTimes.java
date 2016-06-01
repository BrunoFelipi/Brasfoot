package Frames;

import BancoDeDados.BancoDeDados;
import Frames.Cadastro.CadastrarJogador;
import Frames.Cadastro.CadastrarTime;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import src.Jogador;
import src.Time;

/**
 *
 * @author bruno.souza
 */
public class EditarTimes extends javax.swing.JDialog {

    private BancoDeDados bd;
    private DefaultListModel listModel;
    
    public EditarTimes(java.awt.Frame parent, BancoDeDados bd) {
        super(parent, true);
        initComponents();
        this.bd = bd;
        this.listModel = new DefaultListModel();
        this.listaTimes.setModel(this.listModel);     
        popularLista();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAddTime = new javax.swing.JButton();
        btnRemoverTime = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTimes = new javax.swing.JList();
        painelTitular = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAddJogador = new javax.swing.JButton();
        btnAlterarJogador = new javax.swing.JButton();
        btnRemoverJogador = new javax.swing.JButton();
        painelReserva = new javax.swing.JPanel();
        btnAlterarTime = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAddTime.setText("Adicionar T");
        btnAddTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTimeActionPerformed(evt);
            }
        });

        btnRemoverTime.setText("Remover T");
        btnRemoverTime.setEnabled(false);
        btnRemoverTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverTimeActionPerformed(evt);
            }
        });

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setBorder(null);
        jSplitPane1.setContinuousLayout(true);
        jSplitPane1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        listaTimes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaTimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTimesMouseClicked(evt);
            }
        });
        listaTimes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaTimesValueChanged(evt);
            }
        });
        listaTimes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaTimesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(listaTimes);

        jSplitPane1.setLeftComponent(jScrollPane1);

        painelTitular.setBackground(new java.awt.Color(255, 255, 255));

        btnAddJogador.setText("Adicionar J");
        btnAddJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddJogadorActionPerformed(evt);
            }
        });

        btnAlterarJogador.setText("Alterar J");

        btnRemoverJogador.setText("Remover J");

        painelReserva.setBackground(new java.awt.Color(255, 255, 255));
        painelReserva.setLayout(new javax.swing.BoxLayout(painelReserva, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout painelTitularLayout = new javax.swing.GroupLayout(painelTitular);
        painelTitular.setLayout(painelTitularLayout);
        painelTitularLayout.setHorizontalGroup(
            painelTitularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTitularLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTitularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(painelTitularLayout.createSequentialGroup()
                        .addComponent(painelReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelTitularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAlterarJogador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddJogador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoverJogador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        painelTitularLayout.setVerticalGroup(
            painelTitularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTitularLayout.createSequentialGroup()
                .addContainerGap(455, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelTitularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelTitularLayout.createSequentialGroup()
                        .addComponent(btnAddJogador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarJogador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverJogador))
                    .addComponent(painelReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jSplitPane1.setRightComponent(painelTitular);

        btnAlterarTime.setText("Alterar T");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverTime)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSplitPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTime)
                    .addComponent(btnRemoverTime)
                    .addComponent(btnAlterarTime))
                .addGap(28, 28, 28))
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

    private void btnAddTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTimeActionPerformed

        CadastrarTime ct = new CadastrarTime(null);
        ct.setVisible(true);
        
        
    }//GEN-LAST:event_btnAddTimeActionPerformed

    private void btnRemoverTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverTimeActionPerformed
//
//        if(this.listModel.getSize() > 0){
//        
//            int idx = listaTimes.getSelectedIndex();
//        
//            this.listModel.removeElementAt(idx);
//            
//            if(idx == this.listModel.getSize()){
//                this.listaTimes.setSelectedIndex(this.listModel.getSize() -1);                
//            } else {
//                this.listaTimes.setSelectedIndex(idx);
//            }
//            
//            if(this.listModel.getSize() == 0){
//                btnRemoverItem.setEnabled(false);
//            }
//            
//        } else {
//            btnRemoverItem.setEnabled(false);
//        }
    }//GEN-LAST:event_btnRemoverTimeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        if(this.listModel.getSize() > 0){
            this.listaTimes.setSelectedIndex(0);
        }        
    }//GEN-LAST:event_formWindowOpened

    private void listaTimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTimesMouseClicked

    }//GEN-LAST:event_listaTimesMouseClicked

    private void listaTimesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaTimesKeyPressed


        
    }//GEN-LAST:event_listaTimesKeyPressed

    private void listaTimesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaTimesValueChanged
        
        removerLabelsPainelReserva();
        //carregarPanelTitular(this.bd.buscarTimeId(Integer.parseInt(split[0])));
        carregarPainelReserva(this.bd.buscarTimeNome(listaTimes.getSelectedValue() + ""));
        
    }//GEN-LAST:event_listaTimesValueChanged

    private void btnAddJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddJogadorActionPerformed

        CadastrarJogador cj = new CadastrarJogador(null, this.bd, this.bd.buscarTimeNome(listaTimes.getSelectedValue() + ""));
        cj.setVisible(true);
        
    }//GEN-LAST:event_btnAddJogadorActionPerformed

    private void removerLabelsPainelReserva(){        
        painelReserva.removeAll();
        painelReserva.repaint();
        painelReserva.validate();       
    }
    
    private void popularLista(){
        
        for(Time t : this.bd.getTimes()){            
            this.listModel.addElement(t.getNome()); 
        }
    }
    
    private void carregarPainelReserva(Time t){        
                
        for(final Jogador jr : t.getJogadoresReserva()){            
            JLabel lbl = new JLabel(jr.getImage(), JLabel.CENTER); 
                        
            String toolTip = "<html>Posição: " + jr.getPosicao() + "<br>" + "Nome: " + jr.getNome() + "</html>";
            
            lbl.setToolTipText(toolTip);
            
            lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
            Dimension dMax = new Dimension(30, painelReserva.getHeight());
            Dimension dMin = new Dimension(10, 10);
            Dimension dPref = new Dimension(50, 50);

            lbl.setMaximumSize(dMax);
            lbl.setMinimumSize(dMin);
            lbl.setPreferredSize(dPref);
            lbl.setOpaque(true);
            lbl.setBackground(Color.WHITE);
            
            this.painelReserva.add(lbl);
            this.painelReserva.repaint();
            this.painelReserva.revalidate();
            
            lbl.addMouseListener(new MouseAdapter(){  
                public void mouseClicked(MouseEvent e){
                    JOptionPane.showMessageDialog(null, "Nome: " + jr.getNome() + "\nPosicao: " + jr.getPosicao());
                }  
            }); 
            
        }
        /*
        Component[] comp = painelReserva.getComponents();        
        for(int i=0; i < comp.length; i++){            
            if(comp[i] instanceof JLabel){
                JLabel lbl = (JLabel) comp[i];
                lbl.setText(t.getNome());
                return;
            }            
        }*/
    }
    
    private void carregarPanelTitular(Time t){        
                
        Component[] comp = painelTitular.getComponents();        
        for(int i=0; i < comp.length; i++){
            
            if(comp[i] instanceof JLabel){
                
                JLabel lbl = (JLabel) comp[i];
                
                lbl.setText(t.getNome());
                return;
            }
        }
        /*
        for(Jogador jr : t.getJogadoresReserva()){            
        }
        JOptionPane.showMessageDialog(null, t.getNome());
        */
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddJogador;
    private javax.swing.JButton btnAddTime;
    private javax.swing.JButton btnAlterarJogador;
    private javax.swing.JButton btnAlterarTime;
    private javax.swing.JButton btnRemoverJogador;
    private javax.swing.JButton btnRemoverTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JList listaTimes;
    private javax.swing.JPanel painelReserva;
    private javax.swing.JPanel painelTitular;
    // End of variables declaration//GEN-END:variables
}