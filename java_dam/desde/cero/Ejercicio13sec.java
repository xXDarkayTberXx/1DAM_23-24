package ejercicios.java_dam.desde.cero;

import java.util.Scanner;

public class Ejercicio13sec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime tu día de nacimiento: (en número)");
		int dia = sc.nextInt();
		System.out.println("Dime tu mes de nacimiento (en número): ");
		int mes = sc.nextInt();
		System.out.println("Dime tu año de nacimiento: ");
		int anio = sc.nextInt();

		if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12 || anio <= 0 || anio > 2023) {

			System.out.println("El día, mes o año no es válido");

		} else {

			int num1dia = dia / 10;
			int num2dia = dia % 10;
			int sumadia = (num1dia + num2dia);

			System.out.println(" ----------------------- ");

			System.out.println("Suma día:" + sumadia);

			int num1mes = mes / 10;
			int num2mes = mes % 10;
			int sumames = (num1mes + num2mes);

			System.out.println(" ----------------------- ");

			System.out.println("Suma mes:" + sumames);

			int num1anio = anio / 1000;
			int num2anio = (anio % 1000) / 100;
			int num3anio = (anio % 100) / 10;
			int num4anio = anio % 10;
			int sumanio = (num1anio + num2anio + num3anio + num4anio);

			System.out.println(" ----------------------- ");

			System.out.println("Suma anio:" + sumanio);

			System.out.println(" ----------------------- ");

			int nums = (sumadia + sumames + sumanio);
			System.out.println("Cálculo provisional de núm suerte = " + sumadia + " + " + sumames + " + " + sumanio + " = " + (sumadia + sumames + sumanio));

			System.out.println(" ----------------------- ");

			int num1nums = nums / 10;
			int num2nums = nums % 10;
			int numsuertefinal = num1nums + num2nums;

			System.out.println("Tu número de la suerte es: " + num1nums + " + " + num2nums + " = " +  numsuertefinal);

			System.out.println(" ----------------------- ");

		}
	}
}
