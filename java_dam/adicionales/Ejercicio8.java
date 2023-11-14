package alerus.ejercicios.adicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	public static boolean esBisiesto(int anio){

		boolean essBisiesto = false;

		int respuesta = anio % 4;

		if (respuesta == 0) {

            essBisiesto = anio % 100 != 0 || anio % 400 == 0;

		} else {

			essBisiesto = false;

		}

		return essBisiesto;

	} 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un día: ");
		int dia = sc.nextInt();
		System.out.println("Dame un mes: ");
		int mes = sc.nextInt();
		System.out.println("Dame un año: ");
		int anio = sc.nextInt();


		if (dia > 31 || dia <= 0 || mes > 12 || mes <= 0 || anio <= 0 || anio > 9999 || !esBisiesto(anio) && mes == 4 && dia == 29 || mes == 2 && dia > 29 || mes == 4 && dia > 30 || mes == 6 && dia > 30 || mes == 9 && dia > 30 || mes == 11 && dia > 30) {

			System.out.println("Día / Mes / Año inválido");

		} else {

			System.out.println(dia + " / " + mes + " / " + anio + " es una fecha válida");

		} 

	
	}

}
