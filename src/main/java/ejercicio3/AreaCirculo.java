package ejercicio3;

import java.util.Scanner;

public class AreaCirculo {

    public static void run(){
        Double radio = adquirirRadio();
        calcular(radio);

    }

    private static void calcular(Double radio){
        Double areaCirculo = Math.PI*Math.pow(radio,2);
        System.out.println("El area del circulo de radio "+radio+" es "+areaCirculo);
        System.out.println("##################################################");

    }

    private static Double adquirirRadio(){
        Scanner sc = new Scanner(System.in);

        System.out.println("##################################################");
        System.out.println("########### EJERCICIO TRES #######################");
        System.out.println("Bienvenido al sistema de area de circulo");
        System.out.println("Por favor ingrese el radio");
        Double radio = Double.parseDouble(sc.nextLine());

        return radio;
    }

}
