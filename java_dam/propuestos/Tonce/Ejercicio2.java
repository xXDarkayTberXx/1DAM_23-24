package alerus.ejercicios.propuestos.Tonce;

import java.util.Scanner;

public class Ejercicio2 {

    public static void fibonacciIterativo(int n) {

        System.out.println();

        int i;
        int anterior = 0;
        int anterior2 = 1;
        int x = 1;

        System.out.print("0 ");

        for (i = 1; i < n; i++) {

            System.out.print(x + " ");
            
            x = anterior + anterior2; //x es igual a los dos numeros anteriores sumados

            anterior = anterior2; //Anterior, ahora es el siguiente anterior
            anterior2 = x; //Anterior2 es ahora x, es decir, si anterior era 1 y anterior2 era 2: x = 3 -- anterior = 2 -- anterior2 = 3
     
        }

        System.out.println();

    }


    public static int fibonacciRecursivo(int n) {

        int r;

        if (n == 1) { //CASOS BASES, SI N ES IGUAL A 1 O 2, DEVOLVEMOS 0 Y 1

            r = 0;

        } else if (n == 2) {

            r = 1;

        } else {

            r = fibonacciRecursivo(n - 2) + fibonacciRecursivo(n - 1); /*Llamamos a la funcion recursivamente metiendola en la variable r, 
            restandole a n 2 y la sumamos a otra llamada a la funcion restandole a n 1. */

        }
       

        return r;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int n = sc.nextInt();

        fibonacciIterativo(n);

        for (int x = 1; x <= n; x++) {

            System.out.print(fibonacciRecursivo(x) + " ");
            

        }
            


    }

}
