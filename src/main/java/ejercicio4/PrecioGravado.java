package ejercicio4;

import java.util.Scanner;

public class PrecioGravado {

    public static void run(){
        Double precioBase = adquirirBase();
        calcular(precioBase);

    }

    private static void calcular(Double precioBase){
        final double iva = 0.21;
        Double precioTotal =precioBase+precioBase*iva;
        System.out.println("El costo total de su articulo de precioBase $"+precioBase+" es $"+precioTotal);
        System.out.println("##################################################");

    }

    private static Double adquirirBase(){
        Scanner sc = new Scanner(System.in);

        System.out.println("##################################################");
        System.out.println("########### EJERCICIO CUATRO #####################");
        System.out.println("Bienvenido al sistema de la DIAN ");
        System.out.println("Por favor ingrese el precio sin IVA");
        Double precioBase = Double.parseDouble(sc.nextLine());

        return precioBase;
    }

}
