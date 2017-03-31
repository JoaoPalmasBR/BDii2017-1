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
public class VeiculoDao {
    // a conexão com o banco de dados
    private Connection connection;
    
    public VeiculoDao() {
        this .connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Veiculo veiculo) {
        String sql = "insert into veiculo " +
            "(tipoVeiculo,modeloVeiculo,marcaVeiculo,corVeiculo,placaVeiculo,"
                + "renavamVeiculo,vencimentoVeiculo,categoriaVeiculo,observacoesVeiculo)" +
            " values (?,?,?,?,?,?,?,?,?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            // seta os valores
            stmt.setString(1,veiculo.getTipoVeiculo());
            stmt.setString(2,veiculo.getModeloVeiculo());
            stmt.setString(3,veiculo.getMarcaVeiculo());
            stmt.setString(4,veiculo.getCorVeiculo());
            stmt.setString(5,veiculo.getPlacaVeiculo());
            stmt.setString(6,veiculo.getRenavamVeiculo());
            stmt.setString(7,veiculo.getVencimentoVeiculo());
            stmt.setString(8,veiculo.getCategoriaVeiculo());
            stmt.setString(9,veiculo.getObservacoesVeiculo());
            
            // executa
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
