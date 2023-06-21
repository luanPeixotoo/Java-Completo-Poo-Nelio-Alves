package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }
        soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma = soma + vet[i];
        }

        media = soma / vet.length;

        System.out.print("VALORES = ");

        for (int i = 0; i < vet.length; i++) {
            System.out.printf("%.1f  ", vet[i]);
        }
        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);


    }
}
