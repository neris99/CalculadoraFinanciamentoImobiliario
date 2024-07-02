package util;

import modelo.*;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner = new Scanner(System.in);

    public Financiamento capturarDadosFinanciamento() throws DescontoMaiorDoQueJurosException {
        System.out.println("Tipo de financiamento (1 - Casa, 2 - Apartamento, 3 - Terreno): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();  // Limpar buffer

        System.out.println("Valor do imóvel: ");
        double valorImovel = scanner.nextDouble();

        System.out.println("Taxa de juros: ");
        double taxaJuros = scanner.nextDouble();

        System.out.println("Prazo (em anos): "); // Atualizado para anos
        int prazo = scanner.nextInt();

        switch (tipo) {
            case 1:
                System.out.println("Área construída: ");
                double areaConstruida = scanner.nextDouble();

                System.out.println("Tamanho do terreno: ");
                double tamanhoTerreno = scanner.nextDouble();

                System.out.println("Desconto: ");
                double desconto = scanner.nextDouble();

                return new Casa(valorImovel, taxaJuros, prazo, areaConstruida, tamanhoTerreno, desconto);

            case 2:
                System.out.println("Número de vagas da garagem: ");
                int vagasGaragem = scanner.nextInt();

                System.out.println("Número do andar: ");
                int numeroAndar = scanner.nextInt();

                return new Apartamento(valorImovel, taxaJuros, prazo, vagasGaragem, numeroAndar);

            case 3:
                System.out.println("Tipo de zona: ");
                scanner.nextLine();
                String tipoZona = scanner.nextLine();

                return new Terreno(valorImovel, taxaJuros, prazo, tipoZona);

            default:
                System.out.println("Opção inválida.");
                throw new IllegalArgumentException("Tipo de financiamento inválido.");
        }
    }
}


