import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;
        double media;

        System.out.println("DADOS DA PRIMEIRA PESSOA:");
        System.out.print("Nome: ");
        nome1 = sc.nextLine();
        System.out.print("Idade: ");
        idade1 = sc.nextInt();

        System.out.println("DADOS DA SEGUNDA PESSOA:");
        System.out.print("Nome: ");
        sc.nextLine();
        nome2 = sc.nextLine();
        System.out.print("Idade: ");
        idade2 = sc.nextInt();


        media = (double)( idade1 + idade2) / 2;
        System.out.println("A idade média de " + nome1 + " e " + nome2
                + " eh de " + media + "anos");


        sc.close();
    }
}
