package br.com.alura;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numerosPares  = new ArrayList<>();
        List<Integer> numerosImpares  = new ArrayList<>();
        String resp;

        while (true) {
            System.out.print("Informe um número: ");
            try {
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number % 2 == 0) {
                    numerosPares.add(number);
                } else {
                    numerosImpares.add(number);
                }
            } catch (InputMismatchException ex) {
                System.out.println("Informe valores inteiros - " + ex.getMessage());
                scanner.nextLine();
                continue;
            }

            System.out.println("----------------------------------------------------");
            System.out.println("Quantidade de valores ímpares: " + numerosImpares.size());
            System.out.println("Valores ímpares: " + numerosImpares);
            System.out.println("Quantidade de valores pares: " + numerosPares.size());
            System.out.println("Valores pares: " + numerosPares);
            System.out.println("----------------------------------------------------");

            System.out.print("Deseja informar outro número ? (s/n) ");
            resp = scanner.nextLine().trim().toUpperCase();

            if (resp.equals("N")) {
                System.out.println("Finalizando....");
                break;
            } else if (!resp.equals("S")) {
                System.out.println("Resposta inválida! Informe 's' para continuar ou 'n' para parar.");
            }
        }
    }
}