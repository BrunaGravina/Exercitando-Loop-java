

package com.mycompany.exerciciowhile;

import java.util.Scanner;


public class Exerciciowhile {

    public static void main(String[] args) {
       Scanner e = new Scanner (System.in);
       String frase = null;
       while (!"PARE".equals(frase)){
           System.out.println("Digite uma frase: ");
           frase = e.nextLine();
       }
       
    }
}
