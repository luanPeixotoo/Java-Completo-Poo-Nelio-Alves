package application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posicaoMaior;
        double maior;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }
        maior = vet[0];
        posicaoMaior = 0;
        for (int i = 0; i < n; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                posicaoMaior = i;
            }
        }
        System.out.println(String.format("MAIOR VALOR = %.1f", maior));
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);

    }
}
