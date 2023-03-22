package Ejercicio2;

public class DesbordaCapacidadException  extends Exception {
    public DesbordaCapacidadException() {
        super("El valor introducido desborda las capacidades de esta calculadora. Inténtelo de nuevo. Inténtelo de nuevo...");
    }
}