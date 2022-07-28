import java.util.Scanner;

/*
  Nome do Autor: Gustavo Menescal
  Data da cria��o do programa: 28/07/2022
  �ltima data de altera��o: 28/07/2022
  Objetivo da classe/programa: Exerc�cio 2 da Semana 4
  ==> Elabore um algoritmo que armazene em um vetor o nome de 5 convidados de uma festa
  e exiba o nome dos mesmos.
*/

public class Exercicio2 {

    public static void main(String[] args) {
        System.out.println("------------------------LISTA DE CONVIDADOS-----------------------------------\n");

        String[] convidados;// Se cria a String convidados.

        convidados = new String[5]; // Define a quantidade de convidados da lista.

        Scanner sc = new Scanner(System.in); // Incializo o Scanner para poder coletar os dados do usu�rio.

        System.out.print("Informe o nome do convidado 1: ");// Solicita ao usu�rio do primeiro convidado.

        convidados[0] = sc.nextLine(); // Aqui ele armazena o nome do convidado, solicitado acima.

        System.out.print("Informe o nome do convidado 2: ");// Solicita ao usu�rio do segundo convidado.

        convidados[1] = sc.nextLine(); // Aqui ele armazena o nome do convidado, solicitado acima.

        System.out.print("Informe o nome do convidado 3: ");// Solicita ao usu�rio do primeiro convidado.

        convidados[2] = sc.nextLine(); // Aqui ele armazena o nome do convidado, solicitado acima.

        System.out.print("Informe o nome do convidado 4: ");// Solicita ao usu�rio do primeiro convidado.

        convidados[3] = sc.nextLine(); // Aqui ele armazena o nome do convidado, solicitado acima.

        System.out.print("Informe o nome do convidado 5: ");// Solicita ao usu�rio do primeiro convidado.

        convidados[4] = sc.nextLine(); // Aqui ele armazena o nome do convidado, solicitado acima.

        System.out.println("\nLista de convidados:"); // Cabe�alho da lista de convidados.

        System.out.println("1- " + convidados[0]); // Exibe o nome do convidado da posi��o 1.

        System.out.println("2- " + convidados[1]); // Exibe o nome do convidado da posi��o 2.

        System.out.println("3- " + convidados[2]); // Exibe o nome do convidado da posi��o 3.

        System.out.println("4- " + convidados[3]); // Exibe o nome do convidado da posi��o 4.

        System.out.println("5- "+ convidados[4]); // Exibe o nome do convidado da posi��o 5.

        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");

    }
}
