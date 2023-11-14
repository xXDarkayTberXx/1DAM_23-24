package supuestospracticos.tonce;
import java.util.Random;
import java.util.Scanner;
import javax.swing.border.Border;

public class ej2 {
    
    public static String borranums(String cadena, int longitud, int iteracion) {

        if (longitud == 1) {

            return cadena;

        } else {

            return cadena = cadena.substring(0, longitud - iteracion);

        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una cadena de caracteres (sin espacios): ");
        String cadena = sc.nextLine();

        int longitud = cadena.length();
        int iteracion = 1;

        while (iteracion <= longitud) {

            System.out.println(borranums(cadena, longitud, iteracion));
            iteracion++;

        }

    }

}
