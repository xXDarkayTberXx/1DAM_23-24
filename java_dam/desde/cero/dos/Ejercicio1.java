package alerus.ejercicios.desde.cero.dos;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número y te digo si es primo: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {

            System.out.println("El número " + n + " es par" );
        
        } else {

            System.out.println("El número " + n + " es impar");

        }

    }

}
