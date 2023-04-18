package com.mycompany.exercicio7while;

import java.util.Scanner;

public class Exercicio7while {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Entre com dois numeros para o intervalo: ");
        int i = e.nextInt();
        int i2 = e.nextInt();

        int numanterior = i;

        while (i <= i2) {
            i++;
            int resultado = i * numanterior;
            System.out.println(resultado);
            numanterior = i;

        }
    }
}
