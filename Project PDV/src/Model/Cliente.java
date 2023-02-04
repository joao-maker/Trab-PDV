
package Model;

/**
 *
 * @author joaop
 */
public class Cliente {
    
    private int codCliente;
    private String nomeCliente;
    private int num_enderecoCliente;
    private String ruaCliente;
    private String bairroCliente;
    private String tipoPessoa;
    private String cpfCliente;
    private String cnpjCliente;
    private String fone1;
    private String fone2;
    private String fone3;
    private String Email;

    public Cliente() {
    }
    
    

    public Cliente(int codCliente, String nomeCliente, 
             String tipoPessoa, String cpfCliente, String cnpjCliente, String Email, String fone1, String fone2, 
            String fone3, String ruaCliente, int num_enderecoCliente, String bairroCliente) {
        
        
        this.codCliente = codCliente;
        this.nomeCliente = nomeCliente;
        this.tipoPessoa = tipoPessoa;
        this.cpfCliente = cpfCliente;
        this.cnpjCliente = cnpjCliente;
        this.Email = Email;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.fone3 = fone3;
        this.ruaCliente = ruaCliente;
        this.num_enderecoCliente = num_enderecoCliente;
        this.bairroCliente = bairroCliente;
        
    }
    
    
    

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getRuaCliente() {
        return ruaCliente;
    }

    public void setRuaCliente(String ruaCliente) {
        this.ruaCliente = ruaCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    

    public int getNum_enderecoCliente() {
        return num_enderecoCliente;
    }

    public void setNum_enderecoCliente(int num_enderecoCliente) {
        this.num_enderecoCliente = num_enderecoCliente;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getFone3() {
        return fone3;
    }

    public void setFone3(String fone3) {
        this.fone3 = fone3;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
  
}

