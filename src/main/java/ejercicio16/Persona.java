package ejercicio16;


public class Persona {
    private final String SEXO_M = "M";
    private final String SEXO_F = "F";

    private String nombre = "";
    private int edad = 0;
    private String DNI;
    private String SEXO = SEXO_M;
    private double peso = 0;
    private double altura = 0;

    public Persona() {
    }

    public Persona(String nombre, int edad, String SEXO) {
        this.nombre = nombre;
        this.edad = edad;
        this.SEXO = comprobarSexo(SEXO);
    }

    public Persona(String nombre, int edad, String SEXO, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.SEXO = comprobarSexo(SEXO);
        this.peso = peso;
        this.altura = altura;
    }

    public String comprobarSexo(String SEXO) {
        return (SEXO == "F") ? SEXO_F : SEXO_M;
    }

    private int calcularIMC() {
        int imc = formulaPeso();
        if (imc < 20) {
            return -1;
        } else if (imc < 26) {
            return 0;
        } else {
            return 1;
        }
    }

    private int formulaPeso() {
        return (int) (this.peso / (Math.pow(this.altura, 2)));
    }

    public String mostrarResultadoIMC(){
        switch (calcularIMC()){
            case -1:
                return "estas en tu peso ideal";
            case 0:
                return "estas por debajo tu peso ideal";
            case 1:
                return "tienes sobrepeso";
            default:
                return "sin respuesta";
        }
    }

    public Boolean esMayorDeEdad() {
        return (this.edad>=18)? true:false;
    }



    public void generarDNI() {
        int num = (int) (100000000 * Math.random());
        int resto = num % 23;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        this.DNI = "" + num + "" + letras[resto];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setSEXO(String SEXO) {
        this.SEXO = comprobarSexo(SEXO);
    }

    @Override
    public String toString() {
        String edad = (esMayorDeEdad()) ? "mayor de edad " : "menor de edad";
        return "\nNombre='" + this.nombre + "\nDNI " + this.DNI + "\nEdad:" + this.edad + "\n SEXO='" + this.SEXO +
                "\nPeso:" + peso + "\nAltura=" + altura+ "\nIMC: "+mostrarResultadoIMC()+"\nEs "+edad;
    }
}
