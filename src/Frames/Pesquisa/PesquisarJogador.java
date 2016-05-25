package Frames.Pesquisa;

import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author bruno.souza
 */
public class PesquisarJogador extends javax.swing.JDialog {

    public PesquisarJogador(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
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
        lblPesquisa = new javax.swing.JLabel();
        radioTime = new javax.swing.JRadioButton();
        campoPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        radioHabilidade = new javax.swing.JRadioButton();
        radioIdade = new javax.swing.JRadioButton();
        radioForca = new javax.swing.JRadioButton();
        radioStatus = new javax.swing.JRadioButton();
        radioCraque = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        lblPesquisa.setText("ID:");

        buttonGroup1.add(radioTime);
        radioTime.setText("Time");
        radioTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTimeActionPerformed(evt);
            }
        });

        btnPesquisar.setText(">>");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPesquisa)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar))
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
                        .addComponent(radioHabilidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioIdade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioForca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioCraque)))
                .addContainerGap(392, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioID)
                    .addComponent(radioNome)
                    .addComponent(radioPosicao)
                    .addComponent(radioNumero)
                    .addComponent(radioTime)
                    .addComponent(radioHabilidade)
                    .addComponent(radioIdade)
                    .addComponent(radioForca)
                    .addComponent(radioStatus)
                    .addComponent(radioCraque))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Posição", "Número", "Time", "Habilidade", "Idade", "Força", "Status", "Craque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
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
        atualizaLabelPesquisa("ID:");        
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

    private void atualizaLabelPesquisa(String valor){
        lblPesquisa.setText(valor);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblPesquisa;
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
    // End of variables declaration//GEN-END:variables
}
