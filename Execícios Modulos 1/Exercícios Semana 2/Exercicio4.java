package br.com.futurodev.exerciciossegundasemana;

/*
  Nome do Autor: Gustavo Menescal
  Data da cria��o do programa: 14/07/2022
  �ltima data de altera��o: 14/07/2022
  Objetivo da classe/programa: Exerc�cio 4 da Semana 2.
  ==> Crie um programa que pe�a um n�mero ao usu�rio e armazene ele na vari�vel x. Depois pe�a outro n�mero e armazene
  na vari�vel y. Mostre esses n�meros. Em seguida, fa�a com que x passe a ter o valor de y, e que y passe a ter o
  valor de x.
*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("------------------------TROCA DE VARI�VEIS-----------------------------------\n");

        Scanner scanner = new Scanner(System.in);
        int X,Y,TEMP;
        System.out.println("Digite o valor de X: ");
        X = scanner.nextInt();
        System.out.println("Digite o valor de Y: ");
        Y = scanner.nextInt();
        // Inclus�o de uma vari�vel tempor�ria.
        TEMP = X;
        X = Y;
        Y = TEMP;

        System.out.println("X = "+X+" | Y = "+Y+"" );

        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }
}
