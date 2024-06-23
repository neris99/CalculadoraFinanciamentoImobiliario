package main;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;
import util.InterfaceUsuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterfaceUsuario iu = new InterfaceUsuario();
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        while (true) {
            System.out.println("Escolha o tipo de financiamento:");
            System.out.println("1. Casa");
            System.out.println("2. Apartamento");
            System.out.println("3. Terreno");
            System.out.println("4. Sair");
            int escolha = scanner.nextInt();

            if (escolha == 4) {
                break;
            }

            double valorImovel = iu.pedirValorImovel();
            double taxaJuros = iu.pedirTaxaJuros();
            int prazo = iu.pedirPrazoFinanciamento();
            Financiamento financiamento = null;

            switch (escolha) {
                case 1:
                    double tamanhoAreaConstruida = iu.pedirTamanhoAreaConstruida();
                    double tamanhoTerreno = iu.pedirTamanhoTerreno();
                    financiamento = new Casa(valorImovel, taxaJuros, prazo, tamanhoAreaConstruida, tamanhoTerreno);
                    break;
                case 2:
                    int numVagasGaragem = iu.pedirNumVagasGaragem();
                    int numAndar = iu.pedirNumAndar();
                    financiamento = new Apartamento(valorImovel, taxaJuros, prazo, numVagasGaragem, numAndar);
                    break;
                case 3:
                    String tipoZona = iu.pedirTipoZona();
                    financiamento = new Terreno(valorImovel, taxaJuros, prazo, tipoZona);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            if (financiamento != null) {
                financiamentos.add(financiamento);
                imprimirDetalhesFinanciamento(financiamento);
            }
        }

        // Calculando soma dos valores dos imóveis e financiamentos
        double somaImoveis = 0;
        double somaParcelas = 0;
        for (Financiamento f : financiamentos) {
            somaImoveis += f.getValorImovel();
            somaParcelas += f.calcularParcela();
        }

        System.out.println("Soma dos valores dos imóveis: " + somaImoveis);
        System.out.println("Soma dos valores dos financiamentos: " + somaParcelas);
    }

    private static void imprimirDetalhesFinanciamento(Financiamento f) {
        System.out.println("Detalhes do financiamento:");
        System.out.println("Tipo de Imóvel: " + f.getClass().getSimpleName());
        System.out.println("Valor do Imóvel: " + f.getValorImovel());
        System.out.println("Juros: " + f.getJuros());
        System.out.println("Anos: " + f.getAnos());
        System.out.println("Valor da Parcela: " + f.calcularParcela());

        if (f instanceof Casa) {
            Casa casa = (Casa) f;
            System.out.println("Tamanho da Área Construída: " + casa.getTamanhoAreaConstruida());
            System.out.println("Tamanho do Terreno: " + casa.getTamanhoTerreno());
        } else if (f instanceof Apartamento) {
            Apartamento apartamento = (Apartamento) f;
            System.out.println("Número de Vagas da Garagem: " + apartamento.getNumVagasGaragem());
            System.out.println("Número do Andar: " + apartamento.getNumAndar());
        } else if (f instanceof Terreno) {
            Terreno terreno = (Terreno) f;
            System.out.println("Tipo de Zona: " + terreno.getTipoZona());
        }
        System.out.println();
    }
}
