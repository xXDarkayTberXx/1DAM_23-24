package supuestospracticos.tonce;
import java.util.Arrays;
import java.util.Random;

public class ej5 {
    
    public static int multiplicarandoms(int[] numerosr, int i) {

        if (i >= numerosr.length) {

            return i;

        } else {

            return numerosr[i] * multiplicarandoms(numerosr, i + 1);

        }

    }

    public static void main(String[] args) {

        Random r = new Random();

        int[] numerosr = {r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1, r.nextInt((9 + 1 - 1))  + 1};
        int i = 0;
        System.out.println(Arrays.toString(numerosr));
        System.out.println(multiplicarandoms(numerosr, i));

    }

}
