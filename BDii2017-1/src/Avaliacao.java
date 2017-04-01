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
public class Avaliacao {
    private int codigoAvaliacao;
    private float notaAvaliacao;
    private String comentarioAvaliaco;

    public Avaliacao() {
    }

    public Avaliacao(int codigoAvaliacao, float notaAvaliacao, String comentarioAvaliaco) {
        this.codigoAvaliacao = codigoAvaliacao;
        this.notaAvaliacao = notaAvaliacao;
        this.comentarioAvaliaco = comentarioAvaliaco;
    }

    public int getCodigoAvaliacao() {
        return codigoAvaliacao;
    }

    public void setCodigoAvaliacao(int codigoAvaliacao) {
        this.codigoAvaliacao = codigoAvaliacao;
    }

    public float getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(float notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public String getComentarioAvaliaco() {
        return comentarioAvaliaco;
    }

    public void setComentarioAvaliaco(String comentarioAvaliaco) {
        this.comentarioAvaliaco = comentarioAvaliaco;
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "codigoAvaliacao=" + codigoAvaliacao + ", notaAvaliacao=" + notaAvaliacao + ", comentarioAvaliaco=" + comentarioAvaliaco + '}';
    }
    
    
}
