package alerus.ejercicios.propuestos;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(args[0]);

		

		System.out.println();
		for (int i = 1; i <= N; i++) { // Creamos variable de control para los for de dentro

			for (int nada = 1; nada <= N-i; nada++) { //Hacemos un creador de espacios en blanco, en este caso le damos a la variable "nada" el valor de 1. Y lo hacemos mientras nada sea <= a N - i. 

				System.out.print(" ");

			}

			for (int algo = 1; algo <= (i * 2) - 1; algo++ ) { // Creamos el creador de Xes, mientras que "algo" sea <= a i * 2 - 1

				System.out.print("X");

			}
			System.out.println();
		}

	}

}
