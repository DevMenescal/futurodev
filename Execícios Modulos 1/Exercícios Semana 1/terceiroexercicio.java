package br.com.futurodev.terceiroexercicio;

import java.util.Scanner;

/*
  Nome do Autor: Gustavo Menescal
  Data da cria��o do programa: 08/07/2022
  �ltima data de altera��o: 08/07/2022
  Objetivo da classe/programa: Exerc�cio 3 da Semana 1
  ==> Criar um projeto com nome "TerceiroExercicio" onde o usu�rio insira seu passatempo favorito e
  a frequ�ncia com que realiza (utilizar um tipo num�rico). Ap�s a intera��o com o usu�rio, exibir as
  respostas no console.
*/

public class terceiroexercicio {
    public static void main(String[] args) {
        System.out.println("------------------------PASSATEMPO-----------------------------------\n");
        Scanner escaner = new Scanner(System.in);
        System.out.print("Insira o seu passatempo favorito: ");
        String passatempo = escaner.nextLine();
        System.out.print("Digite a frequ�ncia: ");
        byte frequencia = escaner.nextByte();
        System.out.println("Seu passatempo �: " + passatempo);
        System.out.println("Sua frequ�ncia �: " + frequencia);
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }
}
