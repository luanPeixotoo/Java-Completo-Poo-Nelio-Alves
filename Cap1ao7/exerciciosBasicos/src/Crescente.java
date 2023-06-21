import java.util.Locale;
import java.util.Scanner;

public class Crescente {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Digite dois numeros: ");
        a = sc.nextInt();
        b = sc.nextInt();

        while (a != b) {
            if (a < b) {
                System.out.println("CRESCENTE!");
            } else {
                System.out.println("DECRESCENTE!");
            }
            System.out.println("Digite outros dois numeros:");
            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}
