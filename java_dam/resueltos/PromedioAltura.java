package alerus.ejercicios.resueltos;

import java.util.Scanner;

public class PromedioAltura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuantas alturas quieres introducir (en cm)? ");
		int n = sc.nextInt();
		int contador = 0;
		int altura;
		int suma = 0;

		while (contador < n) {

			System.out.println("Introduce una altura: ");
			altura = sc.nextInt();

			contador++;
			
			suma += altura;

		}
		
		System.out.println(suma / n);
		
	}
}
