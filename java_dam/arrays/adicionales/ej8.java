package ejercicios.java_dam.arrays.adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class ej8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nyn = "Sergio\n8.5\nMario\n4.9\nPedro\n3.8\nAndrés\n6.3";

        String[] separados = nyn.split("\n");
        double[] numeros = new double[separados.length];
        String[] nombres = new String[separados.length];
        int contador = 1;

        for (int i = 1; i < separados.length;){

            numeros[i] = Double.valueOf(separados[i]);

            i += 2;

        }

        for (int i = 0; i < separados.length;){

            nombres[i] = separados[i];

            i += 2;

        }


        for (int x = 0; x < separados.length;){

            System.out.println();
            System.out.println(nombres[x] + " tiene una nota de: " + numeros[contador]);

            x+=2;
            contador+=2;

        }

        System.out.println();

    }

}
