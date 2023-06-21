import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        int fat = 1;
        for (int i=1; i<=n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);
        sc.close();
    }
}