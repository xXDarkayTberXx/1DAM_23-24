package alerus.ejercicios.adicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
	
	public static boolean CompruebaPrimos(int n1) {

		boolean esPrimo = true;

		for (int i = 2; i <= n1 - 1; i++) {
            if (n1 % i == 0) {
                esPrimo = false;
                break;
            }
		}

		return esPrimo;

	} 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 100; i++) {

			if (CompruebaPrimos(i)) {

				System.out.println(i);

			}

		}

	
	}

}
