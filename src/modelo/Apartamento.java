package modelo;

public class Apartamento extends Financiamento {
    private int vagasGaragem;
    private int numeroAndar;

    public Apartamento(double valorImovel, double juros, int anos, int vagasGaragem, int numeroAndar) {
        super(valorImovel, juros, anos);
        this.vagasGaragem = vagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    @Override
    public double calcularParcela() {
        return (valorImovel * (1 + juros)) / (anos * 12);
    }
}

