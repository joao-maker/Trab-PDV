/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Funcionario;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaop
 */
public class FuncionarioDAO {
    
    PreparedStatement pst;
    String sql;
    
    public void Cadastrar(Funcionario funcionario) throws SQLException{
    
        sql = "insert into Funcionario values(?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, funcionario.getNomeFuncionario());
        pst.setString(3, funcionario.getNum_carteiraFuncionario());
        pst.setString(4, funcionario.getTipoFuncionario());
        pst.setString(5, funcionario.getFoneFuncionario());
        pst.setString(6, funcionario.getEmailFuncionario());
        pst.setInt(7, funcionario.getSenhaFuncionario());
        pst.execute();
        pst.close();    
    }
    
    public void Excluir(Funcionario funcionario) throws SQLException{
    
        sql = "delete from Funcionario where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, funcionario.getCodFuncionario());
        pst.execute();
        pst.close();
    }
    
    public void Alterar(Funcionario funcionario) throws SQLException{
    
        sql = "update Funcionario set nome=?, num_carteira=?, funcao=?, fone=?, email=?, senha=? where id=?" ;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, funcionario.getNomeFuncionario());
        pst.setString(2, funcionario.getNum_carteiraFuncionario());
        pst.setString(3, funcionario.getTipoFuncionario());
        pst.setString(4, funcionario.getFoneFuncionario());
        pst.setString(5, funcionario.getEmailFuncionario());
        pst.setInt(6, funcionario.getSenhaFuncionario());
        pst.setInt(7, funcionario.getCodFuncionario());
        pst.execute();
        pst.close(); 
    }
    
    public Funcionario buscaFuncionarioCodigo(String id) throws SQLException{
    
        sql = "select * from Funcionario where id = " + id;
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        Funcionario fun = null;
        while(rs.next()){
        
            fun = new Funcionario(rs.getInt("id"), rs.getString("nome"), rs.getString("num_carteira"), 
            rs.getString("funcao"),rs.getString("fone"),rs.getString("email"), rs.getInt("senha"));
        }
        pst.close();
        return fun;
    }
    
    public List<Funcionario> ListaFuncionario() throws SQLException{
        
        List<Funcionario> listaFuncionario;
        listaFuncionario = new ArrayList<>();
        sql = "select * from Funcionario order by nome";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
        
            listaFuncionario.add(new Funcionario(rs.getInt("id"), rs.getString("nome"), rs.getString("num_carteira"), 
            rs.getString("funcao"),rs.getString("fone"),rs.getString("email"), rs.getInt("senha")));
        }
        pst.close();
        return listaFuncionario;
    }
    
    
     
    
}
