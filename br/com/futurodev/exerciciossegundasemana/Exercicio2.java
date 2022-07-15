package br.com.futurodev.exerciciossegundasemana;

/*
  Nome do Autor: Gustavo Menescal
  Data da criação do programa: 14/07/2022
  Última data de alteração: 14/07/2022
  Objetivo da classe/programa: Exercício 2 da Semana 2
*/

import java.util.Scanner;

    public class Exercicio2 {
        public static void main(String[] args) {
            System.out.println("------------------------LEITOR DE NÚMEROS-----------------------------------\n");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número 1: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o número 2: ");
            double numero2 = scanner.nextDouble();

            System.out.print("Digite a operação (1-SOMA; 2-SUBTRAÇÃO; 3-MULTIPLICAÇÃO; 4-DIVISÃO): ");
            double operacao = scanner.nextDouble();

            double resultado = 0;

            if(operacao==1){
                resultado = numero1 + numero2;
            }else if(operacao==2){
                resultado = numero1 - numero2;
            }else if(operacao==3){
                resultado = numero1 * numero2;
            }else if(operacao==4){
                resultado = numero1 / numero2;
            }else{
                System.out.println("Operação inválida!");
            }

            boolean positivo = false;
            if(resultado>=0){
                positivo = true;
            }
            boolean par = false;
            if(resultado % 2 == 0){
                par = true;
            }

            if(positivo && par){
                System.out.println("O número " +resultado+" é par e positivo.");
            } else if(par){ // false
                System.out.println("O número " +resultado+" é par e negativo.");
            } else if (positivo) { // false
                System.out.println("O número " +resultado+" é impar e positivo.");
            } else {
                System.out.println("O número " + resultado + " é impar e negativo.");


            }
            System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
        }
    }

