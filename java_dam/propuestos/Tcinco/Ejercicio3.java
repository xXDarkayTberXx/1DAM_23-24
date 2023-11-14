package alerus.ejercicios.propuestos.Tcinco;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		

		System.out.println();
		for (int i = 1; i <= 4; i++) { // Creamos variable de control para los for de dentro

			for (int nada = 1; nada <= 4-i; nada++) { //Hacemos un creador de espacios en blanco, en este caso le damos a la variable "nada" el valor de 1. Y lo hacemos mientras nada sea <= a N - i. 

				System.out.print(" ");

			}

			for (int algo = 1; algo <= (i * 2) - 1; algo++ ) { // Creamos el creador de Xes, mientras que "algo" sea <= a i * 2 - 1

				System.out.print("X");

			}

			System.out.println();
		
		} 

		for (int i = 4; i >= 1; i--) { 

			for (int nada = 4; nada <= 8-i; nada++) {

				System.out.print(" ");

			}

			for (int algo = 4; algo <= (i * 2) ; algo++ ) { 

				System.out.print("X");

			}

			System.out.println();
		
		}
	}

}
