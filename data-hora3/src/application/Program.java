package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2025-02-26");
		LocalDateTime d05 = LocalDateTime.parse("2025-02-26T21:20:26");
		Instant d06 = Instant.parse("2025-02-26T01:20:26Z");		
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println();
		System.out.println("d04 dia: " + d04.getDayOfMonth());
		System.out.println("d04 mês: " + d04.getMonthValue());
		System.out.println("d04 ano: " + d04.getYear());
		
		System.out.println();
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWekeLocalDate = d04.plusDays(7);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekInstant, d06);
		Duration t3 = Duration.between(d06, pastWeekInstant);
		
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWekeLocalDate = " + nextWekeLocalDate);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		System.out.println();
		
		System.out.println("T1 dias = " + t1.toDays());
		System.out.println("T2 dias = " + t2.toDays());
		System.out.println("T3 dias = " + t3.toDays());
		


	}

}
