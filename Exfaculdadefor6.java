import java.util.Scanner;

/* Escreva um programa que permita que o usuario
digite varios números e imprima na saıda padrao somente o primeiro e o ultimo numeros digitados pelo usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Quantos numeros deseja digitar? ");
        int qnt = e.nextInt();

        int primeironum = 0;
        int ultimonum = 0;

        for (int count = 1; count <= qnt; count++) {
            System.out.println("Digite o " + count + " numero: ");
            int num = e.nextInt();

            if (count == 1) {
                primeironum = num;
            }
            ultimonum = num;
        }
        System.out.println("O primeiro numero foi: " + primeironum);
        System.out.println("O ultimo numero foi: " + ultimonum);
    }
}
