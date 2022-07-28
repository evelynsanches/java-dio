package classes;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class ExemplosData {

    public static void main(String[] args) {

        Date agora = new Date();
        Date dataFormatada = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
        String dataFormatada1 = formatter.format(agora);

        SimpleDateFormat formmatter2 = new SimpleDateFormat("HH:MM:SS:MMM");
        String dataFormatada2 = formmatter2.format(dataFormatada);

        System.out.println(dataFormatada1);
        System.out.println(dataFormatada2);


        LocalDateTime hoje = LocalDateTime.of(2010, 05,10, 10,00,00);
        System.out.println(hoje);

        LocalDateTime futuro = hoje.plusHours(13).plusMonths(6).plusYears(4);
        System.out.println(futuro);
    }
}
