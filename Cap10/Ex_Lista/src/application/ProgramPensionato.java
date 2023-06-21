package application;

import entities.Estudante;
import entities.Quarto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramPensionato {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        List<Quarto> lista = new ArrayList<>();
        Estudante[] vetEstud = new Estudante[10];

        System.out.print("Quantos quartos serão alugados? ");
        n = sc.nextInt();

        //Leitura dos dados
        for (int i = 0; i < n; i++) {
            System.out.println("Aluguel #" + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();

            //Verificar se quarto esta ocupado
            while (hasQuarto(lista, numeroQuarto)) {
                System.out.print("Quarto ocupado! Escolha outro quarto: ");
                numeroQuarto = sc.nextInt();
            }
            //Cria um novo estudante e inseri na lista de quartos
            vetEstud[numeroQuarto] = new Estudante(numeroQuarto, nome, email);
            lista.add(vetEstud[numeroQuarto]);

        }
        //Lista quartos escolhidos e estudantes que estão em cada quarto
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if (vetEstud[i] != null) {
                System.out.println(i + ": " + vetEstud[i]);
            }
        }

        sc.close();
    }

    public static boolean hasQuarto(List<Quarto> list, int numQuarto) {
        Quarto quarto = list.stream().filter(x -> x.getNumQuarto() == numQuarto).findFirst().orElse(null);
        return quarto != null;
    }
}

