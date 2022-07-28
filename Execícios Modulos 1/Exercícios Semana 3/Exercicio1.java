package br.com.futurodev.calcularvolume.exercicios;

/*
  Nome do Autor: Gustavo Menescal
  Data da criação do programa: 23/07/2022
  Última data de alteração: 25/07/2022
  Objetivo da classe/programa: Exercício 1 da Semana 3
  ==> Utilizando um array de 10 posições, peça ao usuário que informe 10 números.
  O sistema deve imprimir todos no console.
*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("------------------------POPULANDO O ARRAY-----------------------------------\n");
        final int TAMANHO_ARRAY = 10; // Constante indicando o tamanho do array

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[TAMANHO_ARRAY]; // Cria um array do tamanho de TAMANHO_ARRAY

        System.out.println("Informe " + TAMANHO_ARRAY + " números: ");
        for (int i = 0; i < numeros.length; i++) { // Laço de repetição que executa enquanto não percorrer o array inteiro
            numeros[i] = entrada.nextInt();
        }

        System.out.print("Os números informados foram:");
        for (int numero : numeros) { // Percorre o array
            System.out.print(" " + numero);
        }
        System.out.print("\n"); // Imprime quebra de linha

        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }
}
