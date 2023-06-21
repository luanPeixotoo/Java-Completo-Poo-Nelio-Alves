package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.print("Digite o numero da conta: ");
        int nConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira o titular da conta: ");
        String nomeTitular = sc.nextLine();
        System.out.println("Existe deposito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's') {
            System.out.println("Digite o valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(nConta, nomeTitular, depositoInicial);
        } else {
            conta = new Conta(nConta, nomeTitular);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Digite um valor de depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Insira o valor do saque: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Deseja alterar o nome do titular? (s/n) ");
        char resposta2 = sc.next().charAt(0);
        if (resposta2 == 's') {
            System.out.println("Qual o nome correto? ");
            sc.nextLine();
            String nomeAtualizado = sc.nextLine();
            conta.setNomeTitular(nomeAtualizado);
            System.out.println("Dados da conta atualizados: ");
            System.out.println(conta);

        } else {
            System.out.println("Dados da conta: ");
            System.out.println(conta);
        }
        sc.close();
    }
}
