package ejercicios.java_dam.arrays.adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class ej5 {

    public int solicitarTamanyo(int lon){

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la longitud del vector: ");
        lon = sc.nextInt();
        return lon;

    }

    public int[] asignarDatos(int[] v, int lon){

        for (int i = 0; i < lon; i++) {

            v[i] = (int)(Math.random()*100)+1;

        }

        return v;

    }

    public int intMaximo(int[] v, int lon){

        int max = 0;

        for (int i = 0; i < lon; i++) {

            if (v[i] > max) {

                max = v[i];

            }

        }

        return max;

    }

    public int intMinimo(int[] v, int lon){

        int min = 9999;

        for (int i = 0; i < lon; i++) {

            if (v[i] < min) {

                min = v[i];

            }

        }

        return min;

    }

    public int[] insertar(int[] v,int pos, int num){

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la posición que quieres cambiar: ");
        pos = sc.nextInt();
        System.out.println("Dime el número que quieres insertar: ");
        num = sc.nextInt();

        v[pos] = num;

        return v;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ej5 Vector = new ej5();

        int lon = 0;

        int num = 0;

        int pos = 0;
        
        lon = Vector.solicitarTamanyo(lon);

        int[] v = new int[lon];

        v = Vector.asignarDatos(v, lon);

        System.out.println("Array: " + Arrays.toString(v));

        int max = Vector.intMaximo(v,lon);
        
        System.out.println("Número máximo: " + max);

        int min = Vector.intMinimo(v,lon);

        System.out.println("Número mínimo: " + min);

        v = Vector.insertar(v,pos,num);

        System.out.println("Array cambiada: " + Arrays.toString(v));
    }
}