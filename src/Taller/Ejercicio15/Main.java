package Taller.Ejercicio15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        do {
            System.out.println("****** GESTION CINEMATOGRÁFICA ********"
            + "\n1-NUEVO ACTOR"
            + "\n2-BUSCAR ACTOR"
            + "\n3-ELIMINAR ACTOR"
            + "\n4-MODIFICAR ACTOR"
            + "\n5-VER TODOS LOS ACTORES"
            + "\n6- VER PELICULAS DE LOS ACTORES"
            + "\n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES"
            + "\n8-SALIR");
            System.out.println("\nDigite una opción: ");

            Scanner scanner = new Scanner(System.in);
            String opcion = scanner.nextLine();
            int opc = Integer.parseInt(opcion);

            if (opc == 8){
                break;
            }else if (opc == 1 || opc == 2 || opc == 3 || opc == 4 || opc == 5 || opc == 6 || opc == 7){
                continue;
            }else{
                System.out.println("Opcion Incorrecta\n");
            }


        }while (true);
    }
}
