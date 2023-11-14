package ejercicios.java_dam.arrays;

import java.util.Scanner;

public class ej2 {

    public static void validaDNI(int dnin, String dni) {

        int division = dnin % 23;
        String resultado;

        System.out.println("-------------------------------------");
        System.out.println();

        switch (division) {

            case 0:
                resultado = dnin + "T";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 1:
                resultado = dnin + "R";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 2:
                resultado = dnin + "W";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 3:
                resultado = dnin + "A";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 4:
                resultado = dnin + "G";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 5:
                resultado = dnin + "M";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 6:
                resultado = dnin + "Y";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 7:
                resultado = dnin + "F";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 8:
                resultado = dnin + "P";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 9:
                resultado = dnin + "D";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 10:
                resultado = dnin + "X";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 11:
                resultado = dnin + "B";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 12:
                resultado = dnin + "N";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 13:
                resultado = dnin + "J";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 14:
                resultado = dnin + "Z";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 15:
                resultado = dnin + "S";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 16:
                resultado = dnin + "Q";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 17:
                resultado = dnin + "V";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 18:
                resultado = dnin + "H";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 19:
                resultado = dnin + "L";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 20:
                resultado = dnin + "C";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 21:
                resultado = dnin + "K";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
            case 22:
                resultado = dnin + "E";
                if (!dni.equals(resultado)){
                    System.out.println("El DNI no es válido");
                } else {
                    System.out.println("El DNI (" + resultado  + ") es válido");
                }
                break;
        }

        System.out.println();
        System.out.println("-------------------------------------");


    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un DNI y te diré si es válido: ");
        String dni = sc.next();

        if (dni.length() != 9){
            System.out.println("Error, número de dígitos no válidos, máximo 8 dígitos y 1 número de control en MAYUS");
        } else {
            int longitud = dni.length();
            String quitado = dni.substring(0, longitud - 1);
            int dnin = Integer.parseInt(quitado) ;
            validaDNI(dnin, dni);
        }


    }
}