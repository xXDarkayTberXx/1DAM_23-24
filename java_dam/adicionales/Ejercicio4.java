package ejercicios.java_dam.adicionales;

import java.util.Objects;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String contrasenia = "";
		int conteo = 0;

		while (!contrasenia.equals("gatitoenapuros") && conteo < 3){

			System.out.println("Introduce tu contraseña, tienes 3 intentos");
			contrasenia = sc.next();

			conteo += 1;
		}

		if (conteo == 3) {

			System.out.println("Contraseña fallada 3 veces");

		} else {

			System.out.println("Enhorabuena!");

		}

	}

}
