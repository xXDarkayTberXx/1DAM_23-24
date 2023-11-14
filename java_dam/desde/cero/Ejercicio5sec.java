package alerus.ejercicios.desde.cero;

import java.util.Scanner; //IMPORTATE EN CADA SCRIPT ME DA IGUAL

public class Ejercicio5sec {
	
	static float calcDiam(float radioCirculo) {
		
	    float calcDiam1 = radioCirculo * 2;
	    
		return calcDiam1;
		
	  }
	
static float calcCirc(float radioCirculo) {
		
	    float r2 = radioCirculo * radioCirculo;
	    float pi = (float) 3.1416;
		float calcCirc1 = pi * (radioCirculo * 2); 
	    
		return calcCirc1;
		
	  }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el radio de tu círculo");
		float respuesta = sc.nextFloat();
		 
		 System.out.println("El diámetro de tu círculo es: " + calcDiam(respuesta));
		 System.out.println("La circunferencia de tu círculo es: " + calcCirc(respuesta));
		
		
	}

} 