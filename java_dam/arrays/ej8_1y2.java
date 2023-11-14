package ejercicios.java_dam.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ej8_1y2{

    public static void NumeroAleatorio(int[] numal) {

        for (int i = 0; i <=99; i++) {

            numal[i] = (int) (Math.random() * (100 + 1) -1);

        }

        // for (int elemento: numal) {

        //     System.out.print(elemento + " ");

        // }

        for (int j=numal.length; j>0;j--){

            System.out.print(numal[j-1] + " ");

        }

        System.out.println();

        int suma = 0;

        for (int c = 0; c < numal.length; c++ ) {

            suma += numal[c];

        }

        System.out.println("Suma: " + suma);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] numal = new int[100];

        NumeroAleatorio(numal);

    }
}
