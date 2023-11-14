package propuestos.Tonce;

import java.util.Scanner;

public class Ejercicio5 {

    public static int trianguloRecursivo(int f, int c) {

        if (c == 1 || c == f * 2 - 1) {

            return 1;

        } else if (c == 2 && f == 2) {

            return trianguloRecursivo(f - 1, c - 1 );

        } else if (c == f * 2 - 2) {

            return trianguloRecursivo(f - 1, c - 2) + trianguloRecursivo(f - 1, c - 1);


        } else if (c == 2){

            return trianguloRecursivo(f - 1, c - 1 ) + trianguloRecursivo(f - 1, c);

        } else {

            return trianguloRecursivo(f - 1, c - 2) + trianguloRecursivo(f - 1, c - 1) + trianguloRecursivo(f - 1 , c) ;


        }


        


       


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int n = sc.nextInt();

        for (int f = 1; f <=n; f++) {

            for (int d = n; d >= f; d--) {

                System.out.print("\t");

            } 
            for (int c = 1; c <= (f * 2) - 1; c++) {

                System.out.print(trianguloRecursivo(f, c) + "\t");

            }

        System.out.println();

        }

    }

}
