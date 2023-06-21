package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, menores;
        double soma, media, percentual;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        Pessoa[] vet = new Pessoa[n];

        for (int i = 0; i < vet.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vet[i] = new Pessoa(nome, idade, altura);
        }
        soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i].getAltura();
        }
        menores = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getIdade() < 16) {
                menores++;
            }
        }
        media = soma / vet.length;
        percentual = ((double) menores / vet.length) * 100.0;

        System.out.printf("\nAltura media: %.2f", media);
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n", percentual);

        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getIdade() < 16) {
                System.out.println(vet[i].getNome());
            }
        }
    }
}
