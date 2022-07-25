package br.com.futurodev.calcularvolume.exercicios;

/*
  Nome do Autor: Gustavo Menescal
  Data da cria��o do programa: 23/07/2022
  �ltima data de altera��o: 25/07/2022
  Objetivo da classe/programa: Exerc�cio 3 da Semana 3
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("------------------------Calcular M�dia - Usando ArrayList e Loop-----------------------------------\n");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de notas para calcular a m�dia:");
        int quantidade = entrada.nextInt();

        List<Double> notas = new ArrayList<>(); // Cria um array do tamanho de TAMANHO_ARRAY

        System.out.println("\nInforme abaixo as notas:");
        for (int i = 0; i < quantidade; i++) { // La�o de repeti��o que executa enquanto n�o percorrer o array inteiro
            notas.add(entrada.nextDouble());
        }

        double media = 0;
        for (double nota : notas) { // Percorre o array
            media += nota; // Realiza a soma de "media" e "nota"
        }
        media /= quantidade; // Divide a "media" pela "quantidade"
        System.out.print("Sua m�dia �: " + media);

        System.out.print("\n"); // Imprime quebra de linha
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }
}
