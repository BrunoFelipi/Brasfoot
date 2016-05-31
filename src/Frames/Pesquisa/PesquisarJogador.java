package Frames.Pesquisa;

import BancoDeDados.BancoDeDados;
import Frames.Show.ShowJogador;
import java.awt.Color;
import java.awt.Point;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import src.Jogador;
import src.Time;
import src.enumeracao.EnumHabilidade;
import src.enumeracao.EnumPosicao;
import src.enumeracao.EnumStatus;

/**
 *
 * @author bruno.souza
 */
public class PesquisarJogador extends javax.swing.JDialog {

    private DefaultTableModel model;
    private BancoDeDados bd;
    private DefaultTableCellRenderer centerRenderer;
    private DefaultListCellRenderer listRenderer; 
    
    public PesquisarJogador(java.awt.Frame parent, BancoDeDados bd) {
        super(parent, true);
        initComponents();
        
        this.bd = bd;
        this.model = (DefaultTableModel) this.tabela.getModel();  
        this.centerRenderer = new DefaultTableCellRenderer();
        this.listRenderer = new DefaultListCellRenderer(); 
        this.listRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER); 
        
        alignCenterRenderer(centerRenderer);
        popularComboPosicao();
        popularComboTime();
        popularComboHabilidade();
        popularComboStatus();        
        
