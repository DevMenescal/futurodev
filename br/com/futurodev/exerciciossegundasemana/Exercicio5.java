package br.com.futurodev.exerciciossegundasemana;

/*
  Nome do Autor: Gustavo Menescal
  Data da cria��o do programa: 14/07/2022
  �ltima data de altera��o: 14/07/2022
  Objetivo da classe/programa: Exerc�cio 5 da Semana 2.
*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("------------------------M�DIA DO ALUNO-----------------------------------\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A m�dia do aluno �: " + media);
        if(media>=6){
        System.out.println("\nAluno Aprovado!!!");}
         else if (media<6){
         System.out.println("\nAluno Reprovado!!!");
            }
         System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
        }

}
