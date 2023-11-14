package alerus.ejercicios.adicionales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 101; i++) {

			if (i % 2 == 0 && i % 3 == 0 || i == 1 || i == 100) {

				System.out.println(i);

			}

		}


	}

}
