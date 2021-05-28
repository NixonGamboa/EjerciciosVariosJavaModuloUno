package ejercicio16;

import java.util.Scanner;

public class Ejecutable {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingresa la edad:");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa el sexo: M Masculino, F Femenino");
        String sexo = sc.nextLine().toUpperCase();
        System.out.println("Ingresa el peso de la persona");
        Double peso = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa la altura de la persona ejem: 1.80");
        Double altura = Double.parseDouble(sc.nextLine());

        Persona persona1 = new Persona(nombre, edad ,sexo, peso , altura);
        persona1.generarDNI();

        Persona persona2 = new Persona(nombre, edad ,sexo);
        persona2.generarDNI();

        Persona persona3 = new Persona();
        persona3.generarDNI();
        persona3.setAltura(altura);
        persona3.setPeso(peso);
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSEXO(sexo);

        System.out.println("\nInformacion general "+persona1);

        System.out.println("\nInformacion general "+persona2);

        System.out.println("\nInformacion general "+persona3);
    }
}
