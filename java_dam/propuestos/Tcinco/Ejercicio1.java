package alerus.ejercicios.propuestos.Tcinco;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		

		System.out.println("Dime el primer número");
		int a = sc.nextInt();
		System.out.println("Dime el segundo número");
		int b = sc.nextInt();
		System.out.println("Dime el tercer número");
		int c = sc.nextInt();

		if (a > b && a > c) {

			System.out.println("El numero " + a + " es el mayor");

		} else if (b > a && b > c) {

			System.out.println("El numero " + b + " es el mayor");

		} else if (c > a && c > b) {

			System.out.println("El numero " + c + " es el mayor");

		}

		System.out.println();

		if (a < b && a < c) {

			System.out.println("El numero " + a + " es el menor");

		} else if (b < a && b < c) {

			System.out.println("El numero " + b + " es el menor");

		} else if (c < a && c < b) {

			System.out.println("El numero " + c + " es el menor");

		}


	}

}
