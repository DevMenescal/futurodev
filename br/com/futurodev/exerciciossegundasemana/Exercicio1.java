package br.com.futurodev.exerciciossegundasemana;

/*
  Nome do Autor: Gustavo Menescal
  Data da cria��o do programa: 14/07/2022
  �ltima data de altera��o: 14/07/2022
  Objetivo da classe/programa: Exerc�cio 1 da Semana 2
*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("------------------------SAL�RIOS M�NIMOS-----------------------------------\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do sal�rio do funcion�rio: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite o valor do sal�rio m�nimo: ");
        double salariominimo = scanner.nextDouble();

        double resultado = (salario/salariominimo);
        System.out.println("A quantidade de sal�rios m�nimos �: " + resultado);

        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }
}
