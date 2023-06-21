package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, contH, contM;
        double menorAltura, maiorAltura, somaM, mediaM;


        System.out.print("Quantas pessoas serao digitadas?  ");
        n = sc.nextInt();

        Pessoa[] vet = new Pessoa[n];

        for (int i = 0; i < vet.length; i++) {
            sc.nextLine();
            System.out.println("Altura da " + (i + 1) + "a pessoa: ");
            double altura = sc.nextDouble();
            System.out.println("Genero da " + (i + 1) + "a pessoa: ");
            char genero = sc.next().charAt(0);
            vet[i] = new Pessoa(altura, genero);
        }
        menorAltura = vet[0].getAltura();
        maiorAltura = vet[0].getAltura();
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getAltura() < menorAltura) {
                menorAltura = vet[i].getAltura();
            }
            if (vet[i].getAltura() > maiorAltura) {
                maiorAltura = vet[i].getAltura();
            }
        }
        somaM = 0;
        contM = 0;
        contH = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getGenero() == 'f' || vet[i].getGenero() == 'F') {
                contM++;
                somaM += vet[i].getAltura();
            } else {
                contH++;
            }
        }
        mediaM = somaM / contM;

        System.out.print(String.format("Menor altura = %.2f\n", menorAltura));
        System.out.print(String.format("Maior altura = %.2f\n", maiorAltura));
        System.out.print(String.format("Media das alturas das mulheres =  %.2f\n", mediaM));
        System.out.println("Numero de homens = " + contH);
    }
}
