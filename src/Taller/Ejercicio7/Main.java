package Taller.Ejercicio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingrese el numero: ");
            String entrada = scanner.nextLine();
            numero = Integer.parseInt(entrada);
            if (numero >= 0){break;}

        }while (true);

        System.out.println("El numero ingresado es: " + numero);

    }
}
