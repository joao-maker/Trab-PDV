/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Eleésio
 */
public class Produto {
    private int  cod_peca;
    private String nome_produto;
    private String marca;
    private String descricao;
    private float vl_custo;
    private float vl_venda;

    public Produto() {
    }
    
    public Produto(int cod_peca, String nome_produto, String marca, String descricao, float vl_custo , float vl_venda) {
        this.cod_peca = cod_peca;
        this.nome_produto = nome_produto;
        this.marca = marca;
        this.descricao = descricao;
        this.vl_custo = vl_custo;
        this.vl_venda = vl_venda;
    }

    
    

    public int getcod_peca() {
        return cod_peca;
    }

    public void setcod_peca(int cod_peca) {
        this.cod_peca = cod_peca;
    }

    public String getnome_produto() {
        return nome_produto;
    }

    public void setnome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getdescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public float getvl_custo() {
        return vl_custo;
    }

    public void setvl_custo(float vl_custo) {
        this.vl_custo = vl_custo;
    }
    
    public float getvl_venda() {
        return vl_venda;
    }

    public void setvl_venda(float vl_venda) {
        this.vl_venda = vl_venda;
    }
}
