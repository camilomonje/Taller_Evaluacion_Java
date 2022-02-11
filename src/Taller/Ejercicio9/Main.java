package Taller.Ejercicio9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String texto = "La sonrisa sera la mejor arma contra la tristeza";

        String textoConvertido =texto.replace("a","e");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase para agregar al texto: ");
        String frase = scanner.nextLine();

        System.out.println(textoConvertido + " " + frase);



    }

}
