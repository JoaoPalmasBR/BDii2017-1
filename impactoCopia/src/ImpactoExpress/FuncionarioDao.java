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
public class FuncionarioDao {
    // a conexão com o banco de dados
    private Connection connection;
    
    public FuncionarioDao() {
        this .connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Funcionario funcionario) {
        String sql = "insert into funcionario " +
            "(nomeFuncionario,emailFuncionario,telefone1Funcionario,telefone2Funcionario,cidadeFuncionario,enderecoFuncionario)" +
            " values (?,?,?,?,?,?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            // seta os valores
            stmt.setString(1,funcionario.getNomeFuncionario());
            stmt.setString(2,funcionario.getEmailFuncionario());
            stmt.setString(3,funcionario.getTelefone1Funcionario());
            stmt.setString(4,funcionario.getTelefone2Funcionario());
            stmt.setString(5,funcionario.getCidadeFuncionario());
            stmt.setString(6,funcionario.getEnderecoFuncionario());
            
            // executa
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
