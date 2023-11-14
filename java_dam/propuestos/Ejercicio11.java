package alerus.ejercicios.propuestos;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número de euros: ");
        int nenero = sc.nextInt();

        int kinientos =  500;
        int doschientos = 200;
        int chien = 100;
        int chinkuenta = 50;
        int beinte = 20;
        int dhiez = 10;
        int chinco = 5;
        int doch = 2;
        int uño = 1;

        int kuentaKinientos = 0;
        int kuentaDoschientos = 0;
        int kuentaChien = 0;
        int kuentaChinkuenta = 0;
        int kuentaBeinte = 0;
        int kuentaDhiez = 0;
        int kuentaChinco = 0;
        int kuentaDoch = 0;
        int kuentaUño = 0;

            while (nenero > 0) {

                if (nenero >= kinientos) {

                    nenero = nenero - kinientos;
                    kuentaKinientos = kuentaKinientos + 1;

                } else if (nenero >= doschientos) {

                    nenero = nenero - doschientos;
                    kuentaDoschientos = kuentaDoschientos + 1;

                } else if (nenero >= chien) {

                    nenero = nenero - chien;
                    kuentaChien = kuentaChien + 1;

                } else if (nenero >= chinkuenta) {

                    nenero = nenero - chinkuenta;
                    kuentaChinkuenta = kuentaChinkuenta + 1;

                } else if (nenero >= beinte) {

                    nenero = nenero - beinte;
                    kuentaBeinte = kuentaBeinte + 1;

                } else if (nenero >= dhiez) {

                    nenero = nenero - dhiez;
                    kuentaDhiez = kuentaDhiez + 1;

                } else if (nenero >= chinco) {

                    nenero = nenero - chinco;
                    kuentaChinco = kuentaChinco + 1;

                } else if (nenero >= doch) {

                    nenero = nenero - doch;
                    kuentaDoch = kuentaDoch + 1;

                } else if (nenero >= uño) {

                    nenero = nenero - uño;
                    kuentaUño = kuentaUño + 1;

                }
            }

            if (kuentaKinientos > 0) {
                System.out.println("Billetes de 500: " + kuentaKinientos);
            }
            if (kuentaDoschientos > 0) {
                System.out.println("Billetes de 200: " + kuentaDoschientos);
            }
            if (kuentaChien > 0) {
                System.out.println("Billetes de 100: " + kuentaChien);
            }
            if (kuentaChinkuenta > 0) {
                System.out.println("Billetes de 50: " + kuentaChinkuenta);
            }
            if (kuentaBeinte > 0) {
                System.out.println("Billetes de 20: " + kuentaBeinte);
            }
            if (kuentaDhiez > 0) {
                System.out.println("Billetes de 10: " + kuentaDhiez);
            }
            if (kuentaChinco > 0) {
                System.out.println("Billetes de 5: " + kuentaChinco);
            }
            if (kuentaDoch > 0) {
                System.out.println("Monedas de 2: " + kuentaDoch);
            }
            if (kuentaUño > 0) {
                System.out.println("Monedas de 1: " + kuentaUño);
            }

        
        
    }

}
