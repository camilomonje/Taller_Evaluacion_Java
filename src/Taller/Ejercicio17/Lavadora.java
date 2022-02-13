package Taller.Ejercicio17;

public class Lavadora extends Electrodomestico{

    private final double CARGA = 5; //5 Kg

    private double carga;

    public Lavadora(){
        super();
        this.carga = CARGA;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA;
    }

    public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precioFinal =  super.precioFinal();

        if(getCarga() > 30){
            precioFinal += 50;
        }
        return precioFinal;
    }
}
