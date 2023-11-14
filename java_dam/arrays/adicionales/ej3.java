package ejercicios.java_dam.arrays.adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[5][8];

        for (int i = 0; i < 5; i++) {

            for (int f = 0; f < 8; f++) {

                numeros[i][f] = (int)(Math.random()*100)+1;

                System.out.print(numeros[i][f] + "\t");

            }

            System.out.println();

        }
    }
}