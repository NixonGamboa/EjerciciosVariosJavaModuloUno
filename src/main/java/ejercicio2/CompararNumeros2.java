package ejercicio2;

import java.util.Scanner;

public class CompararNumeros2 {


    public static void run(){
        Double[] numbers = adquirirNumeros();

        compararNumeros(numbers[0],numbers[1]);
    }

    public static Double[] adquirirNumeros(){
        Scanner sc = new Scanner(System.in);

        System.out.println("##################################################");
        System.out.println("########### EJERCICIO DOS ########################");
        System.out.println("Bienvenido al sistema de comparacion de numeros");
        System.out.println("Por favor ingrese el primer numero");
        double firstNumber = sc.nextDouble();
        System.out.println("Por favor ingrese el segundo numero");
        double secondNumber = sc.nextDouble();

        return new  Double[]{firstNumber, secondNumber};
    }

    public static void compararNumeros(double num1, double num2){

        System.out.println("Numero uno: "+num1+" <====> Numero dos: "+num2);
        if (num1 > num2 ){
            System.out.println("Como "+num1+ " es mayor que "+num2+" \n Se puede decir que el primer numero es mayor");
        }else if (num1 == num2 ){
            System.out.println("Como "+num1+ " es igual que "+num2+" \n Se puede decir que ambos numeros tienen el mismo valor");
        }else if (num1 < num2 ){
            System.out.println("Como "+num1+ " es menor que "+num2+" \n Se puede decir que el segundo numero es mayor");
        }
        System.out.println("##################################################");
    }
}
