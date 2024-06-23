package util;

import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner = new Scanner(System.in);

    public double pedirValorImovel() {
        double valor;
        do {
            System.out.print("Qual valor do imóvel? ");
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.println("O valor do imóvel deve ser positivo.");
            }
        } while (valor <= 0);
        return valor;
    }

    public int pedirPrazoFinanciamento() {
        int prazo;
        do {
            System.out.print("Qual prazo do Financiamento (em anos)? ");
            prazo = scanner.nextInt();
            if (prazo <= 0) {
                System.out.println("O prazo do financiamento deve ser positivo.");
            }
        } while (prazo <= 0);
        return prazo;
    }

    public double pedirTaxaJuros() {
        double taxa;
        do {
            System.out.print("Qual será a Taxa de Juros para esse Financiamento? ");
            taxa = scanner.nextDouble();
            if (taxa <= 0) {
                System.out.println("A taxa de juros deve ser positiva.");
            }
        } while (taxa <= 0);
        return taxa;
    }

    public double pedirTamanhoAreaConstruida() {
        double tamanho;
        do {
            System.out.print("Qual o tamanho da área construída? ");
            tamanho = scanner.nextDouble();
            if (tamanho <= 0) {
                System.out.println("O tamanho da área construída deve ser positivo.");
            }
        } while (tamanho <= 0);
        return tamanho;
    }

    public double pedirTamanhoTerreno() {
        double tamanho;
        do {
            System.out.print("Qual o tamanho do terreno? ");
            tamanho = scanner.nextDouble();
            if (tamanho <= 0) {
                System.out.println("O tamanho do terreno deve ser positivo.");
            }
        } while (tamanho <= 0);
        return tamanho;
    }

    public int pedirNumVagasGaragem() {
        int vagas;
        do {
            System.out.print("Quantas vagas de garagem? ");
            vagas = scanner.nextInt();
            if (vagas < 0) {
                System.out.println("O número de vagas de garagem deve ser não negativo.");
            }
        } while (vagas < 0);
        return vagas;
    }

    public int pedirNumAndar() {
        int andar;
        do {
            System.out.print("Qual o número do andar? ");
            andar = scanner.nextInt();
            if (andar <= 0) {
                System.out.println("O número do andar deve ser positivo.");
            }
        } while (andar <= 0);
        return andar;
    }

    public String pedirTipoZona() {
        System.out.print("Qual o tipo de zona (residencial/comercial)? ");
        return scanner.next();
    }
}
