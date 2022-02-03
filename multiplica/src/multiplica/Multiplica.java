package multiplica;

import java.util.Scanner;

/**
 * Clase que pide y multiplica dos números enteros.
 * 
 * @author evaren
 */
public class Multiplica {

    /**
     *Método que multiplica dos números introducidos por teclado.
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
     * Método principal.
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
    }

}