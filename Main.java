/* Escreva um programa que gere a tabuada de qualquer numero
de zero a 10;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("De que numero gostaria de saber a tabuada? ");
        int tabuada = e.nextInt();

        for (int count = 0; count <= 10; count++) {
            int resultado = tabuada * count;
            System.out.println(tabuada + "x" + count + "=" + resultado);
        }
    }
}