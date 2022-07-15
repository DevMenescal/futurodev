package br.com.futurodev.exerciciossegundasemana;

/*
  Nome do Autor: Gustavo Menescal
  Data da cria��o do programa: 14/07/2022
  �ltima data de altera��o: 14/07/2022
  Objetivo da classe/programa: Exerc�cio 2 da Semana 2
*/

import java.util.Scanner;

    public class Exercicio2 {
        public static void main(String[] args) {
            System.out.println("------------------------LEITOR DE N�MEROS-----------------------------------\n");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o n�mero 1: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o n�mero 2: ");
            double numero2 = scanner.nextDouble();

            System.out.print("Digite a opera��o (1-SOMA; 2-SUBTRA��O; 3-MULTIPLICA��O; 4-DIVIS�O): ");
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
                System.out.println("Opera��o inv�lida!");
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
                System.out.println("O n�mero " +resultado+" � par e positivo.");
            } else if(par){ // false
                System.out.println("O n�mero " +resultado+" � par e negativo.");
            } else if (positivo) { // false
                System.out.println("O n�mero " +resultado+" � impar e positivo.");
            } else {
                System.out.println("O n�mero " + resultado + " � impar e negativo.");


            }
            System.out.println("\n------------------------FIM DO PROGRAMA-----------------------------------\n");
        }
    }

