package alerus.ejercicios.resueltos;

import java.util.Scanner;

public class Los5Pares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Te voy a imprimir los primeros 5 números pares: ");
		int cuentapares = 1;
		int i = -1;

		while (cuentapares <=5) {

			i = i + 1;

			if (i % 2 == 0) {

				System.out.println("Par número " + cuentapares + ": " + i);

				cuentapares = cuentapares + 1;

			}
		}
	}
}
