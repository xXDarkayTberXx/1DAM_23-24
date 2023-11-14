package supuestospracticos.tonce;
import java.util.Scanner;

public class ej3 {
    
    public static int fibonacci(int n) {

        int r;

        if (n == 1) {

            r = 0;

        } else if (n == 2) {

            r = 1;

        } else {

            r = fibonacci(n - 2) + fibonacci(n - 1);

        }

        return r;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print(fibonacci(i) + " ");;

        }

    }

}
