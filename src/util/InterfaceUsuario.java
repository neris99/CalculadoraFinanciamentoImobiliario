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
}


