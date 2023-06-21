package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, contaPares;
        double soma, media;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vet = new int[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        soma = 0;
        contaPares = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0){
                soma += vet[i];
                contaPares ++;
            }
        }

        media = soma / contaPares;

        if (media == 0){
            System.out.println("NENHUM NUMERO PAR");
        }else {
            System.out.println(String.format("MEDIA DOS PARES = %.1f", media));
        }
    }
}