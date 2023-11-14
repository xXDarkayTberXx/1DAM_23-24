package ejercicios.java_dam.arrays;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un texto: ");
        String texto = sc.nextLine();
        System.out.println("Dame una palabra para buscarla en el texto: ");
        String palabra = sc.next();

        int repetida = 0;

        while (texto.contains(palabra)) {

            repetida +=1;

            texto = texto.replaceFirst(palabra, " ");

        }
        
        System.out.println(repetida);

    }
}