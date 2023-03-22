package Ejercicio2;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int a= 0, b=0;
        String opcion="";

        while(!opcion.equalsIgnoreCase("s")){
            System.out.println("Introducir un número entero:");

            try{
                a = Integer.parseInt(teclado.nextLine());

                System.out.println("¿Operador? (+ - * / o s para salir)");
                opcion = teclado.nextLine();

                if (!opcion.equals("s")) {
                    System.out.println("Introducir otro número entero: ");
                    b=Integer.parseInt(teclado.nextLine());

                    switch (opcion) {
                        case "+":
                            System.out.printf("%d + %d = %d\n",a,b, Operacion.suma(a, b));
                            break;
                        case "-":
                            System.out.printf("%d - %d = %d\n", a,b, Operacion.resta(a,b));
                            break;
                        case "*":
                            System.out.printf("%d * %d =%d \n", a ,b,Operacion.multiplicacion (a ,b));
                            break;
                        case "/":
                            if(b!=0){
                                double resultado=(double)a/b;
                            }  else{throw new ArithmeticException();}
                            break;
                        default:
                            throw new Exception();
                    }
                }
            } catch  (NumberFormatException e) {
                System.err.print ("Valor introducido es incorrecto.Intentalo de nuevo.\n");
            }catch (DesbordaCapacidadException e){
                System.err.print(e.getMessage() + ". Intentalo de nuevo.\n");
                b=0;
            }catch(Exception e) {
                System.err.print ("Operación invalidad. Intentalo otra vez.\n");
            }
        }
    }
}