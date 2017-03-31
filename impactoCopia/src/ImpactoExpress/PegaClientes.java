package ImpactoExpress;

import static ImpactoExpress.tela.clientes;
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
public class PegaClientes {
    Connection connection;
    public void getListaClientes(){
        try{
            this .connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt = this.connection.prepareStatement("select * from cliente");
            ResultSet rs = stmt.executeQuery();
            clientes.clear();
            while (rs.next()) {
                // criando o objeto Contato
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setEmailCliente(rs.getString("emailCliente"));
                cliente.setTelefone1Cliente(rs.getString("telefone1Cliente"));
                cliente.setTelefone2Cliente(rs.getString("telefone2Cliente"));
                cliente.setCidadeCliente(rs.getString("cidadeCliente"));
                cliente.setEnderecoCliente(rs.getString("enderecoCliente"));
                
                // adicionando o objeto à lista
                clientes.add(cliente);
         }
         rs.close();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
    }
}
