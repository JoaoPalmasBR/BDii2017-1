package ImpactoExpress;

import static ImpactoExpress.tela.senhaFinal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author joao
 * @version 1.0
 * @since 8nov2016
 * 
 */
public class PegaSenha {
    Connection connection;
    public void getSenha(){
        try{
            this .connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt = this.connection.prepareStatement("select senha from tb_senha where id=(select max(id)from tb_senha)");
            ResultSet rs = stmt.executeQuery();
            senhaFinal=null;
            while (rs.next()) {
                senhaFinal=rs.getString("senha");
         }
         rs.close();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
    }
    public void setSenha(){
        Senha senha1=new Senha();
        senha1.setSenha(telaSenhaAlterar.senhaNova);
        // grave nessa conexão!!!
        SenhaDao sdao = new SenhaDao();
        // método elegante
        sdao.adiciona(senha1);
        senhaFinal=senha1.getSenha();
    }
}
