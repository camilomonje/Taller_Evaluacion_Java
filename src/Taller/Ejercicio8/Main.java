package Taller.Ejercicio8;

import java.util.Scanner;

public class Main {

    public static void diaSemana(String dia){
        boolean diaLaboral = true;
        switch (dia){
            case "lunes" :
                diaLaboral = true;
                break;

            case "martes" :
                diaLaboral = true;
                break;

            case "miercoles" :
                diaLaboral = true;
                break;

            case "jueves" :
                diaLaboral = true;
                break;

            case "viernes" :
                diaLaboral = true;
                break;

            case "sabado" :
                diaLaboral = false;
                break;

            case "domingo" :
                diaLaboral = false;
                break;
        }

        if(diaLaboral){
            System.out.println(dia +" es un dia laboral para SOFKA");
        }else{
            System.out.println(dia + " No es un dia laboral para SOFKA");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el dia a consultar: ");
        String dia = scanner.nextLine();
        diaSemana(dia);


    }
}
