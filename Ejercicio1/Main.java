package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        do {
            System.out.println("Dime un número");
            double numero = teclado.nextDouble();
            if (numero <= 0) {
                System.out.println("La raíz cuadrada no está definida para números negativos");
            } else {
                double raiz = Función.raizCuadrada(numero);
                System.out.println("La raiz cuadrada de " + numero + " es " + raiz);
                salir = true;
            }
        } while (!salir);

    }
}