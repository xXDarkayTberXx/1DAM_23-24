package alerus.ejercicios.resueltos;

import java.util.Scanner;

public class Amstrong {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número y te diré si es un número Armstrong");
        int n = sc.nextInt();
        int numcont = 1;
        int numsum = 0;
        String number = String.valueOf(n);

        for(int i = 0; i < number.length(); i++) { 

            int k = Character.digit(number.charAt(i), 10); 
            System.out.println(numcont + "º número: " + k);

            numcont = numcont + 1;    
            
            numsum =  numsum + (int)Math.pow(k ,number.length());
        }       

        if (numsum == n) {

            System.out.println("El número es Armstrong");

        } else {
            System.out.println("El número no es Armstrong");
        }



    }

}
