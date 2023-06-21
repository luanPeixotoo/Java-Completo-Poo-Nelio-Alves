import java.util.Scanner;

public class MenorDeTres {

    public static void main(String[] args) {

        int a, b, c, menor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro Valor: ");
        a = sc.nextInt();
        System.out.print("Segundo Valor: ");
        b = sc.nextInt();
        System.out.print("Terceiro Valor: ");
        c = sc.nextInt();

        if (a < b && a < c) {
            menor = a;
        } else if (b < c) {
            menor = b;
        } else {
            menor = c;
        }

        System.out.println("MENOR = " + menor);
    }

}

