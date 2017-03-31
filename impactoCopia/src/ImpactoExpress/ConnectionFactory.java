package ImpactoExpress;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author joao
 * @version 1.0
 * @since 8nov2016
 * 
 */
public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://joaoantoniosantos.com.br:3306/joaoa870_impacto1","joaoa870_joao","joaoantonio2012");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
