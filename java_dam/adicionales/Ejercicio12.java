package ejercicios.java_dam.adicionales;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un plazo de meses para el pago: ");
		int meses = sc.nextInt();
		System.out.println("Dime el precio del producto: ");
		int pago = sc.nextInt();

		for (int i = 1; i <= meses; i++) {

			System.out.println("Mes nº " + i + " paga " + pago + "€");

			pago = pago * 2;

		}



	}

}
