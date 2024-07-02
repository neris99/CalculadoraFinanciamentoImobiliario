package modelo;

public class Apartamento extends Financiamento {
    private static final long serialVersionUID = 1L;

    private int vagasGaragem;
    private int numeroAndar;

    public Apartamento(double valorImovel, double taxaJuros, int prazo, int vagasGaragem, int numeroAndar) {
        super(valorImovel, taxaJuros, prazo);
        this.vagasGaragem = vagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public int getNumeroAndar() {
        return numeroAndar;
    }

    @Override
    public double calcularParcela() {
        // Implementação do cálculo da parcela
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Apartamento{" +
                "vagasGaragem=" + vagasGaragem +
                ", numeroAndar=" + numeroAndar +
                '}';
    }
}
