package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle ret = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        ret.a = sc.nextDouble();
        ret.b = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", ret.area());
        System.out.printf("PERIMETER = %.2f%n", ret.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", ret.diagonal());
        sc.close();

    }


}
