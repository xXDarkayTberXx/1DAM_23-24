package alerus.ejercicios.desde.cero.dos;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Dime el segundo número: ");
        int n2 = sc.nextInt();

        int división = n1 / n2;

        if (n1 != 0) {

            System.out.println("La división de " + n1 + " y " + n2 + " es: " + división);

        } else {

            System.out.println("No uses 0, prueba otra vez :) ");

        }


    }

}
