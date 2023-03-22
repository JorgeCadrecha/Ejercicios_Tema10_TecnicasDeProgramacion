package Ejercicio1;

public class Función {

    public static double raizCuadrada(double numero){
        if (numero <= 0){
            return -1;
        } else {
            double raiz = Math.sqrt(numero);
            return raiz;
        }
    }
}