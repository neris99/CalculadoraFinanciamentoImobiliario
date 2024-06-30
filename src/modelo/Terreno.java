package modelo;

public class Terreno extends Financiamento {
    private String tipoZona;

    public Terreno(double valorImovel, double juros, int anos, String tipoZona) {
        super(valorImovel, juros, anos);
        this.tipoZona = tipoZona;
    }

    @Override
    public double calcularParcela() {
        return (valorImovel * (1 + juros)) / (anos * 12);
    }
}
