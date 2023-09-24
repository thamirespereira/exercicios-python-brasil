package exercicios_listas;

import java.util.ArrayList;
import java.util.Scanner;

//Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

public class Ex4 {
    public static void main(String[] args) {

        ArrayList <String> letras = new ArrayList <String>();
        ArrayList <String> consoantes = new ArrayList<>();
      
        Scanner ler = new Scanner(System.in);
        int cons = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite uma letra: ");
            letras.add(ler.nextLine());
            }
            for (String l : letras) {
                switch (l) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break;
            
                default: cons++;
                    consoantes.add(l);
                    break;
            }
            
            }
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Quantidade de consoantes: " + cons);
        
        ler.close();
    }
}
