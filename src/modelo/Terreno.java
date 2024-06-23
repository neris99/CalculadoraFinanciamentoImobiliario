package modelo;

public class Terreno extends Financiamento {
    private String tipoZona;

    public Terreno(double valorImovel, double juros, int anos, String tipoZona) {
        super(valorImovel, juros, anos);
        this.tipoZona = tipoZona;
    }

    @Override
    public double calcularParcela() {
        // Implementação do cálculo específico para Terreno
        return (valorImovel * (1 + juros)) / (anos * 12);
    }

    public String getTipoZona() {
        return tipoZona;
    }
}
