import java.util.*;
import java.util.Map.Entry;

/*
  Nome do Autor: Gustavo Menescal
  Data da criação do programa: 28/07/2022
  Última data de alteração: 28/07/2022
  Objetivo da classe/programa: Exercício 3 da Semana 4
  ==> Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever
  se existem números repetidos no vetor VET e em que posições se encontram.

*/


public class Exercicio3 {

    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("------------------------NÚMEROS REPETIDOS-----------------------------------\n");
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 50; i++) { // Define a quantida de posições.
            numeros.add(entrada.nextInt());
        }

        Map<Integer, List<Integer>> cont = new LinkedHashMap<>();
        for (int i = 0; i < numeros.size(); i++) {
            int n = numeros.get(i);
            if (!cont.containsKey(n)) {
                cont.put(n, new ArrayList<>());
            }
                        cont.get(n).add(i); // Adiciona "i" na lista de posições em que o número aparece
        }

        for (Entry<Integer, List<Integer>> entry : cont.entrySet()) {
            List<Integer> posicoes = entry.getValue();
            if (posicoes.size() > 1) {
                System.out.printf("Número %d se repete %d vezes nas posições: %s\n", entry.getKey(), posicoes.size(), posicoes);



            }

        }
        System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
    }
}
