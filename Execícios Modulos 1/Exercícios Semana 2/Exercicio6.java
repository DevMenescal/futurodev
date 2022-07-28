package br.com.futurodev.exerciciossegundasemana;

import java.util.Scanner;

/*
  Nome do Autor: Gustavo Menescal
  Data da criação do programa: 14/07/2022
  Última data de alteração: 14/07/2022
  Objetivo da classe/programa: Exercício 6 da Semana 2.
  ==> Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um
  triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
  Três lados formam um triângulo quando a soma de quaisquer dos dois lados é maior que o terceiro.
  Triângulo Equilátero: três lados iguais;
  Triângulo Isósceles: quaisquer dois lados iguais;
  Triângulo Escaleno: três lados diferentes.
*/
public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("------------------------TIPOS DE TRIÂNGULOS-----------------------------------\n");
        Scanner scanner = new Scanner(System.in);
        //Local de declaração das variáveis (lados do triângulo).
        int lado1, lado2, lado3;
        //Local de entrada de dados dos lados do triângulo.
        System.out.println("Digite o valor do lado 1: ");
        lado1 = scanner.nextInt();
        System.out.println("Digite o valor do lado 2:");
        lado2 = scanner.nextInt();
        System.out.println("Digite o valor do lado 3");
        lado3 = scanner.nextInt();
        if ( lado1+lado2 > lado3){
            System.out.println("É um triângulo!");
            if ((lado1 == lado2) && (lado2 == lado3)){
            System.out.println("Seu Triângulo é Equilátero.");
        }else if ((lado1==lado2) && (lado2!=lado3) || (lado1!=lado2) && (lado2==lado3) || (lado1!=lado2) && (lado1==lado3)) {
            System.out.println("Seu Triângulo é Isósceles.");
        }else if ((lado1!=lado2) && (lado2!=lado3)) {
            System.out.println("Seu Triângulo é Escaleno.");
        }
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
        }
    }
}
