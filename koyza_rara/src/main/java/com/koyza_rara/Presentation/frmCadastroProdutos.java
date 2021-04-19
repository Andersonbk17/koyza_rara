/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koyza_rara.Presentation;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class frmCadastroProdutos extends javax.swing.JDialog {

    
    private frmListaProdutos janelaPai;
    
    /**
     * Creates new form frmCadastroProdutos
     * @param parent
     * @param modal
     */
    public frmCadastroProdutos(java.awt.Frame parent, boolean modal, frmListaProdutos janelaPai) {
        super(parent, modal);
        initComponents();
        this.janelaPai =  janelaPai;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelProdutos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPrecoCusto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPrecoVenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxFornecedor = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCAncelar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo Produto"));

        jLabel1.setText("Nome:*");

        jLabel2.setText("Preço Custo*");

        jLabel3.setText("Preço Venda:*");

        jLabel4.setText("Fornecedor:*");

        jComboBoxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Descrição:*");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        javax.swing.GroupLayout jPanelProdutosLayout = new javax.swing.GroupLayout(jPanelProdutos);
        jPanelProdutos.setLayout(jPanelProdutosLayout);
        jPanelProdutosLayout.setHorizontalGroup(
            jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelProdutosLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelProdutosLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldPrecoVenda))
                        .addGroup(jPanelProdutosLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanelProdutosLayout.setVerticalGroup(
            jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("*Campos Obrigatórios");

        jButton1.setText("jButton1");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setMaximumSize(new java.awt.Dimension(97, 29));
        jButtonSalvar.setMinimumSize(new java.awt.Dimension(97, 29));
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(97, 29));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCAncelar.setText("Cancelar");
        jButtonCAncelar.setPreferredSize(new java.awt.Dimension(97, 29));
        jButtonCAncelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCAncelarActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.setMaximumSize(new java.awt.Dimension(97, 29));
        jButtonSair.setMinimumSize(new java.awt.Dimension(97, 29));
        jButtonSair.setPreferredSize(new java.awt.Dimension(97, 29));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jButtonCAncelar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 340, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 340, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCAncelar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 205, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 206, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCAncelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCAncelarActionPerformed
        /*
            caso pressionado apaga todos os valores dos campos
        */
        
        jTextFieldNome.setText("");
        jTextFieldPrecoCusto.setText("");
        jTextFieldPrecoVenda.setText("");
        jTextAreaDescricao.setText("");
    }//GEN-LAST:event_jButtonCAncelarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // testa se os campos estão fazios
        
        if(jTextFieldNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha o Nome");
        }else if(jTextFieldPrecoCusto.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha o Preço de Custo");
        }else if(jTextFieldPrecoVenda.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha o Preço de Venda");
        }else if(jComboBoxFornecedor.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Preencha o Vendedor"); 
        }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCAncelar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelProdutos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPrecoCusto;
    private javax.swing.JTextField jTextFieldPrecoVenda;
    // End of variables declaration//GEN-END:variables
}