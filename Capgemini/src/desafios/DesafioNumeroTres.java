package desafios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DesafioNumeroTres {

	/*
	 * Dada uma string qualquer, desenvolva um algoritmo que encontre o número de
	 * pares de substrings que são anagramas.
	 */

	public static void main(String[] args) {

		System.out.printf("\nOlá, vamos para mais um desafio?");
		System.out.printf("\nDigite uma palavra e descubra quantos anagramas de pares ela tem!");
		System.out.printf("\nDigite a palavra:");
		Scanner leia = new Scanner(System.in);
		String anagrama = leia.next();
		separandoAnagrama(anagrama);
	}

	public static void separandoAnagrama(String texto) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < texto.length(); i++) {
			for (int a = i; a < texto.length(); a++) {
				char[] ch = texto.substring(i, a + 1).toCharArray();
				Arrays.sort(ch);
				String letra = new String(ch);
				if (map.containsKey(letra))
					map.put(letra, map.get(letra) + 1);
				else
					map.put(letra, 1);
			}
		}
		int somaAna = 0;
		for (String key : map.keySet()) {
			int n = map.get(key);
			somaAna += (n * (n - 1)) / 2;
		}
		System.out.println();
		System.out.println("O número de pares de aanagrams da palavra que você digiou é "+somaAna);

	}
}
