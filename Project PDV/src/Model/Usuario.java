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
public class Usuario {
    
    private int codFuncionario;
    private String emailFuncionario;
    private int senhaFuncionario;

    public Usuario(int codFuncionario, String emailFuncionario, int senhaFuncionario) {
        this.codFuncionario = codFuncionario;
        this.emailFuncionario = emailFuncionario;
        this.senhaFuncionario = senhaFuncionario;
    }

    public Usuario() {
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public int getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(int senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }
    
    
}
