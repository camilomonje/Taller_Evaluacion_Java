package Taller.Ejercicio3;

import java.util.Scanner;

public class Main {

    public static void areaCirculo(String radio){
       double rad = Double.parseDouble(radio);
       double area = Math.PI * Math.pow(rad, 2);
       System.out.println("El area del circulo es igual a: " + area);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo ");
        String radio = scanner.nextLine();

        areaCirculo(radio);
    }
}
