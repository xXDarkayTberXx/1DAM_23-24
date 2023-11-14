package alerus.ejercicios.propuestos.Tcinco;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		

		System.out.println();
		for (int i = 1; i <= 6; i++) {

			for (int algo = 1; algo <= i - 1; algo++ ) {

				System.out.print("X");

			}

			System.out.println();
		
		} 

	}

}
