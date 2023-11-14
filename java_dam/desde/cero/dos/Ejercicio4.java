package alerus.ejercicios.desde.cero.dos;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la primera letra: ");
        String car1 = sc.next();
        System.out.println("Dame la segunda letra: ");
        String car2 = sc.next();

        char c1 = car1.charAt(0); // Con esto cogemos del String la primera letra (0) para convertirla a char.
        char c2 = car2.charAt(0);

        if (car1.equals(car2)) { // Los valores "String" se comparan con valor.equals(segundovalor)

            System.out.println("La letra " + car1 + " y la letra " + car2 + " son iguales");

        } else {

            System.out.println("La letra " + car1 + " y la letra " + car2 + " son distintos");

        }

    }

}
