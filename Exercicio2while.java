
package com.mycompany.exercicio2while;

import java.util.Scanner;


public class Exercicio2while {

    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        
        int i1, i2;
        
        System.out.println("Digite o valor de inicio: ");
        i1 = e.nextInt();
        System.out.println("Digite o valor de final: ");
        i2 = e.nextInt();
        
        while (i1 < i2){
            System.out.println(i1);
            i1++;
        }
    }
}
