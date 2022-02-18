package desafios;

import java.util.Scanner;

public class DesafioNumeroDois {

	/*
	 * O Desafio: D�bora digitou uma string aleat�ria no campo de senha, por�m ela
	 * n�o tem certeza se � uma senha forte. Para ajudar D�bora, construa um
	 * algoritmo que informe qual � o n�mero m�nimo de caracteres que devem ser
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
			System.out.println("Possuir no m�nimo 6 caracteres.");
			System.out.println("Cont�m no m�nimo 1 digito.");
			System.out.println("Cont�m no m�nimo 1 letra em min�sculo.");
			System.out.println("Cont�m no m�nimo 1 letra em mai�sculo.");
			System.out.println("Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+");
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
				System.out.println("Parab�ns, sua senha � uma senha segura!");
				break;
			} else {
				System.out.printf("\n");
				System.out.println("Desculpe, sua senha n�o � segura!");
				System.out.println("Siga as instru��es para criar um sanha forte!");
			}

		} while (senhaInvalida);

	}
}
