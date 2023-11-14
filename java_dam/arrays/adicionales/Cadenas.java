package ejercicios.java_dam.arrays.adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class Cadenas {

    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // -- Declaración --

        String cad1 = "Pepe";
        String cad2 = new String("Lionel");
        String cad3 = new String(cad2);

        // -- Prueba 1 --

        System.out.println(cad1 + " " + cad1.length());
        System.out.println(cad2 + " " + cad2.length());
        System.out.println(cad3 + " " + cad3.length());

        // -- Prueba 2 --

        cad1 = cad1 + cad2;

        // -- Prueba 3 --

        System.out.println(cad1.toString());

        // -- Prueba 4 --

        System.out.println(cad2.compareTo(cad3));
        System.out.println(cad1.compareTo(cad3));
        System.out.println(cad2.compareTo(cad1));

        // -- Prueba 5 --

        if (cad2.equals(cad3)) {

            System.out.println("Son iguales");

        }

        if (!cad1.equals(cad3)) {

            System.out.println("Son diferentes");

        }

        // -- Prueba 6 --

        System.out.println(cad1);
        System.out.println(cad2.toLowerCase());
        System.out.println(cad3.toUpperCase());

        // -- Prueba 7 --

        String minombre = "    Alexandru Stefan Rusu         ";

        System.out.println(minombre.trim());

        // -- Prueba 8 --

        String p1 = cad1.substring(0,4);
        String p2 = cad1.substring(4,10);
        String cambiado = p1.replace("e", "a");
        cad1 = cambiado + p2;
        System.out.println(cambiado + p2);

        // -- Prueba 9 --

        System.out.println("¿Empieza cad1 por 'a'? " + cad1.startsWith("a"));
        System.out.println("¿Termina cad1 en 'l'? " + cad1.endsWith("l"));
        System.out.println("¿Empieza cad2 por la letra que empieza cad3?  " + cad2.startsWith(cad3));
        System.out.println("¿Termina cad2 en 'h'? " + cad2.endsWith("h"));

        // -- Prueba 10 --

        System.out.println(cad1.charAt(4));

        // -- Prueba 11 --

        System.out.println(cad1.indexOf(101));     
        System.out.println(cad1.indexOf("a"));   
        System.out.println(cad1.lastIndexOf("a"));

        // -- Prueba 12 --

        char[] mamayema = cad1.toCharArray() ;
        System.out.println(Arrays.toString(mamayema));

        


    }
}