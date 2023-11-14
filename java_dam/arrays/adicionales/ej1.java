package ejercicios.java_dam.arrays.adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[100];
        int suma = 0;
        int media = 0;
        int i = 0;


        for (i = 0; i < nums.length; i++){

            nums[i] = i+1;
        
            suma += nums[i];

            System.out.print(nums[i] + " ");            

        } 

        media = suma/i;

        System.out.println();
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (double)media);        

    }
}