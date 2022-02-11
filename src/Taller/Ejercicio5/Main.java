package Taller.Ejercicio5;

public class Main {

    public static void main(String[] args) {

        int numeroFin = 100;
        int i = 1;

        while (i <= numeroFin){
            if (i % 2 == 0){
                System.out.println(i + " => Numero Par");
            }else{
                System.out.println(i + " => Numero Impar");
            }

            i++;
        }




    }
}
