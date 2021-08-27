package maiorMenorNumero;

import java.util.Scanner;

public class MaiorMenorNumero {

	public static void main(String[] args) {

		int n1, n2, n3;

		Scanner ler = new Scanner(System.in);

		System.out.print("Diga o primeiro numero:");
		n1 = ler.nextInt();
		System.out.print("Diga o segundo numero:");
		n2 = ler.nextInt();
		System.out.print("Diga o terceiro numero:");
		n3 = ler.nextInt();
		ler.close();

		if (n1 > n2 && n1 > n3) {

			if (n1 == n2) {

				System.out.println("o primeiro e o segundo numero são iguais, tente novamente");

			} else if (n1 == n3) {

				System.out.println("o primeiro e o terceiro numero são iguais, tente novamente");

			} else {

				System.out.println("o maior numero é o: " + n1);

			}

		} else if (n2 > n1 && n2 > n3) {

			if (n2 == n1) {

				System.out.println("o terceiro e o segundo numero são iguais, tente novamente");

			} else if (n2 == n3) {

				System.out.println("o segundo e o terceiro numero são iguais, tente novamente");

			} else {

				System.out.println("o maior numero é o: " + n2);

			}

		} else if (n3>n1 && n3>n2) {

			if (n3 == n1) {

				System.out.println("o terceiro e o primeiro numero são iguais, tente novamente");

			} else if (n3 == n2) {

				System.out.println("o segundo e o terceiro numero são iguais, tente novamente");

			} else {

				System.out.println("o maior numero é o: " + n3);

			}

		} else {
			
			System.out.println("bug na matrix!!");
			
		}

	}
}
