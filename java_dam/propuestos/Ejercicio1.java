package alerus.ejercicios.propuestos;

import java.util.Scanner;

public class Ejercicio1 {

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int año = Integer.parseInt(args[0]);

		int respuesta = año % 4;

		if (respuesta == 0) {

			if (año % 100 == 0 && año % 400 != 0) {

				System.out.println("El año " + año + " no es bisiesto");


			} else {

				System.out.println("El año " + año + " es bisiesto");

			}

		} else {

			System.out.println("El año " + año + " no es bisiesto");

		}
		
	}

}
