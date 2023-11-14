package ejercicios.java_dam.adicionales;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2 {

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numerosint = new ArrayList<Integer>();
		boolean continuar = true;
		int sumaposit = 0, sumanegat = 0, sumapares = 0, sumaimpares = 0, cantposi = 0, cantnega = 0, cantpares = 0, cantimpares = 0, suma = 0, conteo = 0;
		float media = 0f;

		do {

			System.out.println("Dime un número: ");
			int n = sc.nextInt();
			numerosint.add(n);

			if (n > 0) {

				sumaposit += n;
				cantposi += 1;
				

			} else {

				sumanegat += n;
				cantnega += 1;
				

			}

			if (n % 2 == 0) {

				sumapares += n;
				cantpares += 1;

			} else {

				sumaimpares += n;
				cantimpares += 1;

			}

			System.out.println("¿Quieres añadir otro? \n"
								+ " 1) Si"
								+ " 2) No");
			int respuesta = sc.nextInt();

			if (respuesta == 2) {

				continuar = false;

			}

			suma += n;
			conteo += 1;

		} while (continuar);

		media = ((float) suma / conteo);

		System.out.println("El número mayor es: " + Collections.max(numerosint));
		System.out.println("La suma de los números positivos es de: " + sumaposit);
		System.out.println("La suma de los números negativos es de: " + sumanegat);
		System.out.println("La suma de los números pares es de: " + sumapares);
		System.out.println("La suma de los números impares es de: " + sumaimpares);
		System.out.println("La cantidad de números positivos es de: " + cantposi);
		System.out.println("La cantidad de números negativos es de: " + cantnega);
		System.out.println("La cantidad de números pares es de: " + cantpares);
		System.out.println("La cantidad de números impares es de: " + cantimpares);
		System.out.println("La media de los números introducidos es: " + media);

		

		

	}

}
