package Taller.Ejercicio4;

import java.util.Scanner;

public class Main {

    public static void calcularPrecio(String precio){
        final double IVA = 0.21;
        double precioBruto = Double.parseDouble(precio);
        double precioNeto = precioBruto *(1 + IVA);
        System.out.println("El precio del producto con IVA es: " + precioNeto);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        String precio = scanner.nextLine();

        calcularPrecio(precio);
    }
}
