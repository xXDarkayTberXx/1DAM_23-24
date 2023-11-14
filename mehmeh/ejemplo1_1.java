package alerus.ejercicios.mehmeh;

public class ejemplo1_1 {

    void cuentaAtras (int n) {

        if (n > 0) {

            System.out.println(n);
            cuentaAtras(--n);

        } else { //CASO BASE (n == 0)

            System.out.println("Final !");

        }

    }

    public static void main(String[] args) {
        
        ejemplo1_1 ejemplo = new ejemplo1_1();
        ejemplo.cuentaAtras(10);

    }
}
