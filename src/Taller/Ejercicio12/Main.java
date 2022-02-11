package Taller.Ejercicio12;

import java.util.Scanner;

public class Main {

    public static void diferenciaPalabras(String palabra1, String palabra2){
        int tamaño;
        String diferenciasPalabra1 = "";
        String diferenciasPalabra2 = "";

        if(palabra1.length() < palabra2.length()) {
            tamaño = palabra1.length();
        }else {
            tamaño = palabra2.length();
        }
        for (int i = 0; i< tamaño; i++){
            if(palabra1.charAt(i) == palabra2.charAt(i)){
                continue;
            }
            diferenciasPalabra1 += palabra1.charAt(i)+" ";
            diferenciasPalabra2 += palabra2.charAt(i)+" ";

        }
        System.out.println("Las diferencias de la palabra 1 con respecto a la palabra 2 son las letras: "
                + diferenciasPalabra1);
        System.out.println("Las diferencias de la palabra 2 con respecto a la palabra 1 son las letras: "
                + diferenciasPalabra2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.println("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        if (!palabra1.equals(palabra2)) {
            diferenciaPalabras(palabra1,palabra2);
        }else {
            System.out.println("Son iguales");
        }

    }
}
