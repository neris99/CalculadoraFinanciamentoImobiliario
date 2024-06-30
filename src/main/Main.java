package main;

import modelo.*;
import util.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Financiamento> financiamentos = new ArrayList<>();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        Financiamento financiamento = null;

        double valor = interfaceUsuario.pedirValorImovel();
        double juros = interfaceUsuario.pedirTaxaJuros();
        int anos = interfaceUsuario.pedirPrazoFinanciamento();
        int opcao = interfaceUsuario.pedirOpcao();

        switch (opcao) {
            case 1:
                double areaConstruida = interfaceUsuario.pedirAreaConstruida();
                double tamanhoTerreno = interfaceUsuario.pedirTamanhoTerreno();
                financiamento = new Casa(valor, juros, anos, areaConstruida, tamanhoTerreno);
                break;
            case 2:
                int vagasGaragem = interfaceUsuario.pedirVagasGaragem();
                int numeroAndar = interfaceUsuario.pedirNumeroAndar();
                financiamento = new Apartamento(valor, juros, anos, vagasGaragem, numeroAndar);
                break;
            case 3:
                String tipoZona = interfaceUsuario.pedirTipoZona();
                financiamento = new Terreno(valor, juros, anos, tipoZona);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        if (financiamento != null) {
            financiamentos.add(financiamento);
            imprimirDetalhesFinanciamento(financiamento);
        }

        double somaImoveis = 0;
        double somaParcelas = 0;
        for (Financiamento f : financiamentos) {
            somaImoveis += f.getValorImovel();
            somaParcelas += f.calcularParcela();
        }

        System.out.println("Soma dos valores dos imóveis: " + somaImoveis);
        System.out.println("Soma dos valores das parcelas: " + somaParcelas);
    }

    private static void imprimirDetalhesFinanciamento(Financiamento financiamento) {
        System.out.println("Detalhes do financiamento:");
        System.out.println("Valor do imóvel: " + financiamento.getValorImovel());
        System.out.println("Valor da parcela: " + financiamento.calcularParcela());
    }
}
