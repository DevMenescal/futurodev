package br.com.futurodev.exerciciossegundasemana;

/*
  Nome do Autor: Gustavo Menescal
  Data da criação do programa: 14/07/2022
  Última data de alteração: 14/07/2022
  Objetivo da classe/programa: Exercício 1 da Semana 2
*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("------------------------SALÁRIOS MÍNIMOS-----------------------------------\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário do funcionário: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite o valor do salário mínimo: ");
        double salariominimo = scanner.nextDouble();

        double resultado = (salario/salariominimo);
        System.out.println("A quantidade de salários mínimos é: " + resultado);

        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }
}
