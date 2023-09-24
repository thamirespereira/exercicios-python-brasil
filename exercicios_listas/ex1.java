package exercicios_listas;
//Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
public static void main(String[] args) {
    
    ArrayList <Integer> numeros = new ArrayList<>();

    Scanner ler = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
        System.out.println("Digite um número: ");
        numeros.add(ler.nextInt());
    }
    System.out.println("Vetor: " + numeros);

    ler.close();
}
    
}