package ejercicios.java_dam.adicionales;

import java.util.Scanner;

public class Ejercicio1 {

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.println("Dime un nombre: ");
		String nombre = sc.next();
		float nota = 1;
		float suma = 0;
		int asignaturas = 0;
		
		while (nota >= 0 && nota <= 10) {

			System.out.println("Dime las notas del alumno");
			nota = sc.nextInt();

			if (nota >= 0 && nota <= 10) {
				asignaturas = asignaturas + 1;
				suma = nota + suma;		
			}

		}
		
		System.out.println("La media del alumno " + nombre + " es: " + suma / asignaturas);

	}

}
