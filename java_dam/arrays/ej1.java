package ejercicios.java_dam.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {

    public static void NumeroAleatorio(int[] numal) {

        for (int i = 0; i <=99; i++) {

            numal[i] = (int) (Math.random() * (100 + 1) -1);

        }

        System.out.println("Lista de números: " + Arrays.toString(numal));

    }

    public static void comparamax(int[] numal) {

        int max = 0;

        for (int c = 0; c < numal.length; c++ ) {

            if (numal[c] > max) {

                max = numal[c];

            }

        }

        System.out.println("Numero max: " + max);

    }

    public static void comparamin(int[] numal) {

        int min = 99999999;

        for (int c = 0; c < numal.length; c++ ) {

            if (numal[c] < min) {

                min = numal[c];

            }

        }

        System.out.println("Numero min: " + min);

    }

    public static void sumanums(int[] numal) {

        int suma = 0;

        for (int c = 0; c < numal.length; c++ ) {

            suma += numal[c];

        }

        System.out.println("Suma: " + suma);

    }


    public static void medianums(int[] numal) {

        int suma = 0;
        int c = 0;

        for (c = 0; c < numal.length; c++ ) {

            suma += numal[c];

        }

        int media = suma / c;

        System.out.println("Media: " + media);

    }

    public static void reemplaza(int[] numal, int pnr, int nr) {

        System.out.println("El número de la posición " + pnr + " ( " + numal[pnr] + " ) cambiará a " + nr);

        numal [pnr] = nr;

        System.out.println("Lista de números: " + Arrays.toString(numal));

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] numal = new int[100];

        NumeroAleatorio(numal);

        System.out.println("Dime que quieres hacer: \n"
        
                           + "1) Ver el número máximo \n"
                           + "2) Ver el número mínimo \n"
                           + "3) Ver la suma de los números \n"
                           + "4) Ver la media de los números \n"
                           + "5) Cambiar número en posicion "
        
        );

        int respuesta = sc.nextInt();

        switch (respuesta) {
            case 1:
                comparamax(numal);
                break;
            case 2:
                comparamin(numal);
                break;
            case 3:
                sumanums(numal);
                break;
            case 4:
                medianums(numal);
                break;
            case 5:
                System.out.println("Dime en qué posicion está el numero a reemplazar [0-99]");
                int pnr = sc.nextInt();
                System.out.println("Dime por qué número se reemplaza");
                int nr = sc.nextInt();
                reemplaza(numal, pnr, nr);
                break;
            default:
                System.out.println("Elige un número de la lista...");
                break;
        }
    }
}