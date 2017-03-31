package ImpactoExpress;
/**
 *
 * @author joao
 * @version 1.0
 * @since 8nov2016
 * 
 */
public class Cliente {
    private int idCliente;
    private String nomeCliente,emailCliente,telefone1Cliente,telefone2Cliente,cidadeCliente,enderecoCliente;

    public Cliente() {
    }

    public Cliente(int idCliente, String nomeCliente, String emailCliente, String telefone1Cliente, String telefone2Cliente, String cidadeCliente, String enderecoCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.telefone1Cliente = telefone1Cliente;
        this.telefone2Cliente = telefone2Cliente;
        this.cidadeCliente = cidadeCliente;
        this.enderecoCliente = enderecoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefone1Cliente() {
        return telefone1Cliente;
    }

    public void setTelefone1Cliente(String telefone1Cliente) {
        this.telefone1Cliente = telefone1Cliente;
    }

    public String getTelefone2Cliente() {
        return telefone2Cliente;
    }

    public void setTelefone2Cliente(String telefone2Cliente) {
        this.telefone2Cliente = telefone2Cliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    @Override
    public String toString() {
        return "idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", emailCliente=" + emailCliente + ", telefone1Cliente=" + telefone1Cliente + ", telefone2Cliente=" + telefone2Cliente + ", cidadeCliente=" + cidadeCliente + ", enderecoCliente=" + enderecoCliente;
    }
    
}
