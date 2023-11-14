package ejercicios.java_dam.arrays.adicionales.dos;

import java.util.Scanner;

public class Matriz {
    
    Scanner sc = new Scanner(System.in);

    private int numfilas;
    private int numcolumnas;
    private int[][] matrix;

    public void solicitarTamanyo(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime las filas de la matriz: ");
        numfilas = sc.nextInt();
        System.out.println("Dime las columnas de la matriz: ");
        numcolumnas = sc.nextInt();
        matrix = new int[numfilas][numcolumnas];

    }

    public int getColumnas(){

        return numcolumnas;

    }

    public int getFilas(){

        return numfilas;

    }

    public int getInfo(int x, int y){

        return matrix[x][y];

    }

    public void intMaximo() {

        int max = 0;

        for (int i = 0; i < numfilas; i++) {

            for (int z = 0; z < numcolumnas; z++) {

                if (matrix[i][z] > max) {

                    max = matrix[i][z];

                }

            }

        }

        System.out.println("El número máx es: " + max);

    }

    public void asignarDatos() {

        for (int i = 0; i < matrix.length; i++) {

            for (int z = 0; z < matrix[i].length; z++) {

                matrix[i][z] = (int)(Math.random()*100)+1;

            }

        }

    }

    public void intMinimo() {

        int min = 99999999;

        for (int i = 0; i < matrix.length; i++) {

            for (int z = 0; z < matrix[i].length; z++) {

                if (matrix[i][z] < min) {

                    min = matrix[i][z];

                }

            }

        }

        System.out.println("El número min es: " + min);

    }

    public void suma(Matriz mamatrix2) {

        if (numfilas == mamatrix2.getFilas() && numcolumnas == mamatrix2.getColumnas()) {

            int[][] matrix3 = new int[numfilas][numcolumnas];

            for (int x = 0; x < numfilas; x++) {

                for (int y = 0; y < numcolumnas; y++) {

                    matrix3[x][y] = matrix[x][y] + mamatrix2.getInfo(x,y);

                }

            }

            matrix = matrix3;

        } else {

            System.out.println("Tamaño de segunda array incorrecto, vuelve a intentarlo");

        }

    }

    public void multiplicar(Matriz mamatrix4) {

        int[][] matrix5 = new int[numfilas][numcolumnas];

        if ( numfilas == mamatrix4.getFilas() && numcolumnas == mamatrix4.getColumnas() ) {

            if ( numfilas == numcolumnas ){

                for (int i = 0; i < numfilas; i++) {

                    for (int j = 0; j < matrix[i].length; j++)  {

                        for (int k = 0; k < matrix.length; k++) {

                            matrix5 [ i ][ j ] += matrix[ i ][ k ] * mamatrix4.getInfo(k, j);

                        }     
                    }
                }

                matrix = matrix5;

            }      
        }
    }


    public void mostrarMatriz() {

        for (int x = 0; x < matrix.length; x++) {

            for (int y = 0; y < matrix[x].length; y++) {

                System.out.print(matrix[x][y] + "\t");

            }

            System.out.println();

        }
    }
}
