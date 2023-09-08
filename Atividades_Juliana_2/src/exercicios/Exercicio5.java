package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;

        do {
            System.out.print("Digite a nota da 1ª avaliação (de 0 a 10): ");
            nota1 = scanner.nextDouble();
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.print("Digite a nota da 2ª avaliação (de 0 a 10): ");
            nota2 = scanner.nextDouble();
        } while (nota2 < 0 || nota2 > 10);

        media = (nota1 + nota2) / 2;

        System.out.println("A média das notas é: " + media);

        scanner.close();

	}

}
