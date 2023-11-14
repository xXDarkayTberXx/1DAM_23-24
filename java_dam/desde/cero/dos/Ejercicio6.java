package alerus.ejercicios.desde.cero.dos;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime algo, una letra letra o número: ");
        String c1 = sc.next();

        char car1 = c1.charAt(0);

        if (Character.isDigit(car1)) { // Con esto comprobamos si el carácter analizado es un número (digit)

            System.out.println("El carácter " + car1 + " es un número");

        } else {

            System.out.println("El carácter no es un número");

        }

    }

}
