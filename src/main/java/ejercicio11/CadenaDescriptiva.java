package ejercicio11;

import java.util.Scanner;

public class CadenaDescriptiva {
    public static void run(){
        intro();
        String frase = adquirirFrase();
        imprimirDetalles(frase);
    }
    private static void imprimirDetalles(String frase){
        int longitud = frase.length();
        int as,es,is,os,us;
        as=es=is=os=us = 0;
        for (int i = 0; i < longitud; i++) {
            switch (frase.charAt(i)){
                case 'a': as++; break;
                case 'e': es++; break;
                case 'i': is++; break;
                case 'o': os++; break;
                case 'u': us++; break;
            }
        }
        System.out.println("Esta frase tiene "+longitud+" caracteres");
        System.out.println("y repite las vocales asi:");
        System.out.println("a: "+as+" veces\ne: "+es+" veces\ni: "+is+" veces\no: "+os+" veces\nu: "+us+" veces");
    }
    private static String adquirirFrase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el texto que desees: ");
        String nuevaFrase = sc.nextLine();
        return nuevaFrase;
    }
    private static void intro(){
        System.out.println("##################################################");
        System.out.println("########### EJERCICIO ONCE #######################");
        System.out.println("Encontremos la longitud y frecuencia de vocales en un String");
    }
}
