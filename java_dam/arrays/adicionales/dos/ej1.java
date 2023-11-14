package ejercicios.java_dam.arrays.adicionales.dos;

public class ej1 {

    public static void main(String[] args) {

        Matriz mamatrix = new Matriz();

        mamatrix.solicitarTamanyo();

        mamatrix.asignarDatos();

        mamatrix.intMaximo();

        mamatrix.intMinimo();

        Matriz mamatrix2 = new Matriz();

        mamatrix2.solicitarTamanyo();

        mamatrix2.asignarDatos();

        mamatrix.suma(mamatrix2);

        Matriz mamatrix4 = new Matriz();

        mamatrix4.solicitarTamanyo();

        mamatrix4.asignarDatos();

        mamatrix.multiplicar(mamatrix4);



        System.out.println("-- MOSTRANDO TODAS LAS MATRICES --");

        System.out.println("Matriz 1");

        mamatrix.mostrarMatriz();

        System.out.println("Matriz 2");

        mamatrix2.mostrarMatriz();

        System.out.println("Matriz 4");

        mamatrix4.mostrarMatriz();

        

    }

}
