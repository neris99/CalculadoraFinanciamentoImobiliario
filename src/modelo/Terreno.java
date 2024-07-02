package modelo;

public class Terreno extends Financiamento {
    private static final long serialVersionUID = 1L;

    private String tipoZona;

    public Terreno(double valorImovel, double taxaJuros, int prazo, String tipoZona) {
        super(valorImovel, taxaJuros, prazo);
        this.tipoZona = tipoZona;
    }

    public String getTipoZona() {
        return tipoZona;
    }

    @Override
    public double calcularParcela() {
        // Implementação do cálculo da parcela
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Terreno{" +
                "tipoZona='" + tipoZona + '\'' +
                '}';
    }
}
