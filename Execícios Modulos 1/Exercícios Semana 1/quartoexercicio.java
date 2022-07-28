package br.com.futurodev.quartoexercicio;

import java.util.Scanner;

/*
  Nome do Autor: Gustavo Menescal
  Data da criação do programa: 08/07/2022
  Última data de alteração: 08/07/2022
  Objetivo da classe/programa: Exercício 1 da Semana 1
  ==> Criar um projeto com nome "QuartoExercicio" onde o usuário digite um número (até 255)
  e transforme em um caractere. Imprimir o resultado da transformação (cast) no console.
*/

public class quartoexercicio {
    public static void main(String[] args) {
        System.out.println("------------------------TRANSFORMAÇÃO-----------------------------------\n");
        Scanner escaner = new Scanner(System.in);
        System.out.print("Digite um número até 255: ");
        int resposta = escaner.nextInt();
        char letra = (char) resposta;
    System.out.print(letra);
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }
}
