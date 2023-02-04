/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author joaop
 */
public class Produto {
    
    private int codPeca;
    private String nomePeca;
    private String marcaPeca;
    private String categoria;
    private String descricaoPeca;
    private double vl_custoPeca;
    private double vl_vendaPeca;
    private int estoque;

    public Produto() {
    }
    
    

    public Produto(int codPeca, String nomePeca, String marcaPeca, String categoria, String descricaoPeca, double vl_custoPeca, double vl_vendaPeca, int estoque) {
        this.codPeca = codPeca;
        this.nomePeca = nomePeca;
        this.marcaPeca = marcaPeca;
        this.categoria = categoria;
        this.descricaoPeca = descricaoPeca;
        this.vl_custoPeca = vl_custoPeca;
        this.vl_vendaPeca = vl_vendaPeca;
        this.estoque = estoque;
    }
    
    

    public int getCodPeca() {
        return codPeca;
    }

    public void setCodPeca(int codPeca) {
        this.codPeca = codPeca;
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public String getMarcaPeca() {
        return marcaPeca;
    }

    public void setMarcaPeca(String marcaPeca) {
        this.marcaPeca = marcaPeca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    public double getVl_custoPeca() {
        return vl_custoPeca;
    }

    public void setVl_custoPeca(double vl_custoPeca) {
        this.vl_custoPeca = vl_custoPeca;
    }

    public double getVl_vendaPeca() {
        return vl_vendaPeca;
    }

    public void setVl_vendaPeca(double vl_vendaPeca) {
        this.vl_vendaPeca = vl_vendaPeca;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    
    
}
