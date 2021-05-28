package ejercicio14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConteoA1000 {
    public static void run(){
        intro();
        int start = obtenerInicio();
        contar(start);
    }
    private static void contar(int start){
        System.out.println("Let's go!");
        for (int i = start; i <=1000 ; i+=2) {
            System.out.println(i);
        }
    }
    private static int obtenerInicio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("En que numero quieres empezar? \n Ingresa el numero:");
        int start = Integer.parseInt(sc.nextLine());
        return start;
    }
    private static void intro(){
        System.out.println("##################################################");
        System.out.println("########### EJERCICIO CATORCE ####################");
        System.out.println("Vamos a contar de 2 en 2 hasta 1000:\n");
    }
}
