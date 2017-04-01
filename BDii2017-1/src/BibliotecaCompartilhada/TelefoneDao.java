/*
 * Copyright 2017 Joao Antonio.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package BibliotecaCompartilhada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Joao Antonio
 */
public class TelefoneDao {
    // a conexão com o banco de dados
    private Connection connection;
    public TelefoneDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Telefone telefone) {
        String sql = "insert into Telefone (telCelular,telResidencial, telComercial)" +
            " values (?,?,?,?)";
        try (
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,telefone.getTelCelular());
            stmt.setString(2,telefone.getTelResidencial());
            stmt.setString(3,telefone.getTelComercial());
            // executa
            stmt.execute();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}