package br.com.futurodev.exerciciossegundasemana;

import java.util.Scanner;

/*
  Nome do Autor: Gustavo Menescal
  Data da cria��o do programa: 14/07/2022
  �ltima data de altera��o: 14/07/2022
  Objetivo da classe/programa: Exerc�cio 6 da Semana 2.
*/
public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("------------------------TIPOS DE TRI�NGULOS-----------------------------------\n");
        Scanner scanner = new Scanner(System.in);
        //Local de declara��o das vari�veis (lados do tri�ngulo).
        int lado1, lado2, lado3;
        //Local de entrada de dados dos lados do tri�ngulo.
        System.out.println("Digite o valor do lado 1: ");
        lado1 = scanner.nextInt();
        System.out.println("Digite o valor do lado 2:");
        lado2 = scanner.nextInt();
        System.out.println("Digite o valor do lado 3");
        lado3 = scanner.nextInt();
        if ((lado1 == lado2) && (lado2 == lado3)){
            System.out.println("Seu Tri�ngulo � Equil�tero.");
        }else if ((lado1==lado2) && (lado2!=lado3) || (lado1!=lado2) && (lado2==lado3) || (lado1!=lado2) && (lado1==lado3)) {
            System.out.println("Seu Tri�ngulo � Is�sceles.");
        }else if ((lado1!=lado2) && (lado2!=lado3)) {
            System.out.println("Seu Tri�ngulo � Escaleno.");
        }
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
}}
