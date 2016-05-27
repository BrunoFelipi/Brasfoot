package Frames.Pesquisa;

import BancoDeDados.BancoDeDados;
import Frames.Pesquisa.panel.PesquisaID;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import src.Jogador;

/**
 *
 * @author bruno.souza
 */
public class PesquisarJogador extends javax.swing.JDialog {

    private DefaultTableModel model = new DefaultTableModel();
    private BancoDeDados bd;
    private DefaultTableCellRenderer centerRenderer;
    private PesquisaID pesquisaID;
    
    public PesquisarJogador(java.awt.Frame parent, BancoDeDados bd) {
        super(parent, true);
        initComponents();
        this.bd = bd;
        this.model = (DefaultTableModel) this.tabela.getModel();  
        this.centerRenderer = new DefaultTableCellRenderer();
        
        this.pesquisaID = new PesquisaID();
        this.painelPesquisa.setLayout(new FlowLayout());
        
        alignCenterRenderer(this.centerRenderer);
    }

    public BancoDeDados getBd() {
        return bd;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        radioID = new javax.swing.JRadioButton();
        radioNome = new javax.swing.JRadioButton();
        radioPosicao = new javax.swing.JRadioButton();
        radioNumero = new javax.swing.JRadioButton();
        radioTime = new javax.swing.JRadioButton();
        btnPesquisar = new javax.swing.JButton();
        radioHabilidade = new javax.swing.JRadioButton();
        radioIdade = new javax.swing.JRadioButton();
        radioForca = new javax.swing.JRadioButton();
        radioStatus = new javax.swing.JRadioButton();
        radioCraque = new javax.swing.JRadioButton();
        radioTodos = new javax.swing.JRadioButton();
        painelPesquisa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(radioID);
        radioID.setSelected(true);
        radioID.setText("ID");
        radioID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIDActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioNome);
        radioNome.setText("Nome");
        radioNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioPosicao);
        radioPosicao.setText("Posição");
        radioPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPosicaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioNumero);
        radioNumero.setText("Número");
        radioNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNumeroActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioTime);
        radioTime.setText("Time");
        radioTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTimeActionPerformed(evt);
            }
        });

        btnPesquisar.setText(">>");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioHabilidade);
        radioHabilidade.setText("Habilidade");
        radioHabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHabilidadeActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioIdade);
        radioIdade.setText("Idade");
        radioIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIdadeActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioForca);
        radioForca.setText("Força");
        radioForca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioForcaActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioStatus);
        radioStatus.setText("Status");
        radioStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioStatusActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioCraque);
        radioCraque.setText("Craque");
        radioCraque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCraqueActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioTodos);
        radioTodos.setText("Todos");
        radioTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTodosActionPerformed(evt);
            }
        });

        painelPesquisa.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout painelPesquisaLayout = new javax.swing.GroupLayout(painelPesquisa);
        painelPesquisa.setLayout(painelPesquisaLayout);
        painelPesquisaLayout.setHorizontalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        painelPesquisaLayout.setVerticalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(radioIdade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioForca)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(radioStatus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioCraque)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioTodos))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnPesquisar)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(radioID)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(radioPosicao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioNumero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioTime)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioHabilidade)))
                    .addComponent(painelPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioID)
                    .addComponent(radioNome)
                    .addComponent(radioPosicao)
                    .addComponent(radioNumero)
                    .addComponent(radioTime)
                    .addComponent(radioHabilidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioIdade)
                    .addComponent(radioForca)
                    .addComponent(radioStatus)
                    .addComponent(radioCraque)
                    .addComponent(radioTodos))
                .addContainerGap(298, Short.MAX_VALUE))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Posição", "Número", "Time", "Habilidade 1", "Habilidade 2", "Idade", "Força", "Status", "Craque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setDragEnabled(true);
        tabela.setGridColor(new java.awt.Color(255, 255, 255));
        tabela.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void radioIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIDActionPerformed
        atualizarPainel(this.pesquisaID);            
    }//GEN-LAST:event_radioIDActionPerformed

    private void radioNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNomeActionPerformed
        atualizaLabelPesquisa("Nome:");
    }//GEN-LAST:event_radioNomeActionPerformed

    private void radioPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPosicaoActionPerformed
        atualizaLabelPesquisa("Posição:");
    }//GEN-LAST:event_radioPosicaoActionPerformed

    private void radioNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNumeroActionPerformed
        atualizaLabelPesquisa("Número:");
    }//GEN-LAST:event_radioNumeroActionPerformed

    private void radioTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTimeActionPerformed
        atualizaLabelPesquisa("Time:");
    }//GEN-LAST:event_radioTimeActionPerformed

    private void radioHabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHabilidadeActionPerformed
        atualizaLabelPesquisa("Habilidade:");
    }//GEN-LAST:event_radioHabilidadeActionPerformed

    private void radioCraqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCraqueActionPerformed
        atualizaLabelPesquisa("Craque:");
    }//GEN-LAST:event_radioCraqueActionPerformed

    private void radioIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIdadeActionPerformed
        atualizaLabelPesquisa("Idade:");
    }//GEN-LAST:event_radioIdadeActionPerformed

    private void radioStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioStatusActionPerformed
        atualizaLabelPesquisa("Status:");
    }//GEN-LAST:event_radioStatusActionPerformed

    private void radioForcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioForcaActionPerformed
        atualizaLabelPesquisa("Força:");
    }//GEN-LAST:event_radioForcaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
              
        if(radioID.isSelected()){
            popularTabela(getBd().buscarJogadorID((int) this.pesquisaID.getSpinnerID().getValue()));            
        } else if(radioNome.isSelected()){
            popularTabela(getBd().buscarJogadorNome(campoPesquisa.getText()));
        } else if(radioPosicao.isSelected()){
            popularTabela(getBd().buscarJogadorPosicao(campoPesquisa.getText()));
        } else if(radioNumero.isSelected()){
            
        } else if(radioTime.isSelected()){
            
        } else if(radioHabilidade.isSelected()){
            
        } else if(radioIdade.isSelected()){
            
        } else if(radioForca.isSelected()){
            
        } else if(radioStatus.isSelected()){
            
        } else if(radioCraque.isSelected()){
            
        } else if(radioTodos.isSelected()){
            popularTabela(getBd().getJogadores());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void radioTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTodosActionPerformed

    }//GEN-LAST:event_radioTodosActionPerformed
    
    private void popularTabela(List<Jogador> lista){
        
        this.model.setRowCount(0);
        
        for(int i=0; i < lista.size(); i++){    
            model.addRow(new Object[]{null,null,null,null,null,null,null,null,null,null,null});
            this.model.setValueAt(lista.get(i).getId(), i, 0);
            this.model.setValueAt(lista.get(i).getNome(), i, 1);
            this.model.setValueAt(lista.get(i).getPosicao(), i, 2);
            this.model.setValueAt(lista.get(i).getNumero(), i, 3);
            this.model.setValueAt(lista.get(i).getTime().getNome(), i, 4);
            this.model.setValueAt(lista.get(i).getHabilidade1(), i, 5);
            this.model.setValueAt(lista.get(i).getHabilidade2(), i, 6);
            this.model.setValueAt(lista.get(i).getIdade(), i, 7);
            this.model.setValueAt(lista.get(i).getForca(), i, 8);
            this.model.setValueAt(lista.get(i).getStatus(), i, 9);
            this.model.setValueAt(lista.get(i).isCraque(), i, 10);            
        }        
    }
    
    private void alignCenterRenderer(DefaultTableCellRenderer centerRenderer){
        
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        centerRenderer.setBackground(Color.WHITE);
        
        for(int i=0; i < this.model.getColumnCount()-1; i++){
            tabela.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);    
        }
        
        
        TableCellRenderer t = new DefaultTableCellRenderer();        
        
        for(int i=0; i < this.model.getRowCount(); i++){
            if(i % 2 == 0){
                t.getTableCellRendererComponent(tabela, t, true, true, i, 0).setBackground(Color.red);
                t.getTableCellRendererComponent(tabela, t, true, true, i, 1).setBackground(Color.red);
            }
        }
        
    }
    
    private void atualizarPainel(JPanel painel){        
        
        this.painelPesquisa.add(painel);
        revalidate();        
        repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel painelPesquisa;
    private javax.swing.JRadioButton radioCraque;
    private javax.swing.JRadioButton radioForca;
    private javax.swing.JRadioButton radioHabilidade;
    private javax.swing.JRadioButton radioID;
    private javax.swing.JRadioButton radioIdade;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JRadioButton radioNumero;
    private javax.swing.JRadioButton radioPosicao;
    private javax.swing.JRadioButton radioStatus;
    private javax.swing.JRadioButton radioTime;
    private javax.swing.JRadioButton radioTodos;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
