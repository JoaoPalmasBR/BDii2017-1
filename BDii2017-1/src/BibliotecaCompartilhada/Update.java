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

import static BibliotecaCompartilhada.Biblioteca.leitores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author Joao Antonio
 */
public class Update {
    Connection connection;
    public void getLeitores(){
        try{
            this.connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt = this.connection.prepareStatement("select * from Leitor");
            ResultSet rs = stmt.executeQuery();
            leitores.clear();
            while (rs.next()) {
                // criando o objeto Contato
                Leitor leitor = new Leitor();
                /*
                leitor.setIdCliente(rs.getInt("idCliente"));
                leitor.setNomeCliente(rs.getString("nomeCliente"));
                leitor.setEmailCliente(rs.getString("emailCliente"));
                leitor.setTelefone1Cliente(rs.getString("telefone1Cliente"));
                leitor.setTelefone2Cliente(rs.getString("telefone2Cliente"));
                leitor.setCidadeCliente(rs.getString("cidadeCliente"));
                leitor.setEnderecoCliente(rs.getString("enderecoCliente"));
                */
                // adicionando o objeto à lista
                leitores.add(leitor);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /*
    public void getFuncionarios(){
        try{
            this.connection = new ConnectionFactory().getConnection();
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
    public void getVeiculos(){
        try{
            this.connection = new ConnectionFactory().getConnection();
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
    public void getSenha(){
        try{
            this.connection = new ConnectionFactory().getConnection();
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
        XSenhaDao dao = new XSenhaDao();
        // método elegante
        dao.adiciona(senha1);
        senhaFinal=senha1.getSenha();
    }
    */
}