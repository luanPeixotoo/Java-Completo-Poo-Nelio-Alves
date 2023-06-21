package application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, cont;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] vet = new int[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        cont = 0;

        System.out.println("\nNUMEROS PARES: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + "  ");
                cont++;
            }
        }
        System.out.println("\n\nQUANTIDADE DE PARES = " + cont);
    }
}
