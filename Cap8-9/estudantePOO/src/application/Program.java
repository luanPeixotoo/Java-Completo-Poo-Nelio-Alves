package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Aluno aluno = new Aluno();

        System.out.println("Nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Informe as três notas do aluno: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.printf("Nota Final: %.2f", aluno.notaFinal());
        System.out.println();

        if (aluno.notaFinal() < 60.00) {
            System.out.println("REPROVADO");
            System.out.printf("Faltou %.2f pontos%n", aluno.faltaPontos());
        } else {
            System.out.println("APROVADO");
        }

        sc.close();
    }
}
