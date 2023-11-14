//*
// CAMBIOS REALIZADOS:
// -- Línea 13, en el for, su condicion mientras, teníamos de valor de condicion 3, es decir, contaba hasta 3, debemos de
// cambiarlo a 10, para coseguir el resultado esperado. --
// *//

package ejercicios.java_ed; //Cambio de paquete de javaapplication2 a ejercicios.java_ed (mi paquete)
public class Ejer2_UD2 { //Cambio de nombre de la clase, de "Piramide" a el nombre del archivo

    public static void main(String[] args) { //Falta Public Static Void Main, añadido
        int i, j, k;
         for (k = 1; k <= 10; k++){ //Bucle que cuenta hasta 10 (Como tenemos "k = 1", debemos de cambiar las "i" a "k"
             for (i = 1; i <= 10 - k; i++) { //Cambio al valor de "3 - k " a "10 - k" para hacer forma de triangulo Y PUNTO DE RUPTURA PARA VER EL VALOR DE ESTE
                 System.out.print(" ");
             }
             for (j = 1; j <= (k * 2) - 1; j++) { //PUNTO DE RUPTURA PARA VER SI SE EJECUTA BIEN LA IMPRESIÓN DE "*"
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}