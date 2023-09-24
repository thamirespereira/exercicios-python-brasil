package exercicios_listas;

import java.util.ArrayList;
import java.util.Scanner;

//Faça um Programa que leia 4 notas, mostre as notas e a média na tela.

public class Ex3 {
    
    public static void main(String[] args) {
        
        ArrayList <Float> notas = new ArrayList<>();
        Float media = 0f;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite uma nota: ");
            notas.add(ler.nextFloat());
            for (Float n : notas) {
                n += n;
                media = n/4; 
            }


        }
        System.out.println("Notas: " + notas);
        System.out.println("Media: " + media);

        ler.close();
    }
}
