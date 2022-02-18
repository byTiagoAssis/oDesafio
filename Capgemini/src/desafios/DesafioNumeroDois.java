package desafios;

import java.util.Scanner;

public class DesafioNumeroDois {

	/*
	 * O Desafio: Débora digitou uma string aleatória no campo de senha, porém ela
	 * não tem certeza se é uma senha forte. Para ajudar Débora, construa um
	 * algoritmo que informe qual é o número mínimo de caracteres que devem ser
	 * adicionados para uma string qualquer ser considerada segura.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean senhaInvalida = true;

		do {

			boolean digitouNumero = false;
			boolean digitouLetra = false;
			boolean digitouEspecial = false;

			System.out.printf("\n");
			System.out.println("Sua senha deve conter:");
			System.out.printf("\n");
			System.out.println("Possuir no mínimo 6 caracteres.");
			System.out.println("Contém no mínimo 1 digito.");
			System.out.println("Contém no mínimo 1 letra em minúsculo.");
			System.out.println("Contém no mínimo 1 letra em maiúsculo.");
			System.out.println("Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
			System.out.printf("\n");

			System.out.printf("Digite uma senha:");
			String usuarioSenha = scanner.nextLine();

			if (usuarioSenha.length() >= 6) {
				char[] charSenha = usuarioSenha.toCharArray();
				for (char chTest : charSenha) {
					if (Character.isDigit(chTest)) {
						digitouNumero = true;

					} else if (Character.isLetter(chTest)) {
						digitouLetra = true;

					} else {
						digitouEspecial = true;

					}
				}

			}
			if (digitouNumero && digitouLetra && digitouEspecial) {
				System.out.println("Parabéns, sua senha é uma senha segura!");
				break;
			} else {
				System.out.printf("\n");
				System.out.println("Desculpe, sua senha não é segura!");
				System.out.println("Siga as instruções para criar um sanha forte!");
			}

		} while (senhaInvalida);

	}
}
