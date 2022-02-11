package Taller.Ejercicio14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para iniciar el contador: ");
        String numero = scanner.nextLine();
        int nro = Integer.parseInt(numero);

        while(nro <= 1000){
            System.out.println(nro);
            nro += 2;
        }

    }
}
