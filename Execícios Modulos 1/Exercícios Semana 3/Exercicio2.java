package br.com.futurodev.calcularvolume.exercicios;

/*
  Nome do Autor: Gustavo Menescal
  Data da cria��o do programa: 23/07/2022
  �ltima data de altera��o: 25/07/2022
  Objetivo da classe/programa: Exerc�cio 2 da Semana 3
  ==> Crie um array de 3 posi��es e pergunte ao usu�rio 3 notas.
Ap�s o usu�rio inseri-las, calcule e exiba a m�dia.

*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("------------------------CALCULAR M�DIA - ARRAY-----------------------------------\n");
        final int TAMANHO_ARRAY = 3; // Constante indicando o tamanho do array

        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[TAMANHO_ARRAY]; // Cria um array do tamanho de TAMANHO_ARRAY

        System.out.println("Informe " + TAMANHO_ARRAY + " notas para calcular a m�dia:");
        for (int i = 0; i < notas.length; i++) { // La�o de repeti��o que executa enquanto n�o percorrer o array inteiro
            notas[i] = entrada.nextDouble();
        }

        double media = 0;
        for (double nota : notas) { // Percorre o array
            media += nota; // Realiza a soma de "media" e "nota"
        }
        media /= TAMANHO_ARRAY; // Divide a "media" por "TAMANHO_ARRAY"
        System.out.print("Sua m�dia �: " + media);

        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");

    }
}
