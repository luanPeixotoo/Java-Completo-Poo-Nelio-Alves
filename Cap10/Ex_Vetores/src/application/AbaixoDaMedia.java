package application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        double[] vet = new double[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }
        soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }

        media = soma / vet.length;

        System.out.println(String.format("\nMEDIA DO VETOR = %.3f", media));
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < media) {
                System.out.println(vet[i]);
            }
        }
    }
}
