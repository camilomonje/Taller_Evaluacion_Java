package Taller.Ejercicio17;

public class Television extends Electrodomestico{

    private final double RESOLUCION = 20;
    private final boolean SINTONIZADOR_TDT = false;

    private double resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = SINTONIZADOR_TDT;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = SINTONIZADOR_TDT;
    }

    public Television(double precioBase, double peso, String color, char consumoEnergetico, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (getResolucion() > 40)
            precioFinal = precioFinal * 1.3;

        if (isSintonizadorTDT())
            precioFinal += 50;

        return precioFinal;

    }
}
