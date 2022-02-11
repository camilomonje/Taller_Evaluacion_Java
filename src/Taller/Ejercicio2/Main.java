package Taller.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void comparar(int a, int b){
        if (a > b){
            System.out.println(a + " es mayor que " + b);
        }else if(a < b){
            System.out.println(b + " es mayor que " + a);
        }else if(a == b){
            System.out.println(a + " es igual a " + b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        String a = scanner.nextLine();

        System.out.println("Ingrese el segundo numero: ");
        String b = scanner.nextLine();

        comparar(Integer.parseInt(a),Integer.parseInt(b));

    }

}
