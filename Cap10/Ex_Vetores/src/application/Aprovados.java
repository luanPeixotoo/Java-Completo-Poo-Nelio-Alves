package application;

import entities.Aluno;
import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double somaNotas, mediaNotas;

        System.out.print("Quantos alunos serao digitados? ");
        n = sc.nextInt();

        Aluno[] vet = new Aluno[n];

        for (int i = 0; i < vet.length; i++) {
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            vet[i] = new Aluno(nome, nota1, nota2);
        }
        System.out.println("Alunos aprovados: ");

        somaNotas = 0;
        mediaNotas = 0;
        for (int i =0; i < n; i++){
            somaNotas = vet[i].getNota1() + vet[i].getNota2();
            mediaNotas = somaNotas / 2;
            if (mediaNotas >= 6.0){
                System.out.println(vet[i].getNome());
            }
            somaNotas = 0;
            mediaNotas = 0;
        }

    }
}