package ejercicio1;

public class CompararNumeros {


    public static void run(){
        double firstNumb = 8.5;
        double secondNumber = 4;

        compararNumeros(firstNumb,secondNumber);
    }

    public static void compararNumeros(double num1, double num2){

        System.out.println("##################################################");
        System.out.println("########### EJERCICIO UNO ########################");
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
