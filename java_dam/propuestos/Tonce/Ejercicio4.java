package propuestos.Tonce;

import java.util.Scanner;

public class Ejercicio4 {

    public static int trianguloRecursivo(int c, int f) {
        
        if (c == 1){ //CASOS BASE, SI SON DE LA PRIMERA COLUMNA, RETORNAR 1s.

            return 1;

        }
        if (f == c){ //CASOS BASE, SI LA FILA ES IGUAL A LA COLUMNA, ES DECIR 1, PONDRÁ EL FINAL DE CADA FILA A 1s.

            return 1;

        }
        
        return trianguloRecursivo( c, f - 1) + trianguloRecursivo(c - 1, f - 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int n = sc.nextInt();

        for (int f = 1; f <= n; f++) {

            for (int c = 1; c <= f ; c++) {

                System.out.print(trianguloRecursivo(c, f) + "\t");

            }

            System.out.println();

        }

        sc.close();

    }

}
