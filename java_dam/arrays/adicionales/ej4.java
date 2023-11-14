package ejercicios.java_dam.arrays.adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[4][4];
        int sumafila = 0, sumadia = 0, sumacol = 0, coldiasum = 0, fildiasum = 0, fildiainvsum = 0, coldiainvsum = 3, sumadiainv = 0, sumapm = 0;
        float media = 0f;



        for (int f = 0; f < 4; f++) {

            for (int c = 0; c < 4; c++) {

                numeros[f][c] = sc.nextInt();

                sc.nextLine();

            }
            
        }

        for (int f = 0; f < 4; f++) {

            for (int c = 0; c < 4; c++) {

                System.out.print(numeros[f][c] + "\t");

            }
            System.out.println();
        }

        System.out.println("Dime una fila: ");
        int filasum = sc.nextInt();

        if ( filasum >= 0 || filasum <= 3) {

            for (int y = 0; y < 4; y++ ) {

                sumafila += numeros[filasum][y];

            }

        }

        System.out.println("La suma de la fila " + filasum + " es: " + sumafila);

        System.out.println("Dime una columna: ");
        int colsum = sc.nextInt();

        if ( colsum >= 0 || colsum <= 3) {

            for (int y = 0; y < 4; y++ ) {

                sumacol += numeros[y][colsum];

            }

        }

        System.out.println("La suma de la columna " + colsum + " es: " + sumacol);

        for (int x = 0; x < 4; x++ ) {

            sumadia += numeros[fildiasum][coldiasum];

            coldiasum++;
            fildiasum++;

        }

        System.out.println("La suma de la diagonal normal es: " + sumadia);

        for (int x = 0; x < 4; x++ ) {

            sumadiainv += numeros[fildiainvsum][coldiainvsum];

            coldiainvsum--;
            fildiainvsum++;

        }

        System.out.println("La suma de la diagonal inversa es: " + sumadiainv);

        for (int f = 0; f < 4; f++) {

            for (int c = 0; c < 4; c++) {

                sumapm += numeros[f][c];

            }

        }

        media = sumapm / 16f;

        System.out.println("La media es: " + media);

    }
}