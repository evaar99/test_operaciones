package multiplica;

import java.util.Scanner;

/**
 * Clase que pide y multiplica dos números enteros.
 *
 * @author evaren
 */
public class Multiplica {

    /**
     * Método que multiplica dos números introducidos por teclado.
     *
     * @param num1 Número introducido por el usuario.
     * @param num2 Número introducido por el usuario.
     * @return Devuelve el resultado de multiplicar los 2 números introducidos
     * por el usuario.
     *
     */
    public static int multiplica(int num1, int num2) {
        return num1 * num2;

    }

    /**
     * Método que calcula el factorial del número introducido.
     *
     * @param num Número introducido por el usuario.
     * @return Devuelve el valor del factorial.
     */
    public static int factorial(int num) {
        int nfactorial = num;
        if (num < 0) {
            throw new IllegalArgumentException("¡Factorial negativo!");
        }

        if (num > 0) {
            for (int i = 1; i < num; i++) {
                nfactorial = i * num;
            }
        }
        return nfactorial;

    }

    /**
     * Método principal.
     *
     * @param args Parámetros de entrada de linea de comandos.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b;

        System.out.println("Introduce un número...");
        a = leer.nextInt();
        System.out.println("Introduce otro número...");
        b = leer.nextInt();

        System.out.println("Resultado: " + multiplica(a, b));
        System.out.println("Resultado factorial número 1: " + factorial(a)
                + "\nResultado facorial número 2: " + factorial(b));
    }
}
