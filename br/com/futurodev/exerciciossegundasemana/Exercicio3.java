package br.com.futurodev.exerciciossegundasemana;

/*
  Nome do Autor: Gustavo Menescal
  Data da cria��o do programa: 14/07/2022
  �ltima data de altera��o: 14/07/2022
  Objetivo da classe/programa: Exerc�cio 3 da Semana 2.
*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("------------------------MAIOR E MENOR-----------------------------------\n");

            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o primeiro valor: ");
            int valor1 = teclado.nextInt();
            System.out.println("Digite o segundo valor: ");
            int valor2 = teclado.nextInt();
            if( valor1 < valor2)
            {
                System.out.println("O menor valor �: " + valor1);
            }
            else
            {
                System.out.println("O menor valor �: " + valor2);
            }
            if( valor1 > valor2){
                System.out.println("O maior valor �: " + valor1);
            }
            else
            {
                System.out.println("O maior valor �: " + valor2);

                    }
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
        }}

