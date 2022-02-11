package Taller.Ejercicio16;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el sexo (H -> hombre) (M -> Mujer");
        char sexo = scanner.nextLine().charAt(0);

        System.out.println("Ingrese el peso en kg: ");
        double peso = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese su altura en metros: ");
        double altura = Double.parseDouble(scanner.nextLine());

        //Objetos

        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();

        //Metodos Set para persona 3
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);

        //Metodos Set para persona 2
        persona2.setPeso(peso);
        persona2.setAltura(altura);

        //Comprobar el peso ideal
        int imc1 = persona1.calcularIMC();
        int imc2 = persona2.calcularIMC();
        int imc3 = persona3.calcularIMC();

        String estado1 = estadoPeso(imc1);
        String estado2 = estadoPeso(imc2);
        String estado3 = estadoPeso(imc3);

        //Indicar si es mayor de edad;
        boolean edad1 = persona1.esMayorDeEdad();
        boolean edad2 = persona2.esMayorDeEdad();
        boolean edad3 = persona3.esMayorDeEdad();

        String estadoE1 = estadoEdad(edad1);
        String estadoE2 = estadoEdad(edad2);
        String estadoE3 = estadoEdad(edad3);

        System.out.println(persona1);
        System.out.println(estado1);
        System.out.println(estadoE1);

        System.out.println(persona2);
        System.out.println(estado2);
        System.out.println(estadoE2);

        System.out.println(persona3);
        System.out.println(estado3);
        System.out.println(estadoE3);

    }

    public static String estadoPeso(int imc){
        String texto = "";
        switch (imc){
            case -1:
                texto = "Esta por debajo de su peso ideal";
                break;
            case 0:
                texto = "Esta en su peso ideal";
                break;
            case 1:
                texto = "Esta por encima de su peso ideal";
                break;
        }
        return texto;
    }

    public static String estadoEdad(boolean estado){
        if(estado)
            return "Es mayor de edad.";

        return "Es menor de edad.";
    }

}
