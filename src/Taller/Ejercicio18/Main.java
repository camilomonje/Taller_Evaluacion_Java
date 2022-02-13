package Taller.Ejercicio18;

public class Main {

    public static void main(String[] args) {

        Serie series[] = new Serie[5];
        Videojuego videojuego[] = new Videojuego[5];

        series[0] = new Serie();
        series[1] = new Serie("La casa de Papel","Alex Pina");
        series[2] = new Serie("Oscuro deseo", "Leticia Lopez", 2, "Drama");
        series[3] = new Serie("Juego de Calamar", "Hwang", 1, "Drama");
        series[4] = new Serie("Soy Georgina", "Georgina", 1, "DocuReality");

        videojuego[0] = new Videojuego();
        videojuego[1] = new Videojuego("FIFA 22", 50);
        videojuego[2] = new Videojuego("Spider-Man", 26, "Accion", "Sony");
        videojuego[3] = new Videojuego("Fornite", 70, "Accion", "EpicGames");
        videojuego[4] = new Videojuego("GTA V", 30, "Accion-Aventura", "Rockstar");

        series[2].entregar();
        series[4].entregar();

        videojuego[1].entregar();
        videojuego[3].entregar();

        int numeroEntregadoSeries = 0;
        int numeroEntregadoVideojuegos = 0;

        for (Serie s : series){
            if(s.isEntregado()){
                numeroEntregadoSeries++;
            }
        }

        for(Videojuego v : videojuego){
            if(v.isEntregado()){
                numeroEntregadoVideojuegos++;
            }
        }

        System.out.println("Se han entregado " + numeroEntregadoSeries + " series.");
        System.out.println("Se han entregado " + numeroEntregadoVideojuegos + " videojuegos.");

        Serie serieMayor = series[0];

        for (int i = 1; i < series.length; i ++){
            if(series[i].compareTo(serieMayor) == 1){
                serieMayor = series[i];
            }
        }

        Videojuego videojuegoMayor = videojuego[0];

        for (int i = 1; i < videojuego.length; i ++){
            if(videojuego[i].compareTo(videojuegoMayor) == 1){
                videojuegoMayor = videojuego[i];
            }
        }

        System.out.println(serieMayor);

        System.out.println(videojuegoMayor);




    }



}
