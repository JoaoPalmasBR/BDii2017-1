package ImpactoExpress;

import static ImpactoExpress.tela.funcionarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author joao
 * @version 1.0
 * @since 8nov2016
 * 
 */
public class PegaFuncionarios {
    Connection connection;
    public void getListaFuncionarios(){
        try{
            this .connection = new ConnectionFactory().getConnection();
            try (PreparedStatement stmt = this.connection.prepareStatement("select * from funcionario")) {
                ResultSet rs = stmt.executeQuery();
                funcionarios.clear();
                while (rs.next()) {
                    // criando o objeto Contato
                    Funcionario funcionario = new Funcionario();
                    funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                    funcionario.setNomeFuncionario(rs.getString("nomeFuncionario"));
                    funcionario.setEmailFuncionario(rs.getString("emailFuncionario"));
                    funcionario.setTelefone1Funcionario(rs.getString("telefone1Funcionario"));
                    funcionario.setTelefone2Funcionario(rs.getString("telefone2Funcionario"));
                    funcionario.setCidadeFuncionario(rs.getString("cidadeFuncionario"));
                    funcionario.setEnderecoFuncionario(rs.getString("enderecoFuncionario"));
                    
                    // adicionando o objeto à lista
                    funcionarios.add(funcionario);
                }
                rs.close();
            }
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
    }
}
