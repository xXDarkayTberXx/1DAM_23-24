package alerus.ejercicios.adicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sDentro = 0, nFuera = 0, inf = 0, sup = 1, n = 1, nLimite = 0;


		boolean error = false;

		System.out.println("Dime el límite inferior del intervalo: ");
		inf = sc.nextInt();
		System.out.println("Dime el límite superior del intervalo: ");
		sup = sc.nextInt();

		if (inf > sup) {

			System.out.println("No válido, vuelve a ejecutar el programa");

		}

		while (n != 0) {

			System.out.println("Ves diciendo números, si introduces 0 termina el programa");
			n = sc.nextInt();

			if (n != 0) {
				if (n > inf && n < sup) {

					sDentro += n;

				}
				if (n < inf || n > sup ) {

					nFuera += 1;

				}
				if (n == inf || n == sup) {

					nLimite += 1;

				}
			}
		}

		System.out.println("Suma de numeros dentro: " + sDentro);
		System.out.println("Cantidad de números fuera: " + nFuera);
		System.out.println("Cantidad de números límite: " +nLimite);

	}

}
