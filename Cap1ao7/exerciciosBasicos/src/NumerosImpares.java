import java.util.Locale;
import java.util.Scanner;

public class NumerosImpares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int X, i;
        System.out.println("INFORME O VALOR DE X: ");
        X = sc.nextInt();
        int[] vet = new int[1000];

        for ( i = 0; i <= X; i++) {
            if (i % 2 != 0){
                vet[i] = i;
            }
        }
        System.out.println("Numeros Impares");
        for ( i = 0; i <= X; i++) {
            if (i % 2 != 0){
                System.out.println(vet[i] = i);
            }
        }
        sc.close();
    }
}
