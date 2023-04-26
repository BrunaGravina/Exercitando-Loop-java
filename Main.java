/* Escreva um programa que que imprima os numeros de um
intervalo inserido pelo usuario, de maneira que cada numero
seja multiplicado pelo numero anterior: Ex: usuario entra com
1 e 3: programa calcula 1, 2*1, 3*2, etc.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Digite o intervalo: ");
        int primeironum = e.nextInt();
        int segundonum = e.nextInt();

        int resultado = primeironum;

        for (int count = primeironum; count <= segundonum; count++) {
            resultado *= count;
            System.out.println(resultado);
        }
    }
}