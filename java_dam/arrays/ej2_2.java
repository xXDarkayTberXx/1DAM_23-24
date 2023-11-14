package ejercicios.java_dam.arrays;

import java.util.Scanner;

public class ej2_2 {

    public static void validaDNI(int dnin, String letra) {

        int division = dnin % 23;
        String resultado;

        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

        System.out.println("-------------------------------------");
        System.out.println();

        if (letra.equals(letras[division])) {

            System.out.println("El DNI ( " + dnin + letra + " ) es correcto");

        } else {

            System.out.println("El DNI ( " + dnin + letra + " ) es incorrecto");

        }


        System.out.println();
        System.out.println("-------------------------------------");


    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un DNI y te diré si es válido: ");
        String dni = sc.next();

        if (dni.length() != 9){
            System.out.println("Error, número de dígitos no válidos, máximo 8 dígitos y 1 número de control en MAYUS");
        } else {
            int longitud = dni.length();
            String quitado = dni.substring(0, longitud - 1);
            String letra = dni.substring(8, longitud);
            int dnin = Integer.parseInt(quitado);
            validaDNI(dnin, letra);
        }


    }
}