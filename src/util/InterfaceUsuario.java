package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner = new Scanner(System.in);

    public double pedirValorImovel() {
        double valor = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Qual valor do imóvel? ");
                valor = scanner.nextDouble();
                if (valor <= 0) {
                    System.out.println("O valor do imóvel deve ser positivo.");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next();
            }
        }
        return valor;
    }

    public int pedirPrazoFinanciamento() {
        int prazo = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Qual prazo do financiamento (em anos)? ");
                prazo = scanner.nextInt();
                if (prazo <= 0) {
                    System.out.println("O prazo do financiamento deve ser positivo.");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next();
            }
        }
        return prazo;
    }

    public double pedirTaxaJuros() {
        double taxa = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Qual será a taxa de juros para esse financiamento? ");
                taxa = scanner.nextDouble();
                if (taxa <= 0) {
                    System.out.println("A taxa de juros deve ser positiva.");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next();
            }
        }
        return taxa;
    }

    public int pedirOpcao() {
        int opcao = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Escolha o tipo de financiamento:");
                System.out.println("1. Casa");
                System.out.println("2. Apartamento");
                System.out.println("3. Terreno");
                opcao = scanner.nextInt();
                if (opcao < 1 || opcao > 3) {
                    System.out.println("Opção inválida. Escolha entre 1, 2 ou 3.");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next();
            }
        }
        return opcao;
    }

    public double pedirAreaConstruida() {
        System.out.print("Área construída: ");
        return scanner.nextDouble();
    }

    public double pedirTamanhoTerreno() {
        System.out.print("Tamanho do terreno: ");
        return scanner.nextDouble();
    }

    public int pedirVagasGaragem() {
        System.out.print("Número de vagas da garagem: ");
        return scanner.nextInt();
    }

    public int pedirNumeroAndar() {
        System.out.print("Número do andar: ");
        return scanner.nextInt();
    }

    public String pedirTipoZona() {
        System.out.print("Tipo de zona (residencial/comercial): ");
        return scanner.next();
    }
}
