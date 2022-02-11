package Taller.Ejercicio16;

public class Persona {

    private final static char SEXO = 'H';

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;


    public Persona(){
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generaDNI();
    }

    public int calcularIMC(){
        double imc = this.peso / Math.pow(this.altura,2);
        int resultado = 0;

        if (imc < 20){
            resultado = -1;
        }else if (imc >= 20 && imc <= 25) {
            resultado =  0;
        }else if (imc > 25){
            resultado =  1;
        }
        return resultado;
    }

    public boolean esMayorDeEdad(){
        if(this.edad >= 18) return true;
        return false;
    }

    private void comprobarSexo(){
        if(this.sexo != 'H' && this.sexo != 'M'){
            this.sexo = SEXO;
        }

    }

    @Override
    public String toString() {
        return  "nombre=" + nombre +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura;

    }

    private void generaDNI(){
        int dni = (int) ((Math.random() * (99999999 - 10000000)) + 10000000);
        //generaLetraDNI(dni)
        this.DNI = String.valueOf(dni + generaLetraDNI(dni));
    }

    private char generaLetraDNI(int dni){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E'};
        int numeroLetra = dni % 23;

        return letras[numeroLetra];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        comprobarSexo();
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
