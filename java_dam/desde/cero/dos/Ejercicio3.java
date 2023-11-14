package alerus.ejercicios.desde.cero.dos;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una letra y te digo si es mayúscula o minúscula: ");
        String l = sc.next();

        char c = l.charAt(0); // Con esto cogemos del String la primera letra (0) para convertirla a char.

        if (Character.isLowerCase(c)) { // Character.isLowerCase detecta si es minúsculo el char que ponemos entre paréntesis

            System.out.println("La letra " + c + " es minúscula");

        } else {

            System.out.println("La letra " + c + " es mayúscula");

        }

    }

}
