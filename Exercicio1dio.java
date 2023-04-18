package com.mycompany.exercicio1dio;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
 */
public class Exercicio1dio {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String nome = null;
        int idade;

         while(true) {
            System.out.println("Nome: ");
            nome = e.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = e.nextInt();
        }

    }
}
