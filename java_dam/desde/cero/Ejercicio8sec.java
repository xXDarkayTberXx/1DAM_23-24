package alerus.ejercicios.desde.cero;

import java.util.Scanner;

public class Ejercicio8sec {
	
	static float calcHIP(float r) {

		float pi = 3.1416f;
		float r3 = r * r * r;
		float V = (((float) 4 / 3) * pi * r3);
		System.out.println((double)4/3);
		System.out.println(pi);
		System.out.println(r3);

		return V;
	  }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el radio de tu esfera: ");
		float r = sc.nextFloat();
		 System.out.println("El volumen de tu esfera es: " + calcHIP(r));
			
	}

} 