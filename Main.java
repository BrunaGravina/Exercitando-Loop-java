/* Escreva um programa que leia 10 palavras que um usuario
possa digitar, e quando o usuario digitar ”PARE” termine o
programa; */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        for (int contador = 0; contador < 10; contador++) {
            System.out.println("Digite uma palavra: ");
            String palavra = e.next();
            if ("PARE".equalsIgnoreCase(palavra)) {
                break;
            }


        }

    }
}