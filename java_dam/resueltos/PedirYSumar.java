package alerus.ejercicios.resueltos;

import java.util.Scanner;

public class PedirYSumar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sumando = 0;
        int n;

        do {

            System.out.println("Dame un número, si es 999 pararé");
            n = sc.nextInt();

            if (n != 999) {
                sumando = sumando + n;
            }
        
        } while (n != 999);

        if (sumando > 0) {

            System.out.println("--Fin del programa-- El resultado ( " + sumando  + " ) es mayor que 0");

        } else if (sumando < 0) {

            System.out.println("--Fin del programa-- El resultado ( " + sumando  + " ) es menor que 0");

        } else if (sumando == 0) {

            System.out.println("--Fin del programa-- El resultado ( " + sumando  + " ) es 0");

        }

    }

}
