package alerus.ejercicios.propuestos.Tcinco;

import java.util.Scanner;

public class NoMultiplos5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Te voy a imprimir los primeros 50 números pares: ");
		int cuentanums = 1;
		int i = 0;

		while (cuentanums <=100) {

			i = i + 1;

			if (i % 5 != 0) {

				System.out.println(i);

			} else {

				System.out.println( i + " es múltiplo de 5, IGNORAR :)");

			}

			cuentanums = cuentanums + 1;
		}
	}
}
