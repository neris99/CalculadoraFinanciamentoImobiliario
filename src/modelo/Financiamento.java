package modelo;

public abstract class Financiamento {
    private double valorImovel;
    private double taxaJuros;
    private int prazo; // Prazo agora é em anos

    public Financiamento(double valorImovel, double taxaJuros, int prazo) {
        this.valorImovel = valorImovel;
        this.taxaJuros = taxaJuros;
        this.prazo = prazo;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public int getPrazo() {
        return prazo * 12; // Convertendo anos para meses
    }

    public abstract double calcularParcela() throws util.DescontoMaiorDoQueJurosException;

    @Override
    public String toString() {
        return "Financiamento{" +
                "valorImovel=" + valorImovel +
                ", taxaJuros=" + taxaJuros +
                ", prazo=" + prazo +
                '}';
    }
}
