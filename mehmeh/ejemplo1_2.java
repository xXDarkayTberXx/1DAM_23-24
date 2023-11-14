package alerus.ejercicios.mehmeh;

public class ejemplo1_2 {

    int factorial (int n) {

        if (n > 0) {

            int resultado = n * factorial(n-1);
            return resultado;

        } else { //CASO BASE (n == 0 || n == 1)

            return 1;

        }

    }

    public static void main(String[] args) {
        
        ejemplo1_2 ejemplo = new ejemplo1_2();
        System.out.println("Factorial de " + 0);
        System.out.println(ejemplo.factorial(0));

    }
}
