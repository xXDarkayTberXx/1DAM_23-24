package alerus.ejercicios.propuestos.Tcinco;

import java.util.Scanner;

public class Los50Pares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Te voy a imprimir los primeros 50 números pares: ");
		int cuentapares = 1;
		int i = -1;

		while (cuentapares <=50) {

			i = i + 1;

			if (i % 2 == 0) {

				System.out.println("Par número " + cuentapares + ": " + i);

				cuentapares = cuentapares + 1;

			}
		}
	}
}
