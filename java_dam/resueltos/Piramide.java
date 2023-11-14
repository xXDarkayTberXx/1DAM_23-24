package alerus.ejercicios.resueltos;
import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		

		System.out.println();
		for (int i = 1; i <= 3; i++) { // Creamos variable de control para los for de dentro

			for (int nada = 1; nada <= 3-i; nada++) { //Hacemos un creador de espacios en blanco, en este caso le damos a la variable "nada" el valor de 1. Y lo hacemos mientras nada sea <= a N - i. 

				System.out.print(" ");

			}

			for (int algo = 1; algo <= (i * 2) - 1; algo++ ) { // Creamos el creador de Xes, mientras que "algo" sea <= a i * 2 - 1

				System.out.print("*");

			}

			System.out.println();
		
		} 
	}

}

