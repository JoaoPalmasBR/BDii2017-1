/*
 * Copyright 2017 joao.
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

/**
 *
 * @author joao
 */
public class Leitor {
    private int codigoLeitor;
    private String nomeLeitor, CPFLeitor, emailLeitor, interesseLeitor;
    private Endereco enderecoLeitor;
    private Telefone telefoneLeitor;

    public Leitor() {
    }

    public Leitor(int codigoLeitor, String nomeLeitor, String CPFLeitor, String emailLeitor, String interesseLeitor, Endereco enderecoLeitor, Telefone telefoneLeitor) {
        this.codigoLeitor = codigoLeitor;
        this.nomeLeitor = nomeLeitor;
        this.CPFLeitor = CPFLeitor;
        this.emailLeitor = emailLeitor;
        this.interesseLeitor = interesseLeitor;
        this.enderecoLeitor = enderecoLeitor;
        this.telefoneLeitor = telefoneLeitor;
    }

    public int getCodigoLeitor() {
        return codigoLeitor;
    }

    public void setCodigoLeitor(int codigoLeitor) {
        this.codigoLeitor = codigoLeitor;
    }

    public String getNomeLeitor() {
        return nomeLeitor;
    }

    public void setNomeLeitor(String nomeLeitor) {
        this.nomeLeitor = nomeLeitor;
    }

    public String getCPFLeitor() {
        return CPFLeitor;
    }

    public void setCPFLeitor(String CPFLeitor) {
        this.CPFLeitor = CPFLeitor;
    }

    public String getEmailLeitor() {
        return emailLeitor;
    }

    public void setEmailLeitor(String emailLeitor) {
        this.emailLeitor = emailLeitor;
    }

    public String getInteresseLeitor() {
        return interesseLeitor;
    }

    public void setInteresseLeitor(String interesseLeitor) {
        this.interesseLeitor = interesseLeitor;
    }

    public Endereco getEnderecoLeitor() {
        return enderecoLeitor;
    }

    public void setEnderecoLeitor(Endereco enderecoLeitor) {
        this.enderecoLeitor = enderecoLeitor;
    }

    public Telefone getTelefoneLeitor() {
        return telefoneLeitor;
    }

    public void setTelefoneLeitor(Telefone telefoneLeitor) {
        this.telefoneLeitor = telefoneLeitor;
    }

    @Override
    public String toString() {
        return "Leitor{" + "codigoLeitor=" + codigoLeitor + ", nomeLeitor=" + nomeLeitor + ", CPFLeitor=" + CPFLeitor + ", emailLeitor=" + emailLeitor + ", interesseLeitor=" + interesseLeitor + ", enderecoLeitor=" + enderecoLeitor + ", telefoneLeitor=" + telefoneLeitor + '}';
    }
    
    
}
