package application;

import java.util.Scanner;

public class TestForEach {
    public static void main(String[] args) {

        int [] num = new int[5];
        int soma = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++){
            System.out.println("Entre com o número "+(i+1)+": ");
            num[i] = sc.nextInt();
        }

        for (int i : num){
            soma += i;
        }

        System.out.println("A soma dos números que você digitou é "+soma);

         }
    }
