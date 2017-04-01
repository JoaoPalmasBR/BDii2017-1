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


/**
 *
 * @author joao
 */
public class Autor {
    private int codigoAutor;
    private String nomeAutor, paisAutor;

    public Autor() {
    }

    public Autor(int codigoAutor, String nomeAutor, String paisAutor) {
        this.codigoAutor = codigoAutor;
        this.nomeAutor = nomeAutor;
        this.paisAutor = paisAutor;
    }

    public int getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getPaisAutor() {
        return paisAutor;
    }

    public void setPaisAutor(String paisAutor) {
        this.paisAutor = paisAutor;
    }

    @Override
    public String toString() {
        return "Autor{" + "codigoAutor=" + codigoAutor + ", nomeAutor=" + nomeAutor + ", paisAutor=" + paisAutor + '}';
    }
    
    
}
