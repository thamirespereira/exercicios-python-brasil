package exercicios_listas;

import java.util.ArrayList;
import java.util.Scanner;

/*Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os 
números IMPARES no vetor impar. Imprima os três vetores.*/
public class Ex5 {

    public static void main(String[] args) {

        ArrayList <Integer> numeros = new ArrayList<>();
        ArrayList <Integer> par = new ArrayList<>();
        ArrayList <Integer> impar = new ArrayList<>();

        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um número: ");
            numeros.add(ler.nextInt()); 
        }

        for (Integer n : numeros) {
                if (n % 2 == 0) {
                    par.add(n);
                } else {
                    impar.add(n);
                }
            }

            System.out.println("Números: " + numeros);
            System.out.println("Números pares: " + par);
            System.out.println("Números impares: " + impar);

            ler.close();
    }
}