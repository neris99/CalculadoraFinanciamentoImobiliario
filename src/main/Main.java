package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Financiamento> listaDeFinanciamento = new ArrayList<>();

        // Adicionando quatro financiamentos
        listaDeFinanciamento.add(new Financiamento(200000, 30, 0.05));
        listaDeFinanciamento.add(new Financiamento(300000, 30, 0.05));
        listaDeFinanciamento.add(new Financiamento(150000, 30, 0.05));
        listaDeFinanciamento.add(new Financiamento(250000, 30, 0.05));

        // Mostrando os detalhes de cada financiamento
        for (int i = 0; i < listaDeFinanciamento.size(); i++) {
            Financiamento financiamento = listaDeFinanciamento.get(i);
            System.out.println("Financiamento " + (i + 1) + " – valor do imóvel: R$ " + financiamento.getValorImovel() + ", valor do financiamento: R$ " + financiamento.calcularTotalPagamento());
        }

        // Calculando os valores totais
        double totalValorImoveis = 0;
        double totalValorFinanciamentos = 0;

        for (Financiamento financiamento : listaDeFinanciamento) {
            totalValorImoveis += financiamento.getValorImovel();
            totalValorFinanciamentos += financiamento.calcularTotalPagamento();
        }

        // Mostrando os resultados na tela
        System.out.println("Total de todos os imóveis: R$ " + totalValorImoveis);
        System.out.println("Total de todos os financiamentos: R$ " + totalValorFinanciamentos);

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        double taxaJuros = interfaceUsuario.pedirTaxaJuros();
        int prazoFinanciamentoEmAnos = interfaceUsuario.pedirPrazoFinanciamento();
        double valorImovel = interfaceUsuario.pedirValorImovel();

        Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamentoEmAnos, taxaJuros);
        listaDeFinanciamento.add(novoFinanciamento);

        System.out.println("Detalhes do novo financiamento:");
        novoFinanciamento.mostrarDadosFinanciamento();
    }
}
