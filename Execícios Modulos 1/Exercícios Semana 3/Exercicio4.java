package br.com.futurodev.calcularvolume.exercicios;

/*
  Nome do Autor: Gustavo Menescal
  Data da cria��o do programa: 23/07/2022
  �ltima data de altera��o: 25/07/2022
  Objetivo da classe/programa: Exerc�cio 4 da Semana 3
  ==> Crie um n�mero aleat�rio de 0 � 100 e o exiba ao usu�rio. Pe�a ao usu�rio que digite um m�ltiplo do
  n�mero aleat�rio. Somente saia do la�o caso o usu�rio informe um n�mero correto.
*/

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("------------------------N�MERO M�LTIPLO-----------------------------------\n");
        final int NUMERO_MAXIMO = 100; // N�mero m�ximo para ser sorteado

        int numeroAleatorio = new Random().nextInt(NUMERO_MAXIMO + 1); // Cria um n�mero ale�torio de 0 � "NUMERO_MAXIMO"

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um n�mero m�ltiplo de " + numeroAleatorio + ":");
        int numero = 0;
        do{
            numero = entrada.nextInt();
        } while (numero % numeroAleatorio != 0); // Repete o la�o enquanto o resto da divis�o de "numero" pelo "numeroAleatorio" N�O for ZERO (enquanto n�o for m�ltiplos)

        System.out.println("\nParab�ns! Os n�meros s�o m�ltiplos.");

        System.out.print("\n"); // Imprime quebra de linha
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");

    }
}
