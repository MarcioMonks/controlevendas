/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.monks_store.view;

import br.com.monks_store.dao.ItensVendaDAO;
import br.com.monks_store.dao.VendasDAO;
import br.com.monks_store.model.ItensVenda;
import br.com.monks_store.model.Produtos;
import br.com.monks_store.model.Vendas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marciomonks
 */
public class FrmHistorico extends javax.swing.JFrame {

    /**
     * Creates new form FrmHistorico
     */
    public FrmHistorico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtdatainicio = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdatafim = new javax.swing.JFormattedTextField();
        btnpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHistorico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Histórico de vendas");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta por Data"));

        jLabel7.setFont(new java.awt.Font("Noto Sans CJK SC", 0, 14)); // NOI18N
        jLabel7.setText("Data inicial");

        try {
            txtdatainicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdatainicio.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtdatainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatainicioActionPerformed(evt);
            }
        });
        txtdatainicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdatainicioKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Noto Sans CJK SC", 0, 14)); // NOI18N
        jLabel8.setText("Data fim");

        try {
            txtdatafim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdatafim.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtdatafim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatafimActionPerformed(evt);
            }
        });
        txtdatafim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdatafimKeyPressed(evt);
            }
        });

        btnpesquisar.setFont(new java.awt.Font("Noto Sans CJK SC", 0, 14)); // NOI18N
        btnpesquisar.setText("Pesquisar");
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdatainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdatafim, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpesquisar)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtdatainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtdatafim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesquisar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tabelaHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data da venda", "Cliente", "Total da venda", "Observações"
            }
        ));
        tabelaHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaHistoricoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaHistorico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtdatainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatainicioActionPerformed

    }//GEN-LAST:event_txtdatainicioActionPerformed

    private void txtdatainicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdatainicioKeyPressed

    }//GEN-LAST:event_txtdatainicioKeyPressed

    private void txtdatafimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatafimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatafimActionPerformed

    private void txtdatafimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdatafimKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatafimKeyPressed

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed

        try {
            
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
            LocalDate data_inicio = LocalDate.parse(txtdatainicio.getText(), formato);
            LocalDate data_fim = LocalDate.parse(txtdatafim.getText(), formato);

            VendasDAO dao = new VendasDAO();
            List<Vendas> lista = dao.listarVendasPorPeriodo(data_inicio, data_fim);

            DefaultTableModel dados = (DefaultTableModel) tabelaHistorico.getModel();
            dados.setNumRows(0);

            for(Vendas v: lista){

                dados.addRow(new Object[]{
                    v.getId(),
                    v.getData_venda(),
                    v.getCliente().getNome(),
                    v.getTotal_venda(),
                    v.getObs()
                });   
            }  
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Informe duas datas como intervalo");
        }
    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void tabelaHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaHistoricoMouseClicked
        
        FrmDetalheVenda tela = new FrmDetalheVenda();
        
        tela.txtcliente.setText(tabelaHistorico.getValueAt(tabelaHistorico.getSelectedRow(), 2).toString());
        tela.txttotalvenda.setText(tabelaHistorico.getValueAt(tabelaHistorico.getSelectedRow(), 3).toString());
        tela.txtdatavenda.setText(tabelaHistorico.getValueAt(tabelaHistorico.getSelectedRow(), 1).toString());
        tela.txtobsvenda.setText(tabelaHistorico.getValueAt(tabelaHistorico.getSelectedRow(), 4).toString());
        
        int venda_id = Integer.parseInt(tabelaHistorico.getValueAt(tabelaHistorico.getSelectedRow(), 0).toString());
        
        ItensVenda item = new ItensVenda();
        ItensVendaDAO dao_item = new ItensVendaDAO();
        
        List<ItensVenda> listaitens = dao_item.listaItensPorVenda(venda_id);
        
        DefaultTableModel dados = (DefaultTableModel) tela.tabelaItensVendidos.getModel();
        dados.setNumRows(0);
        
        for(ItensVenda i: listaitens){
            
            dados.addRow(new Object[]{
                i.getProduto().getDescricao(),
                i.getQtd(),
                i.getProduto().getPreco(),
                i.getSubtotal()     
            });   
        }   
        
        tela.setVisible(true);
    }//GEN-LAST:event_tabelaHistoricoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHistorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaHistorico;
    private javax.swing.JFormattedTextField txtdatafim;
    private javax.swing.JFormattedTextField txtdatainicio;
    // End of variables declaration//GEN-END:variables
}
