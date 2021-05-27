package ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class EsLaboral {
    public static void run(){
        String dia = adquiereDia();
        evaluarDia(dia);

    }
    private static void evaluarDia(String dia){
        switch (dia){
            case "l": case "ma": case "mi":
            case "j": case "v":
                System.out.println("SI, hoy debes trabajar  </3");
                break;
            case "s": case "d":
                System.out.println("NO, sigue durmiendo! :p");
                break;
            default:
                System.out.println("No seleccionaste un dia valido, escribe las " +
                        "letras que estan detras de cada punto, por favor!");
                run();
        }


    }
    private static String adquiereDia(){
        System.out.println("##################################################");
        System.out.println("########### EJERCICIO OCHO #######################");
        System.out.println("Es hoy un dia laboral? Selecciona el dia que quieres evaluar");
        System.out.println("--(escribe las iniciales)--");
        System.out.println("D. Domingo \nL. Lunes \nMa. Martes \nMi. Miercoles \nJ. Jueves \nV. Viernes \nS. Sabado");
        Scanner sc = new Scanner(System.in);
        String dia = sc.nextLine();

        return dia.toLowerCase(Locale.ROOT);
    }
}
