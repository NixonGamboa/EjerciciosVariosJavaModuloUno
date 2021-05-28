package ejercicio15;

import java.util.Scanner;

public class Menu {
    public static void run(){
        intro();
        menu();
        ejecutar();
    }
    private static void ejecutar(){
        int opcion =0;
        do {
            opcion = selectOpcion();
            switch (opcion){
                case 1: case 2: case 3: case 4:
                case 5: case 6: case 7:
                    menu();
                    break;
                case 8:
                    System.out.println("GRACIAS POR PARTICIPAR");
                    break ;
                default:
                    System.out.println("OPCION INCORRECTO");
                    menu();
                    break;
            }
        }while (opcion != 8);


    }
    private static int selectOpcion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona una opcion \n Ingresa el numero:");
        int opcion = Integer.parseInt(sc.nextLine());
        return opcion;
    }
    public static void menu(){
        System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR");
    }
    private static void intro(){
        System.out.println("##################################################");
        System.out.println("########### EJERCICIO QUINCE #####################");
        System.out.println("Menu... \n");
    }
}
