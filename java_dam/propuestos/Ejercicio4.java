package alerus.ejercicios.propuestos;

import java.util.Objects;
import java.util.Scanner;

public class Ejercicio4 {

	public static void suma(int num1, int num2) {

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }

	public static void resta(int num1, int num2) {

		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

	}

	public static void multiplicacion(int num1, int num2) {

		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

	}

	public static void division(int num1, int num2) {

		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

	}

	public static void potencia(int num1, int num2) {

		System.out.println("La potencia de " + num1 + " con el número de veces indicado, " + num2 + " = " + (int)Math.pow(num1, num2));

	}


	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);


		String operacion = args[2];

		switch (operacion) {

			case "suma":
				suma(num1, num2);
				break;
			case "resta":
				resta(num1, num2);
				break;
			case "multiplicacion":
				multiplicacion(num1, num2);
				break;
			case "division":
				division(num1, num2);
				break;
			case "potencia":
				potencia(num1, num2);
				break;
			default:
				System.out.println("Operación no válida, selecciona otra opción");

		}
		
	}

}
