package Taller.Ejercicio6;

public class Main {

    public static void main(String[] args) {

        int numeroFinal = 100;

        for(int i = 1; i <= numeroFinal; i++){
            if (i % 2 == 0){
                System.out.println(i + " => Numero Par");
            }else{
                System.out.println(i + " => Numero Impar");
            }
        }
    }
}
