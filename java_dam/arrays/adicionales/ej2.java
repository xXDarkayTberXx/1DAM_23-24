package ejercicios.java_dam.arrays.adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[100];
        int mayor = 0;
        int suma = 0;
        int media = 0;
        int menor = 99999999;
        int i = 0;


        for (i = 1; i < nums.length; i++){

            double numal = Math.random()*(80-10);
            int numalint = (int)numal;

            nums[i] = numalint;
        
            suma += nums[i];

            if (nums[i] > mayor) {

                mayor = nums[i];

            }

            if (nums[i] < menor) {

                menor = nums[i];

            }

            System.out.print(nums[i] + " ");            


        } 

        

        media = suma/i;

        System.out.println();
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + (double)media); 

    }
}