package ejercicio12;

import java.util.Scanner;

public class CompararPalabras {
    public static void run(){
        intro();
        String palabra1 = adquirirTexto();
        String palabra2 = adquirirTexto();
        comparar(palabra1, palabra2);
    }
    private static void comparar(String palabra1, String palabra2){
        if (palabra1.equals(palabra2)){
            System.out.println("Las dos palabras son iguales");
        }else {
            System.out.println("Las palabras son diferentes:\n");
            String pequenia = (palabra1.length()<palabra2.length())? palabra1:palabra2;
            for (int i = 0; i < pequenia.length(); i++) {
                if (palabra1.charAt(i)!=palabra2.charAt(i)){
                    System.out.println("Ubicacion: "+i+". Diferencia "+palabra1.charAt(i)+" <=> "+palabra2.charAt(i));
                }
            }
        }
    }
    private static String adquirirTexto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el texto que desees: ");
        String nuevaFrase = sc.nextLine();
        return nuevaFrase;
    }
    private static void intro(){
        System.out.println("##################################################");
        System.out.println("########### EJERCICIO DOCE #######################");
        System.out.println("Comparemos dos palabras\n");
    }
}
