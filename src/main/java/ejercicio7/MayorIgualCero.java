package ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class MayorIgualCero {
    public static void run(){
        double number = encontrarPositivo();
        mostrarNumeros(number);
    }
    private static void mostrarNumeros(double number){

        System.out.println("El numero "+number+" es mayor o igual a cero");
        System.out.println("##################################################");



    }
    private static double encontrarPositivo(){
        System.out.println("##################################################");
        System.out.println("########### EJERCICIO SIETE ######################");
        System.out.println("Busquemos un numero mayor o igual a cero");
        System.out.println("Ingresa los numeros y el sistema te dira cuando lo encuentres");

        Scanner sc = new Scanner(System.in);
        double number;
        do {
            System.out.println("Ingrese un numero: ");
            number = Double.parseDouble(sc.nextLine());
        }while (number < 0);
        System.out.println("QUE BIEN!!!  lO ENCONTRASTE!!!!");
        return number;
    }
}
