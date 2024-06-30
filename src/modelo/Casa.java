package modelo;

import util.DescontoMaiorDoQueJurosException;

public class Casa extends Financiamento {
    private double areaConstruida;
    private double tamanhoTerreno;

    public Casa(double valorImovel, double juros, int anos, double areaConstruida, double tamanhoTerreno) {
        super(valorImovel, juros, anos);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    @Override
    public double calcularParcela() {
        return (valorImovel * (1 + juros)) / (anos * 12);
    }

    public double calcularParcelaComDesconto(double desconto) throws DescontoMaiorDoQueJurosException {
        if (desconto > juros) {
            throw new DescontoMaiorDoQueJurosException("Desconto maior que os juros.");
        }
        return calcularParcela() - desconto;
    }
}
