/* Escreva um programa que imprima na saıda padrao todos os numeros de 0 a 1000 que sao pares; */
public class Main {
    public static void main(String[] args) {


        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
