package ejercicio5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ParesEImpares {
    public static void run(){
        System.out.println("##################################################");
        System.out.println("########### EJERCICIO CINCO #######################");
        System.out.println("Bienvenido al sistema de numeros pares e impares usando while");
        ArrayList[] parImpar = separarParesImpares();
        System.out.println("Los numeros pares que hay de 1 a 100 son: ");
        mostrarNumeros(parImpar[0]);
        System.out.println("Los numeros ipares que hay de 1 a 100 son: ");
        mostrarNumeros(parImpar[1]);
        System.out.println("##################################################");



    }
    private static void mostrarNumeros(ArrayList<Integer> numberList){
        for (Integer number: numberList ) {
            System.out.println(number);
        }
    }
    private static ArrayList[] separarParesImpares(){
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();
        Integer count = 1;
        while (count <= 100){
            if (count % 2 == 0){
                pares.add(count);
            }else {
                impares.add(count);
            }
            count ++;
        }
        ArrayList[] datos = {pares,impares};
        return datos;
    }
}
