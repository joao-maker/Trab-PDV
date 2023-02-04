/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author joaop
 */
public class ClienteDAO {
    
    PreparedStatement pst;
    String sql;
    
    public void Cadastrar(Cliente cliente) throws SQLException{
    
        sql = "insert into cliente values(?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, cliente.getNomeCliente());
        pst.setString(3,cliente.getTipoPessoa());
        pst.setString(4, cliente.getCpfCliente());
        pst.setString(5,cliente.getCnpjCliente());
        pst.setString(6, cliente.getEmail());
        pst.setString(7, cliente.getFone1());
        pst.setString(8, cliente.getFone2());
        pst.setString(9, cliente.getFone3());
        pst.setString(10, cliente.getRuaCliente());
        pst.setInt(11, cliente.getNum_enderecoCliente());
        pst.setString(12, cliente.getBairroCliente());
        pst.execute();
        pst.close();
    }
    
    
    public void Excluir(Cliente cliente) throws SQLException{
    
        sql = "delete from Cliente where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, cliente.getCodCliente());
        pst.execute();
        pst.close();
    }
    
    public void Alterar(Cliente cliente) throws SQLException{
    
        sql = "update Cliente set nome=?, tipo_pessoa=?, cpf=?, cnpj=?, email=?, "
        + "fone_1=?, fone_2=?, fone_3=?, rua=?, numero=?, bairro=? where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, cliente.getNomeCliente());
        pst.setString(2,cliente.getTipoPessoa());
        pst.setString(3, cliente.getCpfCliente());
        pst.setString(4,cliente.getCnpjCliente());
        pst.setString(5, cliente.getEmail());
        pst.setString(6, cliente.getFone1());
        pst.setString(7, cliente.getFone2());
        pst.setString(8, cliente.getFone3());
        pst.setString(9, cliente.getRuaCliente());
        pst.setInt(10, cliente.getNum_enderecoCliente());
        pst.setString(11, cliente.getBairroCliente());
        pst.setInt(12, cliente.getCodCliente());
        pst.execute();
        pst.close();
    }
    
    public Cliente buscaClienteCodigo(String id) throws SQLException{
    
        sql = "select * from Cliente where id = " + id;
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        Cliente cli = null;
        while(rs.next()){
        
            cli = new Cliente(rs.getInt("id"), rs.getString("nome"), rs.getString("tipo_pessoa"),rs.getString("cpf"),
            rs.getString("cnpj"), rs.getString("email"), rs.getString("fone_1"), rs.getString("fone_2"), rs.getString("fone_3"),
            rs.getString("rua"), rs.getInt("numero"),rs.getString("bairro"));
        }
        pst.close();
        return cli;
    }
    
    public List<Cliente> ListaCliente() throws SQLException{
    
        List<Cliente> listaCliente;
        listaCliente = new ArrayList<>();
        sql = "select * from Cliente order by nome";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
        
            listaCliente.add(new Cliente(rs.getInt("id"), rs.getString("nome"), rs.getString("tipo_pessoa"),rs.getString("cpf"),
            rs.getString("cnpj"), rs.getString("email"), rs.getString("fone_1"), rs.getString("fone_2"), rs.getString("fone_3"),
            rs.getString("rua"), rs.getInt("numero"),rs.getString("bairro")));
        }
        pst.close();
        return listaCliente;
    }
    
}
