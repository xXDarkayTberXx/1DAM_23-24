package alerus.ejercicios.propuestos.Tonce;

import java.util.Scanner;

public class Ejercicio3 {

    public static int cuadradoRecursivo(int c, int f) {
        
        if (c == 1){ //CASOS BASE, SI C = 1 RETORNAMOS 1, ESTO HACE QUE EL BORDE IZQUIERDO SEAN 1s, ya que son de la primera columna

            return 1;

        }
        if (f == 1){ //CASOS BASE, SI F = 1 RETORNAMOS 1, ESTO HACE QUE LA PRIMERA FILA SEAN 1s, ya que son la primera fila

            return 1;

        }
        
        return cuadradoRecursivo( c - 1, f) + cuadradoRecursivo(c, f - 1); /* Retornamos recursivamente la funcion 
        sumando el número de la columna de antes + el número de la fila de encima */

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int n = sc.nextInt();

        for (int c = 1; c <= n; c++) {

           for (int f = 1; f <= n; f++) {

                 System.out.print(" \t " + cuadradoRecursivo(c, f));

           }

           System.out.println();

        }

    }

}
