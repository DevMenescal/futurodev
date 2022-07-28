package br.com.futurodev.terceiroexercicio;

import java.util.Scanner;

/*
  Nome do Autor: Gustavo Menescal
  Data da criação do programa: 08/07/2022
  Última data de alteração: 08/07/2022
  Objetivo da classe/programa: Exercício 3 da Semana 1
  ==> Criar um projeto com nome "TerceiroExercicio" onde o usuário insira seu passatempo favorito e
  a frequência com que realiza (utilizar um tipo numérico). Após a interação com o usuário, exibir as
  respostas no console.
*/

public class terceiroexercicio {
    public static void main(String[] args) {
        System.out.println("------------------------PASSATEMPO-----------------------------------\n");
        Scanner escaner = new Scanner(System.in);
        System.out.print("Insira o seu passatempo favorito: ");
        String passatempo = escaner.nextLine();
        System.out.print("Digite a frequência: ");
        byte frequencia = escaner.nextByte();
        System.out.println("Seu passatempo é: " + passatempo);
        System.out.println("Sua frequência é: " + frequencia);
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }
}
