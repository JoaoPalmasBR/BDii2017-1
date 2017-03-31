package ImpactoExpress;
/**
 *
 * @author joao
 * @version 1.0
 * @since 8nov2016
 * 
 */
public class Veiculo {
    private int codVeiculo;
    private String tipoVeiculo,modeloVeiculo;
    private String marcaVeiculo,corVeiculo;
    private String placaVeiculo,renavamVeiculo;
    private String vencimentoVeiculo,categoriaVeiculo;
    private String observacoesVeiculo;

    public Veiculo() {
    }

    public Veiculo(int codVeiculo, String tipoVeiculo, String modeloVeiculo, String marcaVeiculo, String corVeiculo, String placaVeiculo, String renavamVeiculo, String VencimentoVeiculo, String categoriaVeiculo, String observacoesVeiculo) {
        this.codVeiculo = codVeiculo;
        this.tipoVeiculo = tipoVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.corVeiculo = corVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.renavamVeiculo = renavamVeiculo;
        this.vencimentoVeiculo = VencimentoVeiculo;
        this.categoriaVeiculo = categoriaVeiculo;
        this.observacoesVeiculo = observacoesVeiculo;
    }

    public int getCodVeiculo() {
        return codVeiculo;
    }

    public void setCodVeiculo(int codVeiculo) {
        this.codVeiculo = codVeiculo;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getCorVeiculo() {
        return corVeiculo;
    }

    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getRenavamVeiculo() {
        return renavamVeiculo;
    }

    public void setRenavamVeiculo(String renavamVeiculo) {
        this.renavamVeiculo = renavamVeiculo;
    }

    public String getVencimentoVeiculo() {
        return vencimentoVeiculo;
    }

    public void setVencimentoVeiculo(String VencimentoVeiculo) {
        this.vencimentoVeiculo = VencimentoVeiculo;
    }

    public String getCategoriaVeiculo() {
        return categoriaVeiculo;
    }

    public void setCategoriaVeiculo(String categoriaVeiculo) {
        this.categoriaVeiculo = categoriaVeiculo;
    }

    public String getObservacoesVeiculo() {
        return observacoesVeiculo;
    }

    public void setObservacoesVeiculo(String observacoesVeiculo) {
        this.observacoesVeiculo = observacoesVeiculo;
    }

    @Override
    public String toString() {
        return "codVeiculo=" + codVeiculo + ", tipoVeiculo=" + tipoVeiculo + ", modeloVeiculo=" + modeloVeiculo + ", marcaVeiculo=" + marcaVeiculo + ", corVeiculo=" + corVeiculo + ", placaVeiculo=" + placaVeiculo + ", renavamVeiculo=" + renavamVeiculo + ", vencimentoVeiculo=" + vencimentoVeiculo + ", categoriaVeiculo=" + categoriaVeiculo + ", observacoesVeiculo=" + observacoesVeiculo;
    }
    
    
}