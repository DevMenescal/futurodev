package br.com.futurodev.calcularvolume.exercicios;

/*
  Nome do Autor: Gustavo Menescal
  Data da criação do programa: 23/07/2022
  Última data de alteração: 25/07/2022
  Objetivo da classe/programa: Exercício 4 da Semana 3
*/

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("------------------------Número Múltiplo-----------------------------------\n");
        final int NUMERO_MAXIMO = 100; // Número máximo para ser sorteado

        int numeroAleatorio = new Random().nextInt(NUMERO_MAXIMO + 1); // Cria um número aleátorio de 0 à "NUMERO_MAXIMO"

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número múltiplo de " + numeroAleatorio + ":");
        int numero = 0;
        do{
            numero = entrada.nextInt();
        } while (numero % numeroAleatorio != 0); // Repete o laço enquanto o resto da divisão de "numero" pelo "numeroAleatorio" NÃO for ZERO (enquanto não for múltiplos)

        System.out.println("\nParabéns! Os números são múltiplos.");

        System.out.print("\n"); // Imprime quebra de linha
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");

    }
}
