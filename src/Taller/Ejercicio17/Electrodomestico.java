package Taller.Ejercicio17;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Electrodomestico {

    private final String COLOR              = "blanco";
    private final char   CONSUMO_ENERGETICO = 'F';
    private final double PRECIO_BASE        = 100; //100 Euros
    private final double PESO               = 5; // 5 Kg


    private double precioBase;
    private String color;
    private char   consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.precioBase = PRECIO_BASE;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.peso = PESO;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.color = COLOR;
    }

    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;

    }

    private void comprobarConsumoEnergetico(char letra) {
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char c : letras) {
            if (letra == c) {
                this.consumoEnergetico = letra;
                break;
            } else {
                this.consumoEnergetico = CONSUMO_ENERGETICO;
            }

        }
    }

    private void comprobarColor(String color) {
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String str : colores) {
            if (color.toLowerCase() == str) {
                this.color = color;
                break;
            } else {
                this.color = COLOR;
            }
        }
    }

    public double precioFinal() {

        double precioFinal = 0;

        switch (getConsumoEnergetico()) {
            case 'A':
                precioFinal = 100 + getPrecioBase();
                break;
            case 'B':
                precioFinal = 80 + getPrecioBase();
                break;
            case 'C':
                precioFinal = 60 + getPrecioBase();
                break;
            case 'D':
                precioFinal = 50 + getPrecioBase();
                break;
            case 'E':
                precioFinal = 30 + getPrecioBase();
                break;
            case 'F':
                precioFinal = 10 + getPrecioBase();
                break;
        }

        if (getPeso() <= 19) {
            precioFinal += 10;
        } else if (getPeso() <= 49) {
            precioFinal += 50;
        } else if (getPeso() <= 79) {
            precioFinal += 80;
        } else if (getPeso() >= 80) {
            precioFinal += 100;
        }

        return precioFinal;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
}
