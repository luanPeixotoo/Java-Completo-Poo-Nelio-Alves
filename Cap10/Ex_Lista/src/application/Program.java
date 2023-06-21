package application;

import entities.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Empregado> lista = new ArrayList<>();


        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        //LEITURA DE DADOS

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Empregado #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(lista, id)) {
                System.out.println("System.out.println(\"Id already taken! Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Empregado emp = new Empregado(id, name, salary);

            lista.add(emp);
        }

        //ATUALIZAR SALARIO
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idInc = sc.nextInt();
        Empregado emp = lista.stream().filter(x -> x.getId() == idInc).findFirst().orElse(null);
        // Integer pos = posicao(lista, idInc);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double porcentagem = sc.nextDouble();
            emp.aumento(porcentagem);
        }

        //LISTAR EMPREAGADOS

        System.out.println();
        System.out.println("List of employees:");
        for (Empregado obj : lista) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static Integer posicao(List<Empregado> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Empregado> list, int id) {
        Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}

