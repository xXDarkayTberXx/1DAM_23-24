package alerus.ejercicios.adicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el primer número: ");
		int n1 = sc.nextInt();
		System.out.println("Dime el segundo número: ");
		int n2 = sc.nextInt();
		int n = 0;

		for (int i = 0; i<10; i++) {

			if (n1 > n2) {

				Random r = new Random();
				n = r.nextInt(n1 - n2) + n2;

			} else {

				Random r = new Random();
				n = r.nextInt(n2 - n1) + n1;

			}

			System.out.println("El " + i +"º número generado es: " + n);

		}





	}

}
