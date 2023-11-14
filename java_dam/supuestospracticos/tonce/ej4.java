package supuestospracticos.tonce;
import java.util.Scanner;

public class ej4 {
    
    public static int sucesivasrestas(int n1, int n2, int i) {

        if (n1 == n2) {

            return i;

        } else if (n1 < n2) {

            return i;

        } else {

            return sucesivasrestas(n1 - n2, n2, i + 1 );

        }



    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el dividendo: ");
        int n1 = sc.nextInt();
        System.out.println("Dime el divisor: ");
        int n2 = sc.nextInt();
        int i = 0;
        int resta;

        int division = n1 / n2;
        System.out.println(division);

        System.out.println("Resultado division: " + sucesivasrestas(n1, n2, i));
        System.out.println("Residuo: " + (n1 - (n2 * sucesivasrestas(n1, n2, i))));



    }

}
