package alerus.ejercicios.desde.cero;

import java.util.Scanner; //IMPORTATE EN CADA SCRIPT ME DA IGUAL

public class Ejercicio7sec {
	
	static float calcHIP(float cateto1, float cateto2) {

	    float hipotenusa = ((cateto1 * cateto1) + (cateto2 * cateto2));
	    
		return hipotenusa;
		
	  }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el primer cateto: ");
		float cateto1 = sc.nextFloat();
		System.out.println("Dame el segundo cateto: ");
		float cateto2 = sc.nextFloat();
		 
		 System.out.println("La hipotenusa es: " + calcHIP(cateto1, cateto2));
			
	}

} 