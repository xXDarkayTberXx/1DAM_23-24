package alerus.ejercicios.propuestos.Tonce;

import java.util.Scanner;

public class Ejercicio1 {

    public static int factorialIterativo(int n) { //Funcion del factorial en iterativo

        int i;
        int factorial = 0;

        for (i = n; i > 1; i--) {

            factorial = n * (i - 1); //Decimos que ahora factorial es el número resultado de la multiplicacion x el número anterior

            n = factorial; //Decimos que N es el resultado de la multiplicación

        }

        return factorial;

    }


    public static int factorialRecursivo(int n) {

        if (n <= 1) { //Si n es igual a 1, que devuelva 1

            return 1;

        }

        return n * factorialRecursivo(n - 1); //Llamamos a la funcion recursivamente multiplicandole n a la funcion restandole 1 a n

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int n = sc.nextInt();

        System.out.println("Método iterativo: " + factorialIterativo(n));
        System.out.println("Método recursivo: " + factorialRecursivo(n));

        sc.close();

    }


    

}
