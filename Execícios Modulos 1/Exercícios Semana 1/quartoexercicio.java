package br.com.futurodev.quartoexercicio;

import java.util.Scanner;

/*
  Nome do Autor: Gustavo Menescal
  Data da cria��o do programa: 08/07/2022
  �ltima data de altera��o: 08/07/2022
  Objetivo da classe/programa: Exerc�cio 1 da Semana 1
  ==> Criar um projeto com nome "QuartoExercicio" onde o usu�rio digite um n�mero (at� 255)
  e transforme em um caractere. Imprimir o resultado da transforma��o (cast) no console.
*/

public class quartoexercicio {
    public static void main(String[] args) {
        System.out.println("------------------------TRANSFORMA��O-----------------------------------\n");
        Scanner escaner = new Scanner(System.in);
        System.out.print("Digite um n�mero at� 255: ");
        int resposta = escaner.nextInt();
        char letra = (char) resposta;
    System.out.print(letra);
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }
}
