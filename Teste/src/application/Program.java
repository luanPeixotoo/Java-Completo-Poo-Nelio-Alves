package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quanidade de produtos: ");
        int n = sc.nextInt();

        Produto[] vetor = new Produto[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.println("Informe o produto " + (i + 1) + ": ");
            String nome = sc.nextLine();
            System.out.println("Valor produto " + (i + 1) + ": ");
            double preco = sc.nextDouble();
            vetor[i] = new Produto(nome, preco);
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getPreco();
        }
        double media = soma / vetor.length;

        System.out.println(String.format("Preço medio dos produtos = %.2f", media));

    }
}

