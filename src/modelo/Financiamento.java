package modelo;

public abstract class Financiamento {
    protected double valorImovel;
    protected double juros;
    protected int anos;

    public Financiamento(double valorImovel, double juros, int anos) {
        this.valorImovel = valorImovel;
        this.juros = juros;
        this.anos = anos;
    }

    public abstract double calcularParcela();

    public double getValorImovel() {
        return valorImovel;
    }
}

