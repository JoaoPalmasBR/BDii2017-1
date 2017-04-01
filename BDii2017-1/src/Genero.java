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
public class Genero {
    private int codigoGenero;
    private String nomeGenero;

    public Genero() {
    }

    public Genero(int codigoGenero, String nomeGenero) {
        this.codigoGenero = codigoGenero;
        this.nomeGenero = nomeGenero;
    }

    public int getCodigoGenero() {
        return codigoGenero;
    }

    public void setCodigoGenero(int codigoGenero) {
        this.codigoGenero = codigoGenero;
    }

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    @Override
    public String toString() {
        return "Genero{" + "codigoGenero=" + codigoGenero + ", nomeGenero=" + nomeGenero + '}';
    }
    
    
}
