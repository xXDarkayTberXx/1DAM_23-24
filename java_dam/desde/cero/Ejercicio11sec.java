package alerus.ejercicios.desde.cero;

import java.util.Scanner;

public class Ejercicio11sec {
	
	static int calcHIP(int a, int b) {

		return a;
	  }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número de 5 cifras: ");
		int num1 = sc.nextInt();
		String number = String.valueOf(num1);
		int numcont = 1;

		if (num1 >= 10000 && num1 <= 99999) {

			for(int i = 0; i < number.length(); i++) { /*Decimos que haga la condición hasta que i sea
														mayor o igual a la longitud del número en String
														es decir, 3. */

				int k = Character.digit(number.charAt(i), 10); /*Devuelve el carácter situado en la posición index
																	pasada por parámetro. La primera posición
																    de la cadena es la 0. */
				System.out.print(k);

				numcont = numcont + 1;
			}

		} else {

			System.out.println("Número no válido");

		}






			
	}

} 