/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Produto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaop
 */
public class ProdutoDAO {
    
    PreparedStatement pst;
    String sql;
    
    public void Cadastrar(Produto produto) throws SQLException{
    
        sql = "insert into Produto values(?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, produto.getNomePeca());
        pst.setString(3,produto.getMarcaPeca());
        pst.setString(4,produto.getCategoria());
        pst.setString(5, produto.getDescricaoPeca());
        pst.setDouble(6, produto.getVl_custoPeca());
        pst.setDouble(7, produto.getVl_vendaPeca());
        pst.setInt(8, produto.getEstoque());
        pst.execute();
        pst.close();
    }
    
    public void Excluir(Produto produto) throws SQLException{
    
        sql = "delete from Produto where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, produto.getCodPeca());
        pst.execute();
        pst.close();
    }
    
    public void Alterar(Produto produto) throws SQLException{
    
        sql = "update Produto set nome=?, marca=?, categoria=?, descricao=?, vl_custo=?, vl_venda=?, estoque=? where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, produto.getNomePeca());
        pst.setString(2,produto.getMarcaPeca());
        pst.setString(3,produto.getCategoria());
        pst.setString(4, produto.getDescricaoPeca());
        pst.setDouble(5, produto.getVl_custoPeca());
        pst.setDouble(6, produto.getVl_vendaPeca());
        pst.setInt(7, produto.getEstoque());
        pst.setInt(8, produto.getCodPeca());
        pst.execute();
        pst.close();
        
    }
    
    public Produto buscaProdutoCodigo(String id) throws SQLException{
    
        sql ="select * from Produto where id = " + id;
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        Produto pro = null;
        while(rs.next()){
            pro = new Produto(rs.getInt("id"),rs.getString("nome"),rs.getString("marca"), rs.getString("categoria"),
           rs.getString("descricao"),rs.getDouble("vl_custo"), rs.getDouble("vl_venda"), rs.getInt("estoque"));
        }
        pst.close();
        return pro;
    }
    
    
    public List<Produto> ListaProduto() throws SQLException {
    
       List<Produto> listaProduto;
       listaProduto = new ArrayList<>();
       sql = "select * from Produto order by nome";
       pst = Conexao.getInstance().prepareStatement(sql);
       ResultSet rs = pst.executeQuery();
       while(rs.next()){
       
           listaProduto.add(new Produto(rs.getInt("id"),rs.getString("nome"),rs.getString("marca"), rs.getString("categoria"),
           rs.getString("descricao"),rs.getDouble("vl_custo"), rs.getDouble("vl_venda"), rs.getInt("estoque")));
       }
       pst.close();
       return listaProduto;
    
    }
    
}
