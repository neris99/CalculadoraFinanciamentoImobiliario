package modelo;

public class Casa extends Financiamento {
    private double tamanhoAreaConstruida;
    private double tamanhoTerreno;

    public Casa(double valorImovel, double juros, int anos, double tamanhoAreaConstruida, double tamanhoTerreno) {
        super(valorImovel, juros, anos);
        this.tamanhoAreaConstruida = tamanhoAreaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    @Override
    public double calcularParcela() {
        // Implementação do cálculo específico para Casa
        return (valorImovel * (1 + juros)) / (anos * 12);
    }

    public double getTamanhoAreaConstruida() {
        return tamanhoAreaConstruida;
    }

    public double getTamanhoTerreno() {
        return tamanhoTerreno;
    }
}

