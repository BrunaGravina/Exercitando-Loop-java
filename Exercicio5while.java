/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio5while;

import java.util.Scanner;

/**
 *
 * @author bruna
 */
public class Exercicio5while {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
         int i1 = 0;
        int i = 0;
        boolean primeironum = false;

        System.out.println("Digite os números desejados (digite 'fim' para sair):");

        while (true) {
            String entrada = e.nextLine();

            if (entrada.equals("fim")) {
                break;
            }

            int numero = Integer.parseInt(entrada);

            if (!primeironum) {
                i1 = numero;
                primeironum = true;
            }

            i = numero;
        }

        System.out.println("Primeiro número digitado: " + i1);
        System.out.println("Último número digitado: " + i);
        
       
        
    }
}
