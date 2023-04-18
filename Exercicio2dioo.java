
package com.mycompany.exercicio2dioo;

import java.util.Scanner;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Exercicio2dioo {

    public static void main(String[] args) {
      Scanner e = new Scanner(System.in);

        System.out.println("Digite uma nota entre zero e dez: ");
        int nota = e.nextInt();

        while (0 > nota || nota > 10) {
            System.out.println("Valor inválido, tente novamente.");
            System.out.println("Digite uma nota entre zero e dez: ");
        nota = e.nextInt();
        

        }

    }
}
   

