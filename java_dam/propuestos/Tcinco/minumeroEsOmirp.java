package alerus.ejercicios.propuestos.Tcinco;

import java.util.Scanner;

public class minumeroEsOmirp {

	static  boolean esPrimo(int n, int ninvf)
	{
		if(n<=1 && ninvf<=1) {

			return false;

		}
		for(int i = 2;i <= n / 2; i++) {

			if(n % i == 0) {
				return  false;
			}

		}
		for(int i = 2;i <= ninvf / 2; i++) {

			if(ninvf % i == 0) {
				return  false;
			}

		}

		return true;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número y te diré si es Omirp: ");
		int n = sc.nextInt();

		String numStr = String.valueOf(n); // Convertimos el entero "n" en string

		String numInvStr = new StringBuilder(numStr).reverse().toString(); // Con esta funcion revertimos el string

		int ninvf = Integer.parseInt(numInvStr); // Con esta funcion convertimos el String en int

		System.out.println(ninvf);

		if(esPrimo(n, ninvf)) {

			System.out.println("El número " + n + " es Omirp");

		} else {

			System.out.println("El número " + n + " no es Omirp");

		}


	}
}
