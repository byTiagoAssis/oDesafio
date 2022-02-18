package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioNumeroUm {

	/*
	 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o
	 * caractere * e espaços. A base e altura da escada devem ser iguais ao valor de
	 * n. A última linha não deve conter nenhum espaço.
	 */

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		List<String> degraus = new ArrayList<>();

		System.out.println("Olá, seja Bem Vinde!! ");
		System.out.println("Vamos fazer uma escada de * ?? ");
		System.out.printf("Me diga quantos degraus ela terá: ");
		int qtdDegraus = leia.nextInt();

		for (int i = 0; i < qtdDegraus; i++) {
			degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
		}

		for (String d : degraus) {
			System.out.println(d);
		}

		System.out.print("Obrigado por participar!! ");
	}
}
