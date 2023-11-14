package propuestos.Tonce;

import java.util.Scanner;

public class Ejercicio6 {

    public static String cambiabaseBinarioRecursivo(int n) {
        
        if (n == 0) {

            return "0";

        } else if (n == 1) {

            return "1";

        } else {

            return String.valueOf(cambiabaseBinarioRecursivo(n / 2)) + String.valueOf(n % 2);

        }
        
    }

    public static String cambiabaseOctalRecursivo(int n) {
        
        if (n < 8) {

            return String.valueOf(n);

        } else {

            return String.valueOf(cambiabaseOctalRecursivo(n / 8)) + String.valueOf(n % 8);

        }
        
    }

    public static String cambiabaseHexRecursivo(int n) {
        
        switch (String.valueOf(n)) {
                case "10":
                    return "A";
                case "11":
                    return "B";
                case "12":
                    return "C";
                case "13":
                    return "D";   
                case "14":
                    return "E";
                case "15":
                    return "F";
        }

        if (n < 16) {

            return String.valueOf(n);

        } else {

            return String.valueOf(cambiabaseHexRecursivo(n / 16)) + String.valueOf(n % 16);
            
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int n = sc.nextInt();

        System.out.println("El número en binario es: " + cambiabaseBinarioRecursivo(n));
        System.out.println("El número en octal es: " + cambiabaseOctalRecursivo(n));
        System.out.println("El número en hexadecimal es: " + cambiabaseHexRecursivo(n));



    }

}
