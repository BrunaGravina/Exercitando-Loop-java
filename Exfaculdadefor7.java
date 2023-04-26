/* Escreva um programa que imprima de um intervalo de
numeros de 0 a 1000, apenas um a cada 6: ex: 0,6, 12;
*/

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i += 6) {
            System.out.println(i);
        }
    }
}
