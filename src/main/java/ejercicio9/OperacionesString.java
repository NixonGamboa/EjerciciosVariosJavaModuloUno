package ejercicio9;

import java.util.Locale;
import java.util.Scanner;

public class OperacionesString {
    public static void run(){
        intro();
        String frase1 = fraseRemplazarLetra();
        String frase2 = adquirirFrase();
        concatenarMostrarCadenas(frase1, frase2);


    }

    private static void concatenarMostrarCadenas(String frase1, String frase2) {
        System.out.println(frase1+"; "+frase2);
    }

    private static String fraseRemplazarLetra(){
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        char anteriorLetra = 'a';
        char nuevaLetra = 'e';
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
        System.out.println("########### EJERCICIO NUEVE #######################");
        System.out.println("Remplaza caracteres en una oracion y concatena con otra frase");
    }
}
