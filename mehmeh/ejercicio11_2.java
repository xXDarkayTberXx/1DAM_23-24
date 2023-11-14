package alerus.ejercicios.mehmeh;

import java.util.Scanner;

public class ejercicio11_2 {
    
    public static String cambiabaseBinarioRecursivo(int n) {
        
        if (n == 0) {

            return "0";

        } else if (n == 1) {

            return "1";

        } else {

            return String.valueOf(cambiabaseBinarioRecursivo(n / 2)) + String.valueOf(n % 2);

        }
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int n = sc.nextInt();

        System.out.println("El número en binario es: " + cambiabaseBinarioRecursivo(n));

    }

}
