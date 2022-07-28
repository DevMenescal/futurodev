import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
  Nome do Autor: Gustavo Menescal
  Data da criação do programa: 28/07/2022
  Última data de alteração: 28/07/2022
  Objetivo da classe/programa: Exercício 4 da Semana 4
  ==> Crie um programa que leia 10 números fornecidos pelo usuário e após isso os coloque em
  ordem decrescente. A lista deve ser uma ArrayList.
*/


public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("------------------------ORDENANDO NÚMEROS-----------------------------------\n");
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 10; i++) { // Limita a lista a 10 números.
            lista.add(i);
        }

        Collections.sort(lista); // Classifica a lista em ordem crescente.
        Collections.reverse(lista); // Classifica a lista em ordem decrescente.

        for (Integer i : lista) {
            System.out.print(i + " \n");

                }
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }
}