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
public class SenhaDao {
    // a conexão com o banco de dados
    private Connection connection;
    
    public SenhaDao() {
        this .connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Senha senha) {
        String sql = "insert into tb_senha(senha) values (?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            // seta os valores
            stmt.setString(1,senha.getSenha());
            
            // executa
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
