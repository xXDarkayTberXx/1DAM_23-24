package alerus.ejercicios.desde.cero;

public class Ejercicio7 {

	public static void main(String[] args) {

		//Declaración de variables
		
		int A= 100;
		
		//Instrucciones
		
		System.out.println ((A >= 0)? A + " es positivo":A + " es negativo");
		System.out.println ((A % 2 == 0)? A + " es par":A + " es impar");
		System.out.println ((A % 5 == 0) ? A + " es divisible entre 5":A + " no es divisible entre 5");
		System.out.println ((A % 10 == 0)? A + " es divisible entre 10":A + " no es divisible entre 10");
		System.out.println ((A >= 100)? A + " es mayor o igual que 100":A + " es menor que 100");
	}

}
