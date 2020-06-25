/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.DaoProdutos;
import controler.ControlerProduto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.ModelProduto;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Teofilo
 */

public class ViewVenda extends javax.swing.JFrame {
    ControlerProduto controlerProduto = new ControlerProduto();
    ModelProduto modelProduto = new ModelProduto();
    //DaoProdutos daoProdutos = new DaoProdutos();
    ArrayList<ModelProduto> listaModelProduto = new ArrayList<>();
    DaoProdutos dao = new DaoProdutos();
    List<ModelProduto> produtoss = dao.getProdutos();
    double precototal = 0;
    /**
     * Creates new form ViewVenda
     */
    public ViewVenda() {
       
        initComponents();
        listarproduto();
        
        //Preencher ComboBox com dados do bancos(nome dos peodutos)
       
    }
   
    
    
    public void habilitar(Boolean condicao) {
        jTextFieldCodPro.setEnabled(condicao);
        jTextFieldNome.setEnabled(condicao);
        jTextFieldPreco.setEnabled(condicao);
    }
   
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCodPro = new javax.swing.JTextField();
        jTQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBAdicionarCad = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jCTabela = new javax.swing.JTable();
        jBSalvarCad = new javax.swing.JToggleButton();
        jTValorTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldPreco = new javax.swing.JTextField();
        jButtonSelectItem = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();

        jButton4.setText("jButton4");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane3.setViewportView(jTree1);

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Nome Cliente");

        jTextFieldCodPro.setText(" ");
        jTextFieldCodPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodProActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantidade");

        jBAdicionarCad.setText("Adicionar");
        jBAdicionarCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarCadActionPerformed(evt);
            }
        });

        jCTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.Prod", "Nome Produto", "Valor Uni.", "Quantidade", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jCTabela);
        if (jCTabela.getColumnModel().getColumnCount() > 0) {
            jCTabela.getColumnModel().getColumn(1).setMinWidth(190);
            jCTabela.getColumnModel().getColumn(1).setPreferredWidth(200);
            jCTabela.getColumnModel().getColumn(1).setMaxWidth(202);
        }

        jBSalvarCad.setText("Salvar");
        jBSalvarCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarCadActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor total");

        jLabel7.setText("Cód. Produto");

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD. PRODUTO", "NOME PRODUTO", "PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableProduto);

        jLabel8.setText("Nome Produto");

        jLabel9.setText("Preço");

        jButtonSelectItem.setText("Selec. Produto");
        jButtonSelectItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSelectItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBSalvarCad)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldCodPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97)
                                        .addComponent(jBAdicionarCad))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(438, 438, 438)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAdicionarCad)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSelectItem)
                        .addGap(88, 88, 88)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(jTValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSalvarCad)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vender", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSelectItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectItemActionPerformed
        // TODO add your handling code here:
        int p = this.jTableProduto.getSelectedRow();
        int id = (int) this.jTableProduto.getValueAt(p, 0);
        modelProduto = dao.getProdutoById(id);
        this.jTextFieldCodPro.setText(String.valueOf(modelProduto.getIdProduto()));
        this.jTextFieldNome.setText(modelProduto.getProNome());
        this.jTextFieldPreco.setText(String.valueOf(modelProduto.getProPreco()));
        habilitar(false);
    }//GEN-LAST:event_jButtonSelectItemActionPerformed

    private void jBAdicionarCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarCadActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tbProduto = (DefaultTableModel) jCTabela.getModel(); // declarar modelo da tbl view
        int p = this.jTableProduto.getSelectedRow();
        int id = (int) this.jTableProduto.getValueAt(p, 0);
        modelProduto = dao.getProdutoById(id);
        int valorT= 0;
        valorT = (Integer.parseInt(this.jTQuantidade.getText()));
        double preco = (Double.parseDouble(this.jTextFieldPreco.getText()));
        double totalsub =0;
        totalsub =valorT * preco;
        Object[] dados ={
            modelProduto.getIdProduto(),
            modelProduto.getProNome(),
            modelProduto.getProPreco(),
            valorT,
            totalsub
        };
        tbProduto.addRow(dados);
        precototal = + totalsub + precototal;
        this.jTValorTotal.setText(String.valueOf(precototal));
        /*Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("documento.pdf"));
            document.open();
            document.add(new Paragraph("seja benvindo"));
        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("erro" +ex);
        }finally{
            document.close();
        }
        try{
            Desktop.getDesktop().open(new File("document.pdf"));
        } catch(IOException ex){
            System.out.println("erro" +ex);
        }*/

    }//GEN-LAST:event_jBAdicionarCadActionPerformed

    private void jTextFieldCodProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodProActionPerformed

    private void jBSalvarCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarCadActionPerformed
        // TODO add your handling code here:
        novosalva();
        JOptionPane.showMessageDialog(this, "Venda Efetuada");
        
    }//GEN-LAST:event_jBSalvarCadActionPerformed
    public void novosalva() {
        DefaultTableModel tbProduto = (DefaultTableModel) jCTabela.getModel(); // declarar modelo da tbl view
        tbProduto.setRowCount(0);
        
    }   
    public void listarproduto(){
        
        DefaultTableModel tbProduto = (DefaultTableModel) jTableProduto.getModel(); // declarar modelo da tbl view
        tbProduto.setRowCount(0); //Limpar a tabela do jTable na interface
        for (int i = 0; i < produtoss.size(); i++) {
            Object[] dados = {produtoss.get(i).getIdProduto(), produtoss.get(i).getProNome(),
                produtoss.get(i).getProPreco()
            };
            tbProduto.addRow(dados);
        }
        
    }
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
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jBAdicionarCad;
    private javax.swing.JToggleButton jBSalvarCad;
    private javax.swing.JButton jButton4;
    private javax.swing.JToggleButton jButtonSelectItem;
    private javax.swing.JTable jCTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTQuantidade;
    private javax.swing.JTextField jTValorTotal;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCodPro;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
