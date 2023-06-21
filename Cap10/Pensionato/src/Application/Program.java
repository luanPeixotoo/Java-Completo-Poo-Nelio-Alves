package Application;

import Entities.Estudante;
import Entities.Quarto;

import java.util.Scanner;



public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos quartos serão alugados? ");
        n = sc.nextInt();

        Quarto[] vetQuarto = new Quarto[10];
        Estudante[] vetEstud = new Estudante[10];
        for (int i = 0; i < n; i++) {
            System.out.println("Aluguel #" + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();

            vetQuarto[numeroQuarto] = new Quarto(numeroQuarto, false);
            vetEstud[numeroQuarto] = new Estudante(nome, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");

        for (int i = 0; i < 10; i++) {
            if (vetQuarto[i] != null) {
                System.out.println(i + ": " + vetEstud[i]);
            }

        }
    }
}


