package br.com.futurodev.calcularvolume.exercicios;

/*
  Nome do Autor: Gustavo Menescal
  Data da criação do programa: 23/07/2022
  Última data de alteração: 25/07/2022
  Objetivo da classe/programa: Exercício 3 da Semana 3
  ==> Peça ao usuário quantas notas ele precisa informar. Armazene todas as notas em um ArrayList utilizando
  o loop que preferir (while/do-while/for).
Após informado todas as notas, utilize o laço de repetição "for" para realizar a soma de todas as notas e
posteriormente exibir a média.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("------------------------CALCULAR MÉDIA - USANDO ARRAYLIST E LOOP-----------------------------------\n");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de notas para calcular a média:");
        int quantidade = entrada.nextInt();

        List<Double> notas = new ArrayList<>(); // Cria um array do tamanho de TAMANHO_ARRAY

        System.out.println("\nInforme abaixo as notas:");
        for (int i = 0; i < quantidade; i++) { // Laço de repetição que executa enquanto não percorrer o array inteiro
            notas.add(entrada.nextDouble());
        }

        double media = 0;
        for (double nota : notas) { // Percorre o array
            media += nota; // Realiza a soma de "media" e "nota"
        }
        media /= quantidade; // Divide a "media" pela "quantidade"
        System.out.print("Sua média é: " + media);

        System.out.print("\n"); // Imprime quebra de linha
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }
}
