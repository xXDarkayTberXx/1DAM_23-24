package alerus.ejercicios.desde.cero.dos;

import java.util.Scanner;

public class Ejercicio5Rep {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 100;

        do {

            System.out.println(n);

            n = n - 1;

        }  while (n >= 1);

    }

}
