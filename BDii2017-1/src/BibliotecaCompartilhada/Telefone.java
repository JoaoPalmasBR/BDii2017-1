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
public class Telefone {
    private int codigoTelefone;
    private String telCelular, telResidencial, telComercial;

    public Telefone() {
    }

    public Telefone(int codigoTelefone, String telCelular, String telResidencial, String telComercial) {
        this.codigoTelefone = codigoTelefone;
        this.telCelular = telCelular;
        this.telResidencial = telResidencial;
        this.telComercial = telComercial;
    }

    public int getCodigoTelefone() {
        return codigoTelefone;
    }

    public void setCodigoTelefone(int codigoTelefone) {
        this.codigoTelefone = codigoTelefone;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getTelResidencial() {
        return telResidencial;
    }

    public void setTelResidencial(String telResidencial) {
        this.telResidencial = telResidencial;
    }

    public String getTelComercial() {
        return telComercial;
    }

    public void setTelComercial(String telComercial) {
        this.telComercial = telComercial;
    }

    @Override
    public String toString() {
        return "Telefone{" + "codTelefone=" + codigoTelefone + ", telCelular=" + telCelular + ", telResidencial=" + telResidencial + ", telComercial=" + telComercial + '}';
    }
    
    
}
