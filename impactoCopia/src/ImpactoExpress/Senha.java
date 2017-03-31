package ImpactoExpress;

/**
 *
 * @author joao
 * @version 1.0
 * @since 8nov2016
 * 
 */
public class Senha {
    private String senha;

    public Senha() {
    }

    public Senha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return senha;
    }
}
