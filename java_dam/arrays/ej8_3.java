package ejercicios.java_dam.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ej8_3{

    public static void Anadir(String[] nombres, int nal) {

        for (int i = 0; i < nal; i++) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Añade alumno nº" + i + ": ");
            String nombre = sc.next();
            nombres[i] = nombre;

        }

    }

    public static String[] Anadirus(String[] nombres) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el nombre que quieres añadir: ");
        String nombread = sc.next();

        String nombreada[] = new String[nombres.length + 1];

        System.arraycopy(nombres, 0, nombreada, 0, nombres.length);

        nombreada[nombreada.length-1] = nombread;

        System.out.println("El nuevo nombre añadido es: " + nombread);

        System.out.println(Arrays.toString(nombreada));

        return nombreada;

    }

    public static String[] Eliminarus(String[] nombreada) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el nombre que quieres quitar: ");
        String nombrequit = sc.next();

        String nombrequita[] = new String[nombreada.length-1];

        int posicion = Arrays.binarySearch(nombreada, nombrequit);

        System.arraycopy(nombreada, 0, nombrequita, 0, posicion);
        System.arraycopy(nombreada, posicion+1, nombrequita, posicion, nombrequita.length-posicion);

        System.out.println("El nombre quitado es: " + nombrequit);

        System.out.println(Arrays.toString(nombrequita));

        return nombrequita;

    }

    public static void Ordenarus(String[] nombrequita) {

        Arrays.sort(nombrequita);
        System.out.println("Ordenados: " + Arrays.toString(nombrequita));

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el número de alumnos que quieres almacenar: ");

        int mismus = 0;

        int nal = sc.nextInt();

        String[] nombres = new String[nal];
        
        Anadir(nombres, nal);

        String[] nombreada = Anadirus(nombres);

        String[] nombrequita = Eliminarus(nombreada);

        Ordenarus(nombrequita);

    }

}
