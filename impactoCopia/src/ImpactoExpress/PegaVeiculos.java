package ImpactoExpress;

import static ImpactoExpress.tela.veiculos;
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
public class PegaVeiculos {
    Connection connection;
    public void getListaVeiculos(){
        try{
            this .connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt = this.connection.prepareStatement("select * from veiculo");
            ResultSet rs = stmt.executeQuery();
            veiculos.clear();
            while (rs.next()) {
                // criando o objeto Contato
                Veiculo veiculo=new Veiculo();
                
                veiculo.setCodVeiculo(rs.getInt("codVeiculo"));
                veiculo.setTipoVeiculo(rs.getString("tipoVeiculo"));
                veiculo.setModeloVeiculo(rs.getString("modeloVeiculo"));
                veiculo.setMarcaVeiculo(rs.getString("marcaVeiculo"));
                veiculo.setCorVeiculo(rs.getString("corVeiculo"));
                veiculo.setPlacaVeiculo(rs.getString("placaVeiculo"));
                veiculo.setRenavamVeiculo(rs.getString("renavamVeiculo"));
                veiculo.setVencimentoVeiculo(rs.getString("vencimentoVeiculo"));
                veiculo.setCategoriaVeiculo(rs.getString("categoriaVeiculo"));
                veiculo.setObservacoesVeiculo(rs.getString("observacoesVeiculo"));
                
                // adicionando o objeto à lista
                veiculos.add(veiculo);
         }
         rs.close();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
    }
}
