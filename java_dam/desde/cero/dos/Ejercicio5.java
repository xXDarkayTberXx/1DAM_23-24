package alerus.ejercicios.desde.cero.dos;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame dos letras juntas y te digo si son mayúsculas o minúsculas: ");
        String c1 = sc.next();


        char car1 = c1.charAt(0);
        char car2 = c1.charAt(1);

        if (Character.isLowerCase(car1) && Character.isLowerCase(car2)) {

            System.out.println("La letra " + car1 + " la letra "+ car2 + " son minúsculas");

        } else {

            System.out.println("Una de las letras es mayúscula, terminando programa");

        }

    }

}
