package modelo;

import util.DescontoMaiorDoQueJurosException;

public class Casa extends Financiamento {
    private double areaConstruida;
    private double tamanhoTerreno;
    private double desconto;

    public Casa(double valorImovel, double taxaJuros, int prazo, double areaConstruida, double tamanhoTerreno, double desconto) {
        super(valorImovel, taxaJuros, prazo);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
        this.desconto = desconto;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public double getTamanhoTerreno() {
        return tamanhoTerreno;
    }

    @Override
    public double calcularParcela() throws DescontoMaiorDoQueJurosException {
        double juros = getTaxaJuros() * getValorImovel() / getPrazo();
        if (desconto > juros) {
            throw new DescontoMaiorDoQueJurosException("Desconto é maior do que os juros!");
        }
        return (getValorImovel() - desconto) / getPrazo() + juros;
    }

    @Override
    public String toString() {
        return super.toString() + ", Casa{" +
                "areaConstruida=" + areaConstruida +
                ", tamanhoTerreno=" + tamanhoTerreno +
                '}';
    }
}

