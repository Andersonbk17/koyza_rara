/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koyza_rara.Presentation;

import com.koyza_rara.DataAccess.FuncionarioDAO;
import com.koyza_rara.DomainModel.Funcionario;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson
 */
public class frmListaFuncionarios extends javax.swing.JDialog {

    /**
     * Creates new form frmListaFuncionarios
     */
    
    Funcionario funcionario;;
    FuncionarioDAO dao; 
    protected List<Funcionario> lista;
    
    
    
    
    public frmListaFuncionarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
        /* CARREGA LISTA JA AO ABRIR JANELA*/
        dao = new FuncionarioDAO();
        lista = new LinkedList<>();
        lista = dao.ListarTodos();
        
        preencheTabela();
        
    }
    
     protected void preencheTabela(){
        if(lista == null){
            lista = new LinkedList<>();
            
        }
        
        /*
         
         * DEFININDO "TABLE MODEL" COM LINHAS NÃO EDITAVEIS
         * 
         * http://www.guj.com.br/java/44193-jtable-nao-editavel
         
         */
        
        
        DefaultTableModel model = new DefaultTableModel(){
            @Override  
          public boolean isCellEditable(int row, int col){   
                 return false;   
          }   
        };
        
        model.addColumn("ID");
        model.addColumn("NOME");
        model.addColumn("CPF");
        model.addColumn("RG");
        model.addColumn("DATA DE NASCIMENTO");
        model.addColumn("CONTATO");
       
        
        for(Funcionario p : lista){
            Vector v = new Vector();
            v.add(0,p.getId());
            v.add(1,p.getNome());
            v.add(2,p.getCpf());
            v.add(3,p.getRg());
            v.add(4,p.getDataNascimento());
            v.add(5,p.getContato());
                   
            model.addRow(v);
        
        }
        
        jTableFuncionarios.setModel(model);
        jTableFuncionarios.repaint();
        

    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldFiltrar = new javax.swing.JTextField();
        jComboBoxTipoFiltro = new javax.swing.JComboBox<>();
        jButtonFiltrar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Filtro");

        jTextFieldFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFiltrarActionPerformed(evt);
            }
        });

        jComboBoxTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonFiltrar.setText("Filtrar");

        jButtonNovo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\Documents\\NetBeansProjects\\koyza_rara\\koyza_rara\\src\\main\\java\\com\\koyza_rara\\Presentation\\icones\\Novo.png")); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setMaximumSize(new java.awt.Dimension(97, 31));
        jButtonNovo.setMinimumSize(new java.awt.Dimension(97, 31));
        jButtonNovo.setPreferredSize(new java.awt.Dimension(97, 31));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\Documents\\NetBeansProjects\\koyza_rara\\koyza_rara\\src\\main\\java\\com\\koyza_rara\\Presentation\\icones\\alterar.png")); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setMaximumSize(new java.awt.Dimension(97, 31));
        jButtonAlterar.setMinimumSize(new java.awt.Dimension(97, 31));
        jButtonAlterar.setPreferredSize(new java.awt.Dimension(97, 31));

        jButtonExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\Documents\\NetBeansProjects\\koyza_rara\\koyza_rara\\src\\main\\java\\com\\koyza_rara\\Presentation\\icones\\excluir.png")); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setMaximumSize(new java.awt.Dimension(97, 31));
        jButtonExcluir.setMinimumSize(new java.awt.Dimension(97, 31));
        jButtonExcluir.setPreferredSize(new java.awt.Dimension(97, 31));

        jButtonSair.setText("Sair");
        jButtonSair.setMaximumSize(new java.awt.Dimension(97, 31));
        jButtonSair.setMinimumSize(new java.awt.Dimension(97, 31));
        jButtonSair.setPreferredSize(new java.awt.Dimension(97, 31));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionários"));

        jTableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(jTableFuncionarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jButtonFiltrar)
                        .addContainerGap(88, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFiltrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       
       frmCadastroFuncionario janela = new frmCadastroFuncionario(null, rootPaneCheckingEnabled);
       this.dispose();
       janela.setLocationRelativeTo(null);
       janela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxTipoFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JTextField jTextFieldFiltrar;
    // End of variables declaration//GEN-END:variables
}
