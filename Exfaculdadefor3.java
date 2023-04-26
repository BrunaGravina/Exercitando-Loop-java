/*Escreva um programa que receba dois valores: um valor de
inıcio e um valor de final, inteiros. Escreva um programa que
imprima na saıda padrao todos os numeros no intervalo inicial
ate o final, inclusive */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Digite o numero inicial: ");
        int inicial = e.nextInt();
        System.out.println("Digite o numero final: ");
        int ultimo = e.nextInt();

        for (int i = inicial; i <= ultimo; i++) {
            System.out.println(i);
        }


    }
}
