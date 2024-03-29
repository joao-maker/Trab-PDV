/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.UsuarioDAO;
import Model.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author joaop
 */
public class Login_pdvView extends javax.swing.JFrame {
    
    Usuario usuario;
    UsuarioDAO usuarioDAO;

    /**
     * Creates new form Principal
     */
    public Login_pdvView() {
        
        usuario = new Usuario();
        usuarioDAO = new UsuarioDAO();
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        txt_emailFuncionario.requestFocus();
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Login = new java.awt.Panel();
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        txt_emailFuncionario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_senhaFuncionario = new javax.swing.JPasswordField();
        btn_Entrar = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        label3 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 153, 255));
        label1.setText("LOGIN DE ACESSO AO PDV");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("SENHA:");

        txt_emailFuncionario.setBackground(new java.awt.Color(225, 225, 225));
        txt_emailFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("E-MAIL:");

        txt_senhaFuncionario.setBackground(new java.awt.Color(225, 225, 225));

        btn_Entrar.setBackground(new java.awt.Color(102, 153, 255));
        btn_Entrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Entrar.setText("ENTRAR");
        btn_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntrarActionPerformed(evt);
            }
        });

        btn_Limpar.setBackground(new java.awt.Color(255, 102, 102));
        btn_Limpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Limpar.setText("LIMPAR");
        btn_Limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        label3.setText("label3");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("     PREENCHA TODOS OS CAMPOS ABAIXO");

        javax.swing.GroupLayout pnl_LoginLayout = new javax.swing.GroupLayout(pnl_Login);
        pnl_Login.setLayout(pnl_LoginLayout);
        pnl_LoginLayout.setHorizontalGroup(
            pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_LoginLayout.createSequentialGroup()
                        .addGroup(pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_LoginLayout.createSequentialGroup()
                                .addGap(596, 596, 596)
                                .addComponent(btn_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_LoginLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_emailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_LoginLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_senhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_LoginLayout.setVerticalGroup(
            pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_LoginLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_emailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_senhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(211, 211, 211))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntrarActionPerformed
      // PrincipalView principal = new PrincipalView();   
       //this.dispose();
    try{
        if(txt_emailFuncionario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O nome do usuario deve ser preenchido");
        }
        else if(txt_senhaFuncionario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "A senha do usuario deve ser preenchida");
        }
        else{
            usuario = usuarioDAO.buscaLogin(txt_emailFuncionario.getText(),Integer.parseInt(txt_senhaFuncionario.getText()));
            if(usuario == null){
                JOptionPane.showMessageDialog(null, "Usuario e/ou senha invalido(s)", "erro", JOptionPane.ERROR_MESSAGE);
            }
            else{
                PrincipalView principal = new PrincipalView(usuario);  
                this.dispose();
            }
        }
    }
    catch(SQLException ex){ 
        Logger.getLogger(Login_pdvView.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btn_EntrarActionPerformed

    
    
    
    
    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        txt_emailFuncionario.setText("");
        txt_senhaFuncionario.setText("");
    }//GEN-LAST:event_btn_LimparActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Entrar;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Panel pnl_Login;
    private javax.swing.JTextField txt_emailFuncionario;
    private javax.swing.JPasswordField txt_senhaFuncionario;
    // End of variables declaration//GEN-END:variables
}
