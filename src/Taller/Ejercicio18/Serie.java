package Taller.Ejercicio18;

public class Serie implements Entregable{

    private final int NUMEROTEMPORADAS = 3 ;
    private final boolean ENTREGADO = false;

    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this.titulo = "";
        this.numeroTemporadas = NUMEROTEMPORADAS;
        this.entregado = ENTREGADO;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = NUMEROTEMPORADAS;
        this.entregado = ENTREGADO;
        this.genero = "";
    }

    public Serie(String titulo, String creador, int numeroTemporadas, String genero) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = ENTREGADO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
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

        Serie serie = (Serie) a;

        if (numeroTemporadas > serie.getNumeroTemporadas()){
            estado = 1;
        }else if (numeroTemporadas == serie.getNumeroTemporadas()){
            estado = 0;
        }
        return estado;
    }
}
