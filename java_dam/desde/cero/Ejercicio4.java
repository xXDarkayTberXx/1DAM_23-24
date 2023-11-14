package alerus.ejercicios.desde.cero;

public class Ejercicio4 {

	public static void main(String[] args) {

		//Declaración de variables
		
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		
		//Instrucciones
		
		System.out.println("El valor de A es: " + A);
		System.out.println("El valor de B es: " + B);
		System.out.println("El valor de C es: " + C);
		System.out.println("El valor de D es: " + D);
		
		int aux = B;
		B = C;
		C = A;
		A = D;
		D = aux;
		
		System.out.println("El valor de B tras ser C es: " + B);
		System.out.println("El valor de C tras ser A es: " + C);
		System.out.println("El valor de A tras ser D: " + D);
		System.out.println("El valor de D tras ser B: " + A);
		
	}

}
