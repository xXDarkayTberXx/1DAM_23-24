package ejercicios.java_dam.arrays.adicionales;

import java.util.Scanner;

public class ej7 {
    
    public static boolean esCapicua(int dato){

        Integer i = Integer.valueOf(dato);

        String opu = new StringBuffer(i.toString()).reverse().toString();

        return i.toString().equals(opu.toString()); // No se pueden comparar Strings con "==", se utiliza la funcion .equals .
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un num: ");

        int dato = sc.nextInt();

        System.out.println(esCapicua(dato));

    }

}
