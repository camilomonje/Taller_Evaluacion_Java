package Taller.Ejercicio11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();

        System.out.println("La longitud de la frase es de: " + frase.length() + " caracteres.");
        int vocal_a = 0;
        int vocal_e = 0;
        int vocal_i = 0;
        int vocal_o = 0;
        int vocal_u = 0;

        for(int contador = 0; contador < frase.length(); contador++){

            switch (frase.charAt(contador)){
                case 'a':
                    vocal_a++;
                    break;
                case 'e':
                    vocal_e++;
                    break;
                case 'i':
                    vocal_i++;
                    break;
                case 'o':
                    vocal_o++;
                    break;
                case 'u':
                    vocal_u++;
                    break;

            }
        }

        System.out.println("Hay " + vocal_a + " a, en el texto.");
        System.out.println("Hay " + vocal_e + " e, en el texto.");
        System.out.println("Hay " + vocal_i + " i, en el texto.");
        System.out.println("Hay " + vocal_o + " o, en el texto.");
        System.out.println("Hay " + vocal_u + " u, en el texto.");

    }
}
