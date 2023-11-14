package supuestospracticos.tonce;

public class ej1 {
    
    public static void pilaborda(int n) {

        System.out.println(n);
        pilaborda(++n);

    }

    public static void main(String[] args) {
        
        int n = 1;

        pilaborda(n);

    }

}
