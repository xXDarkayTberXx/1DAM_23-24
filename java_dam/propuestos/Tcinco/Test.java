package alerus.ejercicios.propuestos.Tcinco;

import java.util.*;
public class Test {

	public static void main ( String [ ] args) {
		Random rnd = new Random();
		int max = 200;
		int min = 100;

		int valor = rnd.nextInt((max - min)) + min;

		if (valor % 2 == 0) {

			System.out.println("El número generado: ( " + valor + " ) es par");

		} else {

			System.out.println("El número generado: ( " + valor + " ) es impar");

		}
	}
}
