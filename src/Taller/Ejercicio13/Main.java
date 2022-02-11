package Taller.Ejercicio13;


//Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date fechaYHora = new Date(Calendar.getInstance().getTimeInMillis());
        SimpleDateFormat formateador = new SimpleDateFormat("(yyyy/MM/dd) (HH:mm:ss)");
        String fechaTexto = formateador.format(fechaYHora);
        System.out.println(fechaTexto);

    }
}