        comboCraque.setRenderer(this.listRenderer);
        this.spinIdMax.setValue(bd.getJogadores().get(bd.getJogadores().size() -1).getId());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spinIdMin = new javax.swing.JSpinner();
        campoNome = new javax.swing.JTextField();
        comboPosicao = new javax.swing.JComboBox();
        spinNumeroMin = new javax.swing.JSpinner();
        comboTime = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        spinNumeroMax = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        spinIdMax = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        comboHabilidade = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        spinIdadeMin = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        spinIdadeMax = new javax.swing.JSpinner();
        spinForcaMax = new javax.swing.JSpinner();
        comboStatus = new javax.swing.JComboBox();
        spinForcaMin = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        checkTodos = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comboCraque = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        spinValorMin = new javax.swing.JSpinner();
        spinValorMax = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Jogadores");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Posição:");

        jLabel4.setText("Número:");

        jLabel5.setText("Time:");

        spinIdMin.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        comboPosicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todas" }));

        spinNumeroMin.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        comboTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos" }));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("até");

        spinNumeroMax.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("até");

        spinIdMax.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel6.setText("Habilidade:");

        comboHabilidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todas" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNome)
                    .addComponent(comboTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboPosicao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(spinIdMin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinIdMax, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(spinNumeroMin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinNumeroMax, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboHabilidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spinIdMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(spinIdMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spinNumeroMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(spinNumeroMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Posição", "Número", "Time", "Habilidade 1", "Habilidade 2", "Idade", "Força", "Status", "Valor R$", "Craque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setToolTipText("");
        tabela.setDragEnabled(true);
        tabela.setGridColor(new java.awt.Color(255, 255, 255));
        tabela.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(30);
            tabela.getColumnModel().getColumn(7).setPreferredWidth(20);
            tabela.getColumnModel().getColumn(11).setPreferredWidth(20);
        }

        btnPesquisar.setText("Pesquisar >>");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        spinIdadeMin.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("até");

        spinIdadeMax.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        spinForcaMax.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos" }));

        spinForcaMin.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("até");

        jLabel8.setText("Força:");

        jLabel7.setText("Idade:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        checkTodos.setBackground(new java.awt.Color(255, 255, 255));
        checkTodos.setText("Todos");
        checkTodos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        checkTodos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        checkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTodosActionPerformed(evt);
            }
        });

        jLabel9.setText("Status:");

        jLabel14.setText("Craque:");

        comboCraque.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ambos", "Sim", "Não" }));

        jLabel15.setText("Valor:");

        spinValorMin.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1000), Integer.valueOf(0), null, Integer.valueOf(100)));

        spinValorMax.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1000), Integer.valueOf(0), null, Integer.valueOf(100)));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("até");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spinForcaMin, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(spinIdadeMin))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spinIdadeMax)
                                            .addComponent(spinForcaMax)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(spinValorMin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spinValorMax, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(comboCraque, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(checkTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(436, 436, 436)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(spinIdadeMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(spinIdadeMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(spinForcaMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(spinForcaMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(comboCraque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(spinValorMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(spinValorMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1))
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
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

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        popularTabela(getBd().pesquisaJogador((int) spinIdMin.getValue(), (int) spinIdMax.getValue(), campoNome.getText(), 
                comboPosicao.getSelectedItem() + "", (int) spinNumeroMin.getValue(), (int) spinNumeroMax.getValue(), 
                comboTime.getSelectedItem() + "", comboHabilidade.getSelectedItem() + "", (int) spinIdadeMin.getValue(), 
                (int) spinIdadeMax.getValue(), (int) spinForcaMin.getValue(), (int) spinForcaMax.getValue(), 
                comboStatus.getSelectedItem() + "", (int) spinValorMin.getValue(), (int) spinValorMax.getValue(),
                comboCraque.getSelectedItem() + "", checkTodos.isSelected()));
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void checkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTodosActionPerformed
        
        if(checkTodos.isSelected()){
            enableComponent(false);
        } else {
            enableComponent(true);
        }
    }//GEN-LAST:event_checkTodosActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        if (evt.getClickCount() == 2)  {  
            Point p = evt.getPoint();
            int row = tabela.rowAtPoint(p);  
            
            new ShowJogador(null, getBd().buscarJogadorId((int) this.model.getValueAt(row, 0))).setVisible(true);           
        }  
        
    }//GEN-LAST:event_tabelaMouseClicked
    
    private void enableComponent(boolean enable){        
        spinIdMin.setEnabled(enable);
        spinIdMax.setEnabled(enable);
        campoNome.setEnabled(enable);
        comboPosicao.setEnabled(enable);
        spinNumeroMin.setEnabled(enable);
        spinNumeroMax.setEnabled(enable);
        comboTime.setEnabled(enable);
        comboHabilidade.setEnabled(enable);        
        spinIdadeMin.setEnabled(enable);
        spinIdadeMax.setEnabled(enable);
        spinForcaMin.setEnabled(enable);
        spinForcaMax.setEnabled(enable);
        comboStatus.setEnabled(enable);
        comboCraque.setEnabled(enable);   
        spinValorMin.setEnabled(enable);
        spinValorMax.setEnabled(enable);
    }
    
    private void popularComboPosicao(){
        
        comboPosicao.setRenderer(this.listRenderer); 
        
        EnumPosicao[] enumPosi = EnumPosicao.values();
        
        for(int i=0; i < enumPosi.length; i++){
            comboPosicao.addItem(enumPosi[i]);            
        }        
    }
    
    private void popularComboHabilidade(){
        
        comboHabilidade.setRenderer(this.listRenderer); 
        
        EnumHabilidade[] enumHabilidade = EnumHabilidade.values();
        
        for(int i=0; i < enumHabilidade.length; i++){
            comboHabilidade.addItem(enumHabilidade[i]);
        }
    }
    
    private void popularComboStatus(){
        
        comboStatus.setRenderer(this.listRenderer); 
        
        EnumStatus[] enumStatus = EnumStatus.values();
        
        for(int i=0; i < enumStatus.length; i++){
            comboStatus.addItem(enumStatus[i]);
        }
    }
    
    private void popularComboTime(){
        
        comboTime.setRenderer(this.listRenderer); 
        
        for(Time ti : getBd().getTimes()){
            comboTime.addItem(ti.getNome());            
        }        
    }
    
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
            this.model.setValueAt(lista.get(i).getValor(), i, 10);
            
            if(lista.get(i).getCraque().equals("Sim")){
                this.model.setValueAt(true, i, 11);
            } else {
                this.model.setValueAt(false, i, 11);
            }
        }        
    }
    
    private void alignCenterRenderer(DefaultTableCellRenderer centerRenderer){
        
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        centerRenderer.setBackground(Color.WHITE);
        
        for(int i=0; i < this.model.getColumnCount()-1; i++){
            tabela.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);    
        }        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoNome;
    private javax.swing.JCheckBox checkTodos;
    private javax.swing.JComboBox comboCraque;
    private javax.swing.JComboBox comboHabilidade;
    private javax.swing.JComboBox comboPosicao;
    private javax.swing.JComboBox comboStatus;
    private javax.swing.JComboBox comboTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner spinForcaMax;
    private javax.swing.JSpinner spinForcaMin;
    private javax.swing.JSpinner spinIdMax;
    private javax.swing.JSpinner spinIdMin;
    private javax.swing.JSpinner spinIdadeMax;
    private javax.swing.JSpinner spinIdadeMin;
    private javax.swing.JSpinner spinNumeroMax;
    private javax.swing.JSpinner spinNumeroMin;
    private javax.swing.JSpinner spinValorMax;
    private javax.swing.JSpinner spinValorMin;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}