package ejercicios.java_dam.adicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int max = 101;
		int min = 0;
		int conteo = 0;

		Random r = new Random();

		int na = r.nextInt((max-min)-min);

		System.out.println(na);

		while (numero != na) {

			System.out.println("Dime un número: ");
			numero = sc.nextInt();

			conteo += 1;

			if (numero < na) {

				System.out.println("El número es mayor");

			} else if (numero > na){

				System.out.println("El número es menor");

			}
			if (conteo == 10) {

				System.out.println("10 intentos fallidos, fin del programa");
				System.out.println("-------------------------------");
				System.out.println("El número era: " + na);
				System.out.println();

			} else if (numero == na) {

				System.out.println("¡Enhorabuena! Has acertado el número en " + conteo + " intentos");

			}

		}

	}

}
