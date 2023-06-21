package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        int maiorIdade;
        String maisVelho;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        Pessoa[] vet = new Pessoa[n];

        for (int i = 0; i < vet.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            vet[i] = new Pessoa(nome, idade);
        }

        maiorIdade = vet[0].getIdade();
        maisVelho = vet[0].getNome();
        for (int i = 0; i < n; i++) {
            if (vet[i].getIdade() > maiorIdade) {
                maiorIdade = vet[i].getIdade();
                maisVelho = vet[i].getNome();
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + maisVelho);

    }
}