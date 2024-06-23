package modelo;

public class Financiamento {
    // Atributos
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // Construtor
    public Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Getters
    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    // Métodos
    public double calcularPagamentoMensal() {
        double taxaJurosMensal = this.taxaJurosAnual / 12;
        int totalParcelas = this.prazoFinanciamento * 12;
        return (valorImovel * taxaJurosMensal) / (1 - Math.pow(1 + taxaJurosMensal, -totalParcelas));
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    public void mostrarDadosFinanciamento() {
        System.out.println("Valor do Imóvel: R$ " + this.valorImovel);
        System.out.println("Prazo do Financiamento (em anos): " + this.prazoFinanciamento);
        System.out.println("Taxa de Juros Anual: " + this.taxaJurosAnual);
        System.out.println("Pagamento Mensal: R$ " + calcularPagamentoMensal());
        System.out.println("Total Pago no Financiamento: R$ " + calcularTotalPagamento());
    }
}
