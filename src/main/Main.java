package main;

import modelo.*;
import util.DescontoMaiorDoQueJurosException;
import util.InterfaceUsuario;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Financiamento> financiamentos = new ArrayList<>();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        Financiamento financiamento = null;

        // Captura os dados do financiamento
        try {
            financiamento = interfaceUsuario.capturarDadosFinanciamento();
        } catch (Exception e) {
            System.out.println("Erro ao capturar dados do financiamento: " + e.getMessage());
            return;
        }

        try {
            if (financiamento != null) {
                financiamentos.add(financiamento);
                imprimirDetalhesFinanciamento(financiamento);
            }
        } catch (DescontoMaiorDoQueJurosException e) {
            System.out.println("Erro ao calcular financiamento: " + e.getMessage());
        }

        // Salvando dados em arquivo de texto
        salvarFinanciamentosTexto(financiamentos);

        // Lendo dados do arquivo de texto
        lerFinanciamentosTexto();
    }

    public static void imprimirDetalhesFinanciamento(Financiamento financiamento) throws DescontoMaiorDoQueJurosException {
        System.out.println("Detalhes do Financiamento: " + financiamento);
        System.out.println("Parcela Mensal: " + financiamento.calcularParcela());
    }

    public static void salvarFinanciamentosTexto(ArrayList<Financiamento> financiamentos) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("financiamentos.txt"))) {
            for (Financiamento financiamento : financiamentos) {
                writer.println(financiamento.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerFinanciamentosTexto() {
        try (BufferedReader reader = new BufferedReader(new FileReader("financiamentos.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
