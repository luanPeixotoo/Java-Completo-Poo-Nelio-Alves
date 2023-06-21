import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Programa4 {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        //diminuir dias, meses, anos... da data local
        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        //diminuir dias, meses, anos, horas, segundos, ... da data local
        LocalDateTime pastWeekLocalDateTimeTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTimeTime = d02.minusDays(7).minusHours(5);

        System.out.println("pastWeekLocalDateTimeTime = " + pastWeekLocalDateTimeTime);
        System.out.println("nextWeekLocalDateTimeTime = " + nextWeekLocalDateTimeTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        //calcular duração
        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atTime(0, 0));
        System.out.println("T1 dias = " + t1.toDays());

        // outra forma de converter o local date *** asStartOfDay -> converte pra hora 0 e minuto 0 do dia;
        Duration te = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        System.out.println("Te dias = " + te.toDays());

        Duration t2 = Duration.between(pastWeekLocalDateTimeTime, d02);
        System.out.println("T2 dias = " + t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, d03);
        System.out.println("T3 dias = " + t3.toDays());

        Date x1 = new Date();
        System.out.println(x1);

        Date x2 = new Date(0L);
        System.out.println(x2);

    }
}
