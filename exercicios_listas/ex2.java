package exercicios_listas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

//Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
public class ex2 {
    public static void main(String[] args) {
        
        ArrayList <Float> numeroList = new ArrayList<>();

        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            numeroList.add(ler.nextFloat());
        }

        numeroList.sort(Comparator.reverseOrder());
        System.out.println(numeroList);

        ler.close();
    }
}
