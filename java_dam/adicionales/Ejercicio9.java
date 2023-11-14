package alerus.ejercicios.adicionales;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número: ");
		int n = sc.nextInt(); // Pedimos número principal
		int v = 1; // Le damos un valor a c

		for (int f = 1; f <= n; f++) { // Sumar filas
			for (int c = 1; c <= f; c++) { // Sumar columnas
				if (v == n+1) { // Si pasa de n, parar
					break;
				}
				System.out.print( v + " "); // Imprime v
				v++; // Sumar v + 1
			}
			System.out.println(); // Imprime nueva linea
		}

	}

}
