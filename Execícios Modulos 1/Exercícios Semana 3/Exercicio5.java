package br.com.futurodev.calcularvolume.exercicios;

/*
  Nome do Autor: Gustavo Menescal
  Data da criação do programa: 23/07/2022
  Última data de alteração: 25/07/2022
  Objetivo da classe/programa: Exercício 5 da Semana 3
  ==> Utilizando o laço "do-while", peça ao usuário que informe seus passatempos preferidos.
  Armazene-os em um ArrayList até que o usuário escreva "fechar". Ao sair do laço, mostrar no console
  todos os passatempos inseridos.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("------------------------HOBBY - DO - WHILE-----------------------------------\n");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seus passatempos (para sair digite \"fechar\"):");
        List<String> passatempos = new ArrayList<>();
        String passatempoInformado;
        do{
            passatempoInformado = entrada.nextLine();
            if (!passatempoInformado.toUpperCase().equals("FECHAR")) { // ".toUpperCase" transforma o conteúdo de "passatempo" em MAIÚSCULO
                passatempos.add(passatempoInformado); // Adiciona na lista de passatempos
                System.out.println("Passatempo inserido com sucesso!\n");
            }
        } while (!passatempoInformado.toUpperCase().equals("FECHAR")); // Repete o laço enquanto o usuário NÃO digitar

        System.out.println("\nSeus passatempos inseridos foram:");
        for (String passatempo : passatempos) { // Percorre a lista de passatempos
            System.out.println(passatempo);
        }

        System.out.print("\n"); // Imprime quebra de linha
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }

}
