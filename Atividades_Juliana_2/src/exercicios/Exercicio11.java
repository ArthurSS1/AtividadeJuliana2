package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        int N;

        do {
            System.out.print("Digite um valor maior que 0 para N: ");
            N = scanner.nextInt();

            if (N <= 0) {
                System.out.println("O valor de N deve ser maior que 0. Tente novamente.");
            }
        } while (N <= 0);

        System.out.println("Valores inteiros de 1 a " + N + ":");

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
