package Ejercicio2;

public class Operacion {
    public static int suma(int a, int b) throws DesbordaCapacidadException{
        long resultado = (long) a + (long) b;
        if(resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE){
            throw new DesbordaCapacidadException();
        }
        return (int) resultado;
    }

    public static int resta(int a,int b) throws  DesbordaCapacidadException{
        long resultado = 0;
        resultado = a - b;

        if(resultado>Integer.MAX_VALUE||resultado<Integer.MIN_VALUE){
            throw new DesbordaCapacidadException();
        }
        return (int)resultado;
    }

    public static int multiplicacion(int a ,int b)throws  DesbordaCapacidadException{

        long resultado = (long) a * b;

        if(resultado>Integer.MAX_VALUE||resultado<Integer.MIN_VALUE){
            throw new DesbordaCapacidadException();
        }

        return (int)resultado;
    }
}
