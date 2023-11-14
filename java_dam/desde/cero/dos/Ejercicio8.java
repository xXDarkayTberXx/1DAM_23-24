package alerus.ejercicios.desde.cero.dos;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Dime el segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Dime el tercer número: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {

            System.out.println("El número " + n1 + " es el mayor");

        } else if (n2 > n1 && n2 > n3) {

            System.out.println("El número " + n2 + " es el mayor");

        } else if (n3 > n1 && n3 > n2) {

            System.out.println("El número " + n3 + " es el mayor");

        }

    }

}
