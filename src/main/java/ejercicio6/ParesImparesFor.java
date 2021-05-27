package ejercicio6;

import java.util.ArrayList;

public class ParesImparesFor {
    public static void run(){
        System.out.println("##################################################");
        System.out.println("########### EJERCICIO SEIS #######################");
        System.out.println("Bienvenido al sistema de numeros pares e impares usando FOR");
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
        for (int count = 1; count <= 100 ; count++) {
            if (count % 2 == 0){
                pares.add(count);
            }else {
                impares.add(count);
            }
        }
        ArrayList[] datos = {pares,impares};
        return datos;
    }
}
