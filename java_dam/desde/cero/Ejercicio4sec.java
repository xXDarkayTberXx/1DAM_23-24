 package alerus.ejercicios.desde.cero;
import java.util.Scanner;

public class Ejercicio4sec {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Declaración de variables
		
		System.out.println("Dime un número en Cº: ");
		double C = sc.nextDouble();
		double F = 32 + ( 9 * C / 5);
		//Instrucciones
		
		 System.out.println(C + " grados Cº son " + F + " grados Farenheit");
		
	}	
}
