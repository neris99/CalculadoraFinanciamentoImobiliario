import java.util.Scanner;

class Financiamento{
    // Atributos

    double valorImovel;

    int prazoFinanciamento;

    double taxaJurosAnual;

    // Construtor
    Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual){
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Metodos
    double calcularPagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    double calcularTotalPagamento(){
        return calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }
}

class InterfaceUsuario{
    Scanner scanner = new Scanner(System.in);

    double pedirValorImovel(){
        System.out.print("Qual valor do imóvel?");
        double valor = scanner.nextDouble();
        return valor;
    }

    int pedirPrazoFinanciamento(){
        System.out.print("Qual prazo do Financiamento?");
        int prazo = scanner.nextInt();
        return prazo;
    }

    double pedirTaxaJuros(){
        System.out.print("Qual será a Taxa de Juros para esse Financamento?");
        double taxa = scanner.nextDouble();
        return taxa;
    }

}

public class Main {
    public static void main(String[] args) {

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        double taxaJuros = interfaceUsuario.pedirTaxaJuros();
        int prazoFinanciamentoEmAnos = interfaceUsuario.pedirPrazoFinanciamento();
        double valorImovel = interfaceUsuario.pedirValorImovel();

        Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamentoEmAnos, taxaJuros);
    }
}