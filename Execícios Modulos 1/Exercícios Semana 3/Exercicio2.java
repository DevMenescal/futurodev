package br.com.futurodev.calcularvolume.exercicios;

/*
  Nome do Autor: Gustavo Menescal
  Data da criação do programa: 23/07/2022
  Última data de alteração: 25/07/2022
  Objetivo da classe/programa: Exercício 2 da Semana 3
  ==> Crie um array de 3 posições e pergunte ao usuário 3 notas.
Após o usuário inseri-las, calcule e exiba a média.

*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("------------------------CALCULAR MÉDIA - ARRAY-----------------------------------\n");
        final int TAMANHO_ARRAY = 3; // Constante indicando o tamanho do array

        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[TAMANHO_ARRAY]; // Cria um array do tamanho de TAMANHO_ARRAY

        System.out.println("Informe " + TAMANHO_ARRAY + " notas para calcular a média:");
        for (int i = 0; i < notas.length; i++) { // Laço de repetição que executa enquanto não percorrer o array inteiro
            notas[i] = entrada.nextDouble();
        }

        double media = 0;
        for (double nota : notas) { // Percorre o array
            media += nota; // Realiza a soma de "media" e "nota"
        }
        media /= TAMANHO_ARRAY; // Divide a "media" por "TAMANHO_ARRAY"
        System.out.print("Sua média é: " + media);

        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");

    }
}
