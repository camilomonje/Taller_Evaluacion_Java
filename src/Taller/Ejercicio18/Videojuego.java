package Taller.Ejercicio18;

public class Videojuego implements Entregable{

    private final int HORAS_ESTIMADAS = 10;
    private final boolean ENTREGADO = false;

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String company;

    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = HORAS_ESTIMADAS;
        this.entregado = ENTREGADO;
        this.genero = "";
        this.company = "";
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = ENTREGADO;
        this.genero = "";
        this.company = "";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String company) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.company = company;
        this.entregado = ENTREGADO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        int estado = -1;

        Videojuego videojuego = (Videojuego) a;
        if (horasEstimadas > videojuego.getHorasEstimadas()){
            estado = 1;
        } else if (horasEstimadas == videojuego.getHorasEstimadas()){
            estado = 0;
        }

        return estado;
    }
}
