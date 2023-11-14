 package alerus.ejercicios.desde.cero;
import java.util.Scanner;

public class Ejercicio3sec {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Declaración de variables
		
		System.out.println("Dime un número: ");
		int num = sc.nextInt();
		
		//Instrucciones
		
		System.out.println("El doble de " + num + " es: " + (num * 2));
		System.out.println("El triple de " + num + " es: " + (num * 3));
		
	}	
}
