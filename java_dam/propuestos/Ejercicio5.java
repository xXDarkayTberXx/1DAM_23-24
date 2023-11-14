package alerus.ejercicios.propuestos;

import java.util.Objects;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean esFin = false;

		while (!esFin) {

			System.out.println("Escribe lo que quieras, si escribes FIN se acaba el programa :) : ");
			String texto2 = sc.nextLine();
			if (Objects.equals(texto2, "FIN")) {
				break;
			}
		}

		System.out.println("Fin del programa");

	}

}
