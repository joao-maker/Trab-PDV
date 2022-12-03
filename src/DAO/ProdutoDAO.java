/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Eleésio
 */

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Produto;
import java.sql.ResultSet;

public class ProdutoDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar(Produto produto) throws SQLException{
    sql = "insert into cliente(nome,endereco,bairro) values(?,?,?)";
    pst = Conexao.getInstance().prepareStatement(sql);
   
    pst.setString(1, produto.getnome_produto());
    pst.setString(2, produto.getmarca());
    pst.setString(3, produto.getdescricao());
    pst.setFloat(4, produto.getvl_custo());
    pst.setFloat(5, produto.getvl_venda());
    pst.execute();
    pst.close();
    }
    
    public Produto buscaProdutoCodigo(String codigo_pec) throws SQLException{
    sql = "select * from produto where codigo_pec = "+codigo_pec;
    pst = Conexao.getInstance().prepareStatement(sql);
    ResultSet rs = pst.executeQuery();
    Produto prod = null;
    while(rs.next()){
    prod = new Produto (rs.getInt("codigo_prod"),rs.getString("nome_produto"),rs.getString("marca"),rs.getString("descricao"),rs.getFloat("vl_custo"),rs.getFloat("vl_venda") );
    }
    pst.close();
    return prod;
    }
    
    public void excluir(Produto produto) throws SQLException{
    sql = "delete from cliente where codigo=?";
    pst = Conexao.getInstance().prepareStatement(sql);
    pst.setInt(1, produto.getcod_peca());
    pst.execute();
    pst.close();
    }
    
    public void alterar(Produto produto) throws SQLException{
    //acho que aqui da para se aplicar o sql inject 
        sql = "update cliente set nome=?, marca=?,descricao=?, vl_custo=?, vl_venda where codigo=?";
    pst.setString(1, produto.getnome_produto());
    pst.setString(2, produto.getmarca());
    pst.setString(3, produto.getdescricao());
    pst.setFloat(4, produto.getvl_custo());
    pst.setFloat(5, produto.getvl_venda());
    pst.execute();
    pst.close();
    }
}
