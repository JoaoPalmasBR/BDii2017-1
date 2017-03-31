package ImpactoExpress;
/**
 *
 * @author joao
 * @version 1.0
 * @since 8nov2016
 * 
 */
public class Funcionario {
    private int idFuncionario;
    private String nomeFuncionario,emailFuncionario,telefone1Funcionario,telefone2Funcionario,cidadeFuncionario,enderecoFuncionario;

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public String getTelefone1Funcionario() {
        return telefone1Funcionario;
    }

    public void setTelefone1Funcionario(String telefone1Funcionario) {
        this.telefone1Funcionario = telefone1Funcionario;
    }

    public String getTelefone2Funcionario() {
        return telefone2Funcionario;
    }

    public void setTelefone2Funcionario(String telefone2Funcionario) {
        this.telefone2Funcionario = telefone2Funcionario;
    }

    public String getCidadeFuncionario() {
        return cidadeFuncionario;
    }

    public void setCidadeFuncionario(String cidadeFuncionario) {
        this.cidadeFuncionario = cidadeFuncionario;
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    @Override
    public String toString() {
        return "idFuncionario=" + idFuncionario + ", nomeFuncionario=" + nomeFuncionario + ", emailFuncionario=" + emailFuncionario + ", telefone1Funcionario=" + telefone1Funcionario + ", telefone2Funcionario=" + telefone2Funcionario + ", cidadeFuncionario=" + cidadeFuncionario + ", enderecoFuncionario=" + enderecoFuncionario;
    }
    
    
}
