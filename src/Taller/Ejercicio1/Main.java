package Taller.Ejercicio1;

public class Main {

    public static void comparar(int a, int b){
       if (a > b){
           System.out.println(a + " es mayor que " + b);
       }else if(a < b){
           System.out.println(b + " es mayor que " + a);
       }else if(a == b){
           System.out.println(a + " es igual a " + b);
       }
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        comparar(a,b);


    }



}
