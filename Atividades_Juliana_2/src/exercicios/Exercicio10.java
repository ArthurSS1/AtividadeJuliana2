package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para N: ");
        int N = scanner.nextInt();

        if (N > 0) {
            System.out.println("Valores inteiros de 1 a " + N + ":");
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("O valor de N deve ser maior que zero.");
        }

        scanner.close();
    }
}