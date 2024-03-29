/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.ProdutoDAO;
import Model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author joaop
 */
public class ProdutoView extends javax.swing.JInternalFrame {
    Produto produto;
    ProdutoDAO produtoDAO;
    List<Produto> listaProduto;
    /**
     * Creates new form ProdutoView
     */
    public ProdutoView() {
        produtoDAO = new ProdutoDAO();
        listaProduto = new ArrayList<>();
        initComponents();
        this.setVisible(true);
        atualizarTabelaProduto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Produto = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_idProduto = new javax.swing.JTextField();
        txt_nomeProduto = new javax.swing.JTextField();
        txt_marcaProduto = new javax.swing.JTextField();
        txt_categoriaProduto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_descricaoProduto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_vlcustoProduto = new javax.swing.JTextField();
        txt_vlvendaProduto = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        jLabel8 = new javax.swing.JLabel();
        txt_Estoque = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_Cadastrar = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlb_Produto = new javax.swing.JTable();
        btn_Novo = new javax.swing.JButton();

        setClosable(true);
        setTitle("MENU PRODUTO");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 153, 255));
        label1.setText("MENU DE ACESSO A DADOS DE PRODUTO");

        label2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(153, 153, 153));
        label2.setText("Cadastros, buscas e exclusões são realizadas nesta área!");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("NOME:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("MARCA:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("CATEGORIA:");

        txt_idProduto.setEnabled(false);

        txt_nomeProduto.setEnabled(false);

        txt_marcaProduto.setEnabled(false);

        txt_categoriaProduto.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_marcaProduto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_categoriaProduto)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_marcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_categoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("DESCRIÇÃO:");

        txt_descricaoProduto.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("VALOR DE CUSTO:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("VALOR DE VENDA:");

        txt_vlcustoProduto.setEnabled(false);

        txt_vlvendaProduto.setEnabled(false);

        label3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(153, 153, 153));
        label3.setText("OS VALORES DEVEM SER SEPARADOS POR \".\" EX: 10.99");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("ESTOQUE:");

        txt_Estoque.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("un.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_vlcustoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_vlvendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_vlcustoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_vlvendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Cadastrar.setBackground(new java.awt.Color(102, 153, 255));
        btn_Cadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Cadastrar.setText("CADASTRAR");
        btn_Cadastrar.setEnabled(false);
        btn_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarActionPerformed(evt);
            }
        });

        btn_Buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Buscar.setText("BUSCAR");
        btn_Buscar.setEnabled(false);
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        btn_Editar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Editar.setText("EDITAR");
        btn_Editar.setEnabled(false);
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Limpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Limpar.setText("LIMPAR E CANCELAR");
        btn_Limpar.setEnabled(false);
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        btn_Excluir.setBackground(new java.awt.Color(255, 51, 51));
        btn_Excluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Excluir.setText("EXLUIR");
        btn_Excluir.setEnabled(false);
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        tlb_Produto.setModel(new javax.swing.table.DefaultTableModel(
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
        tlb_Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlb_ProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tlb_Produto);

        btn_Novo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Novo.setText("NOVO");
        btn_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_ProdutoLayout = new javax.swing.GroupLayout(pnl_Produto);
        pnl_Produto.setLayout(pnl_ProdutoLayout);
        pnl_ProdutoLayout.setHorizontalGroup(
            pnl_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_ProdutoLayout.createSequentialGroup()
                        .addGroup(pnl_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ProdutoLayout.createSequentialGroup()
                                .addComponent(btn_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Limpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        pnl_ProdutoLayout.setVerticalGroup(
            pnl_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarActionPerformed
        // TODO add your handling code here:
        if(txt_nomeProduto.getText().isEmpty() || txt_marcaProduto.getText().isEmpty() || txt_categoriaProduto.getText().isEmpty()
        || txt_descricaoProduto.getText().isEmpty() || txt_vlcustoProduto.getText().isEmpty() || txt_vlvendaProduto.getText().isEmpty()
        || txt_Estoque.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        else{
            
            produto = new Produto();
            produto.setNomePeca(txt_nomeProduto.getText());
            produto.setMarcaPeca(txt_marcaProduto.getText());
            produto.setCategoria(txt_categoriaProduto.getText());
            produto.setDescricaoPeca(txt_descricaoProduto.getText());
            produto.setVl_custoPeca(Double.parseDouble(txt_vlcustoProduto.getText()));
            produto.setVl_vendaPeca(Double.parseDouble(txt_vlvendaProduto.getText()));
            produto.setEstoque(Integer.parseInt(txt_Estoque.getText()));
            
            try {
                produtoDAO.Cadastrar(produto);
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
            LimpaCamposProduto();
            atualizarTabelaProduto();
            preparaSalvareCancelar();
            desativaCampos();
        }  
            
    }//GEN-LAST:event_btn_CadastrarActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        // TODO add your handling code here:
        LimpaCamposProduto();
        preparaSalvareCancelar();
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        // TODO add your handling code here:
        if(txt_idProduto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um Produto!!");
        }
        
        else{
        
            produto = new Produto();
            produto.setCodPeca(Integer.parseInt(txt_idProduto.getText()));
            int confirma = JOptionPane.showConfirmDialog(null,"Deseja Excluir: " + txt_nomeProduto.getText());
            if(confirma == 0){
                try {
                    produtoDAO.Excluir(produto);
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!");
                LimpaCamposProduto();
                atualizarTabelaProduto();
            }
        }
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        // TODO add your handling code here:       
        if(txt_idProduto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um Produto");
        }
        else if(txt_nomeProduto.getText().isEmpty() || txt_marcaProduto.getText().isEmpty() || txt_categoriaProduto.getText().isEmpty()
        || txt_descricaoProduto.getText().isEmpty() || txt_vlcustoProduto.getText().isEmpty() || txt_vlvendaProduto.getText().isEmpty()
        || txt_Estoque.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para realizar a alteração!!");
        }
        else{
        
            produto = new Produto();
           
            produto.setNomePeca(txt_nomeProduto.getText());
            produto.setMarcaPeca(txt_marcaProduto.getText());
            produto.setCategoria(txt_categoriaProduto.getText());
            produto.setDescricaoPeca(txt_descricaoProduto.getText());
            produto.setVl_custoPeca(Double.parseDouble(txt_vlcustoProduto.getText()));
            produto.setVl_vendaPeca(Double.parseDouble(txt_vlvendaProduto.getText()));
            produto.setEstoque(Integer.parseInt(txt_Estoque.getText()));
            produto.setCodPeca(Integer.parseInt(txt_idProduto.getText()));
            try {
                produtoDAO.Alterar(produto);
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            LimpaCamposProduto();
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!!");
            atualizarTabelaProduto();
            preparaSalvareCancelar();
            desativaCampos();
        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void tlb_ProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlb_ProdutoMouseClicked
        // TODO add your handling code here:
        txt_idProduto.setText(tlb_Produto.getValueAt(tlb_Produto.getSelectedRow(), 0).toString());
        txt_nomeProduto.setText(tlb_Produto.getValueAt(tlb_Produto.getSelectedRow(), 1).toString());
        txt_marcaProduto.setText(tlb_Produto.getValueAt(tlb_Produto.getSelectedRow(), 2).toString());
        txt_categoriaProduto.setText(tlb_Produto.getValueAt(tlb_Produto.getSelectedRow(), 3).toString());
        txt_descricaoProduto.setText(tlb_Produto.getValueAt(tlb_Produto.getSelectedRow(), 4).toString());
        txt_vlcustoProduto.setText(tlb_Produto.getValueAt(tlb_Produto.getSelectedRow(), 5).toString());
        txt_vlvendaProduto.setText(tlb_Produto.getValueAt(tlb_Produto.getSelectedRow(), 6).toString());
        txt_Estoque.setText(tlb_Produto.getValueAt(tlb_Produto.getSelectedRow(), 7).toString());
        preparaSelecaoTabela();
        
    }//GEN-LAST:event_tlb_ProdutoMouseClicked

    
    
    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        // TODO add your handling code here:
        String cod =  JOptionPane.showInputDialog("Digite o codigo do produto: ");
        produto = new Produto();
        try {
            produto = produtoDAO.buscaProdutoCodigo(cod);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txt_nomeProduto.setText(produto.getNomePeca());
        txt_marcaProduto.setText(produto.getMarcaPeca());
        txt_categoriaProduto.setText(produto.getCategoria());
        txt_descricaoProduto.setText(produto.getDescricaoPeca());
        txt_vlcustoProduto.setText(String.valueOf(produto.getVl_custoPeca()));
        txt_vlvendaProduto.setText(String.valueOf(produto.getVl_vendaPeca()));
        txt_Estoque.setText(String.valueOf(produto.getEstoque()));
        
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NovoActionPerformed
        // TODO add your handling code here:
        preparaNovo();
        ativaCampos();
        LimpaCamposProduto();
    }//GEN-LAST:event_btn_NovoActionPerformed

    public void LimpaCamposProduto(){
    
        txt_idProduto.setText("");
        txt_nomeProduto.setText("");
        txt_marcaProduto.setText("");
        txt_categoriaProduto.setText("");
        txt_descricaoProduto.setText("");
        txt_vlcustoProduto.setText("");
        txt_vlvendaProduto.setText("");
        txt_Estoque.setText("");
    }
    
    
    private void atualizarTabelaProduto(){
    
        produto = new Produto();
        try {
            listaProduto = produtoDAO.ListaProduto();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String dados [][] = new String[listaProduto.size()][8];
        int i = 0;
        
        for(Produto produto : listaProduto){
        
            dados[i][0] = String.valueOf(produto.getCodPeca());
            dados[i][1] = produto.getNomePeca();
            dados[i][2] = produto.getMarcaPeca();
            dados[i][3] = produto.getCategoria();
            dados[i][4] = produto.getDescricaoPeca();
            dados[i][5] = String.valueOf(produto.getVl_custoPeca());
            dados[i][6] = String.valueOf(produto.getVl_vendaPeca());
            dados[i][7] = String.valueOf(produto.getEstoque());
            i++;
        }
        String tituloColuna[] = {"id","Nome","Marca","Categoria","Descrição","Valor Custo","Valor Venda", "Estoque"};
        DefaultTableModel tabelaProduto = new DefaultTableModel();
        tabelaProduto.setDataVector(dados, tituloColuna);
        tlb_Produto.setModel(new DefaultTableModel(dados,tituloColuna){
        
            boolean[] canEdit = new boolean[]{
            
                false,false,false,false,false,false,false,false
            };
            
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return canEdit[columnIndex];
            }
        });
        
        
        tlb_Produto.getColumnModel().getColumn(0).setPreferredWidth(100);
        tlb_Produto.getColumnModel().getColumn(1).setPreferredWidth(600);
        tlb_Produto.getColumnModel().getColumn(2).setPreferredWidth(100);
        tlb_Produto.getColumnModel().getColumn(3).setPreferredWidth(200);
        tlb_Produto.getColumnModel().getColumn(4).setPreferredWidth(600);
        tlb_Produto.getColumnModel().getColumn(5).setPreferredWidth(100);
        tlb_Produto.getColumnModel().getColumn(6).setPreferredWidth(100);
        tlb_Produto.getColumnModel().getColumn(7).setPreferredWidth(100);
        
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tlb_Produto.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tlb_Produto.setRowHeight(25);
        tlb_Produto.updateUI();
    }
    
    public void ativaCampos(){
    
      
        txt_nomeProduto.setEnabled(true);
        txt_marcaProduto.setEnabled(true);
        txt_categoriaProduto.setEnabled(true);
        txt_descricaoProduto.setEnabled(true);
        txt_vlcustoProduto.setEnabled(true);
        txt_vlvendaProduto.setEnabled(true);
        txt_Estoque.setEnabled(true);
    }
    
    public void desativaCampos(){
    
        txt_idProduto.setEnabled(false);
        txt_nomeProduto.setEnabled(false);
        txt_marcaProduto.setEnabled(false);
        txt_categoriaProduto.setEnabled(false);
        txt_descricaoProduto.setEnabled(false);
        txt_vlcustoProduto.setEnabled(false);
        txt_vlvendaProduto.setEnabled(false);
        txt_Estoque.setEnabled(false);
    }
    
    public void preparaNovo(){
    
        btn_Novo.setEnabled(false);
        btn_Cadastrar.setEnabled(true);
        btn_Limpar.setEnabled(true);
        btn_Editar.setEnabled(false);
        tlb_Produto.setEnabled(false);
        tlb_Produto.clearSelection();
    }
    
    public void preparaSalvareCancelar(){
     
        btn_Novo.setEnabled(true);
        btn_Cadastrar.setEnabled(false);
        btn_Limpar.setEnabled(false);
        btn_Editar.setEnabled(false);
        btn_Excluir.setEnabled(false);
        tlb_Produto.setEnabled(true);
    }
    
    public void preparaSelecaoTabela(){
    
        btn_Novo.setEnabled(true);
        btn_Excluir.setEnabled(true);
        btn_Editar.setEnabled(true);
        btn_Limpar.setEnabled(true);
        ativaCampos();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Cadastrar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_Novo;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JPanel pnl_Produto;
    private javax.swing.JTable tlb_Produto;
    private javax.swing.JTextField txt_Estoque;
    private javax.swing.JTextField txt_categoriaProduto;
    private javax.swing.JTextField txt_descricaoProduto;
    private javax.swing.JTextField txt_idProduto;
    private javax.swing.JTextField txt_marcaProduto;
    private javax.swing.JTextField txt_nomeProduto;
    private javax.swing.JTextField txt_vlcustoProduto;
    private javax.swing.JTextField txt_vlvendaProduto;
    // End of variables declaration//GEN-END:variables
}
