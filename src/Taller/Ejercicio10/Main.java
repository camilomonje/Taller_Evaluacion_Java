package Taller.Ejercicio10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();

        String textoConvertido =frase.replace(" ","");

        System.out.println(textoConvertido);
    }
}
