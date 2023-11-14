package alerus.ejercicios.propuestos;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un texto: ");
		while (true) {

			int letra = System.in.read();
			System.out.print((char)letra);

		} //LO QUE HACE ES DECIR INFINITAMENTE LO MISMO QUE DECIMOS NOSOTROS (TESTEADO)

	}

}
