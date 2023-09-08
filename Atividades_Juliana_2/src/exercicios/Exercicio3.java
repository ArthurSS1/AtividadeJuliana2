package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
        double valor1, valor2, resultado;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();

        while (valor2 == 0) {
            System.out.println("VALOR INVÁLIDO: O segundo valor não pode ser zero.");
            System.out.print("Digite o segundo valor novamente: ");
            valor2 = scanner.nextDouble();
        }

        resultado = valor1 / valor2;

        System.out.println("Resultado da divisão: " + resultado);

        scanner.close();
    }

}


