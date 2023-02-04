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
public class Funcionario {
    
    private int codFuncionario;
    private String nomeFuncionario;
    private String num_carteiraFuncionario;
    private String foneFuncionario;
    private String emailFuncionario;
    private String tipoFuncionario;
    private int senhaFuncionario;

    public Funcionario() {
    }
    
    public Funcionario(int id ,String email, int senha){
        this.codFuncionario = id;
        this.emailFuncionario = email;
        this.senhaFuncionario = senha;
    }

    public Funcionario(int codFuncionario, String nomeFuncionario, String num_carteiraFuncionario,String tipoFuncionario, String foneFuncionario, String emailFuncionario, int senhaFuncionario) {
        this.codFuncionario = codFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.num_carteiraFuncionario = num_carteiraFuncionario;
        this.tipoFuncionario = tipoFuncionario;
        this.foneFuncionario = foneFuncionario;
        this.emailFuncionario = emailFuncionario;
        this.senhaFuncionario = senhaFuncionario;
    }

    
    

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getNum_carteiraFuncionario() {
        return num_carteiraFuncionario;
    }

    public void setNum_carteiraFuncionario(String num_carteiraFuncionario) {
        this.num_carteiraFuncionario = num_carteiraFuncionario;
    }

    public String getFoneFuncionario() {
        return foneFuncionario;
    }

    public void setFoneFuncionario(String foneFuncionario) {
        this.foneFuncionario = foneFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public int getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(int senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }
    
    
    
}
