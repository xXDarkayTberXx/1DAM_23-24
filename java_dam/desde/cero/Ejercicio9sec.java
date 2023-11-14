package alerus.ejercicios.desde.cero;

import java.util.Scanner;

public class Ejercicio9sec {
	
	static float calcHIP(float a, float b) {

		float A = ((b * a) / 2);

		return A;
	  }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame la base del triángulo: ");
		float b = sc.nextFloat();
		System.out.println("Dame la altura del triángulo: ");
		float a = sc.nextFloat();
		 System.out.println("El área de tu triángulo es: " + calcHIP(a, b));
			
	}

} 