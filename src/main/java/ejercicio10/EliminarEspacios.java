package ejercicio10;

import java.util.Scanner;

public class EliminarEspacios {
    public static void run(){
        intro();
        String frase = adquirirFrase();
        String sinEspacios= quitarEspacio(frase);
        System.out.println("... Ahora quitando los espacios...");
        System.out.println(sinEspacios);


    }
    private static String quitarEspacio(String frase){
        String anteriorLetra = " ";
        String nuevaLetra = "";
        String nuevaFrase = frase.replace(anteriorLetra,nuevaLetra);
        return nuevaFrase;
    }
    private static String adquirirFrase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el texto que desees: ");
        String nuevaFrase = sc.nextLine();
        return nuevaFrase;
    }
    private static void intro(){
        System.out.println("##################################################");
        System.out.println("########### EJERCICIO DIEZ #######################");
        System.out.println("Adquiere una oracion y elimina sus espacios");
    }

}
