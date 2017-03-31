package ImpactoExpress;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author joao
 * @version 1.0
 * @since 8nov2016
 * 
 */
public class ClienteDao {
    // a conexão com o banco de dados
    private Connection connection;
    
    public ClienteDao() {
        this .connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Cliente cliente) {
        String sql = "insert into cliente " +
            "(nomeCliente,emailCliente,telefone1Cliente,telefone2Cliente,cidadeCliente,enderecoCliente)" +
            " values (?,?,?,?,?,?)";
        try ( // prepared statement para inserção
                PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            // seta os valores
            stmt.setString(1,cliente.getNomeCliente());
            stmt.setString(2,cliente.getEmailCliente());
            stmt.setString(3,cliente.getTelefone1Cliente());
            stmt.setString(4,cliente.getTelefone2Cliente());
            stmt.setString(5,cliente.getCidadeCliente());
            stmt.setString(6,cliente.getEnderecoCliente());
            
            // executa
            stmt.execute();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
