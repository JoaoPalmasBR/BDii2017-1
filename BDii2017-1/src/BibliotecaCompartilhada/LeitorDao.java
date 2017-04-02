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
public class LeitorDao {
    // a conexão com o banco de dados
    private Connection connection;
    public LeitorDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Leitor leitor) {
        String sql = "insert into Leitor (nomeLeitor,CPFLeitor,emailLeitor,"
                + "interesseLeitor,enderecoLeitor,telefoneLeitor)" +
            " values (?,?,?,?,?,?)";
        try (
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,leitor.getNomeLeitor());
            stmt.setString(2,leitor.getCPFLeitor());
            stmt.setString(3,leitor.getEmailLeitor());
            stmt.setString(4,leitor.getInteresseLeitor());
            stmt.setInt(5,leitor.getEnderecoLeitor().getCodigoEndereco());
            stmt.setInt(6,leitor.getTelefoneLeitor().getCodigoTelefone());
            // executa
            stmt.execute();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void remover(Leitor leitor){
        String sql = "delete from Leitor where CPFLeitor = ?;"
                + "delete from Telefone where codigoTelefone = ?;"
                + "delete from Endereco where codigoEndereco = ?;";
        try (
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,leitor.getCPFLeitor());
            stmt.setInt(2,leitor.getTelefoneLeitor().getCodigoTelefone());
            stmt.setInt(3,leitor.getEnderecoLeitor().getCodigoEndereco());
            // executa
            stmt.execute();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}