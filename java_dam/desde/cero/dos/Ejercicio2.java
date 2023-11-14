package alerus.ejercicios.desde.cero.dos;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número y te digo si es primo: ");
        int n = sc.nextInt();

        if (n % 10 == 0) {

            System.out.println("El número " + n + " es multiplo de 10" );
        
        } else {

            System.out.println("El número " + n + " no es multiplo de 10");

        }

    }

}
