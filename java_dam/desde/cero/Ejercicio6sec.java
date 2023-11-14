package alerus.ejercicios.desde.cero;

import java.util.Scanner; //IMPORTATE EN CADA SCRIPT ME DA IGUAL

public class Ejercicio6sec {
	
	static float calcMS(float velocidadkm) {
		
	    float calcDiam1 = velocidadkm / 3.6f;
	    
		return calcDiam1;
		
	  }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame una velocidad en KM/H");
		float respuesta = sc.nextFloat();
		 
		 System.out.println("La velocidad en MS/S es: " + calcMS(respuesta));
			
	}

} 