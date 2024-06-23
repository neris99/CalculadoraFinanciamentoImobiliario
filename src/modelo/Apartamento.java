package modelo;

public class Apartamento extends Financiamento {
    private int numVagasGaragem;
    private int numAndar;

    public Apartamento(double valorImovel, double juros, int anos, int numVagasGaragem, int numAndar) {
        super(valorImovel, juros, anos);
        this.numVagasGaragem = numVagasGaragem;
        this.numAndar = numAndar;
    }

    @Override
    public double calcularParcela() {
        // Implementação do cálculo específico para Apartamento
        return (valorImovel * (1 + juros)) / (anos * 12);
    }

    public int getNumVagasGaragem() {
        return numVagasGaragem;
    }

    public int getNumAndar() {
        return numAndar;
    }
}
