package ejercicios.java_dam.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class  ej8_4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un texto: ");
        String texto = sc.nextLine();

        int repetida = 0;

        String[] spliteado = texto.split(" ");

        System.out.println(Arrays.toString(spliteado));
        
        Arrays.sort(spliteado);

        System.out.println(Arrays.toString(spliteado));

        int contador = 1;

        for (int i = 1; i < spliteado.length; i++) {

            if (!spliteado[i-1].equals(spliteado[i])){

                contador++;

            }
        }

        System.out.println("Número de palabras distintas: " + contador);

    }
}