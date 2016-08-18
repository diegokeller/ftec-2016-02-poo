package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemplosData {

	public static void main(String[] args) {
		
		// Data de hoje
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		// Aumentar 35 dias
		LocalDate mesQueVem = hoje.plusDays(35);
		System.out.println(mesQueVem);
		
		// Hora atual 
		LocalDateTime agora = LocalDateTime.now();
		Integer hora = agora.getHour();
		System.out.println(hora);
		LocalDateTime ontem = agora.minusHours(24);
		System.out.println(
				ontem.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

	}

}
