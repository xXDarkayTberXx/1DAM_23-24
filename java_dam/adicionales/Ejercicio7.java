package alerus.ejercicios.adicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el primer número: ");
		int n1 = sc.nextInt();
		System.out.println("Dame el segundo número: ");
		int n2 = sc.nextInt();
		System.out.println("Dame un signo aritmético ");
		String signo = sc.next();

		switch (signo) {

			case "+":
				System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
			case "-":
				System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			break;
			case "*":
				System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
			break;
			case "/":
				System.out.println((float)n1 + " / " + n2 + " = " + (n1 / n2));
			break;
			case "%":
				System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
			break;
			case "^":
				System.out.println(n1 + " ^ " + n2 + " = " + (int)Math.pow(n1, n2));
			break;
		}

	
	}

}
