/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Funcionario;
import Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author joaop
 */
public class UsuarioDAO {
    
  PreparedStatement pst;
  String sql;  
    
    public Usuario buscaLogin(String email, int senha) throws SQLException{
    
        sql = "Select * from Usuario where email = ? and senha = ?";
        Usuario usuario = null;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, email);
        pst.setInt(2, senha);
        pst.executeQuery();
        ResultSet rs  = pst.getResultSet();
        while(rs.next()){
            usuario = new Usuario(rs.getInt("id_usuario"),rs.getString("email"), rs.getInt("senha"));
        }
        return usuario;
    }
    
    
    public void cadastraUser() throws SQLException{
    
        sql = "insert  into  usuario select distinct  id,  email,  senha from funcionario where id on DUPLICATE key update id_usuario = id, usuario.email = funcionario.email, usuario.senha = funcionario.senha;";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.execute();
        pst.close();
    }
    
    
}
