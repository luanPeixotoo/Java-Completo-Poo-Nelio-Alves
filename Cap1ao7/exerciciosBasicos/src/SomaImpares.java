import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, troca, soma;

        System.out.println("Digite dois numeros: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            troca = a;
            a = b;
            b = troca;
        }

        soma = 0;
        for (int i = a + 1; i < b; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }
        System.out.println("SOMA DOS IMPARES = " + soma);
    }
}
