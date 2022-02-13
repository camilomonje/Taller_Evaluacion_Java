package Taller.Ejercicio17;

public class Main {

    public static void main(String[] args) {

        Electrodomestico[] electrodomestico = new Electrodomestico[10];

        electrodomestico[0] = new Electrodomestico();
        electrodomestico[1] = new Lavadora();
        electrodomestico[2] = new Television();
        electrodomestico[3] = new Electrodomestico(200, 15);
        electrodomestico[4] = new Lavadora(150, 40);
        electrodomestico[5] = new Television(300, 20);
        electrodomestico[6] = new Electrodomestico(160, 25, "negro", 'C');
        electrodomestico[7] = new Lavadora(260, 45, "gris", 'D', 25);
        electrodomestico[8] = new Television(700, 50, "blanco", 'E', 55, true);
        electrodomestico[9] = new Electrodomestico(350, 36);

        double sumaElectrodomesticos = 0;
        double sumaLavadoras = 0;
        double sumaTelevisiones = 0;

        for (int i = 0; i < electrodomestico.length; i++) {
            
            if (electrodomestico[i] instanceof Electrodomestico) {
                sumaElectrodomesticos += electrodomestico[i].precioFinal();
            }
            if (electrodomestico[i] instanceof Lavadora) {
                sumaLavadoras += electrodomestico[i].precioFinal();
            }
            if (electrodomestico[i] instanceof Television) {
                sumaTelevisiones += electrodomestico[i].precioFinal();
            }

        }

        System.out.println("Precio de todos los Televisores: " + sumaTelevisiones);
        System.out.println("Precio de todos las Lavadoras: " + sumaLavadoras);
        System.out.println("Precio de todos los electrodomesticos: " + sumaElectrodomesticos);

    }
}
