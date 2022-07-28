import java.util.HashSet;
import java.util.Set;

/*
  Nome do Autor: Gustavo Menescal
  Data da cria��o do programa: 28/07/2022
  �ltima data de altera��o: 28/07/2022
  Objetivo da classe/programa: Exerc�cio 6 da Semana 4
  ==> Crie um algoritmo que tenha uma lista de n�mero inteiro dentro dele, todos os n�meros
  repetidos devem ser removidos desta lista. Utilize Sets para esse programa.

*/

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("------------------------REMOVENDO OS REPETIDOS-----------------------------------\n");
        Set<String> numeros = new HashSet<>();

        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
        numeros.add("2"); // N�mero repetido, ele vai retornar como false e n�o vai ser printado,
        // pois o sistema remove de forma autom�tica!

        System.out.println(numeros); // Imprime na tela todos os elementos.

        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }
}
