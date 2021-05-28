package ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HoraActual {
    public static void run(){
        intro();
        imprimirFechaHora();
    }
    private static void imprimirFechaHora(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");
        String dateTime = LocalDateTime.now().format(format);
        System.out.println(dateTime);
    }
    private static void intro(){
        System.out.println("##################################################");
        System.out.println("########### EJERCICIO TRECE ######################");
        System.out.println("Fecha y hora actual:\n");
    }
}
