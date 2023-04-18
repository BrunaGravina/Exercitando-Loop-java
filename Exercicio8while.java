package com.mycompany.exercicio8while;

import java.util.Scanner;

public class Exercicio8while {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Insira um numero que deseja saber a tabuada: ");
        int num = e.nextInt();
        int multiplicador = 1;

        while (multiplicador <= 10) {
            int resultado = num * multiplicador;
            System.out.println(resultado);
            multiplicador++;
           

        }

    }
}
