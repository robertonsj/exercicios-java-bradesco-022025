package exercicios.watch;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class TimeWithAPI {
	
	protected LocalTime hora;
	
	 public TimeWithAPI(int horas, int minutos, int segundos) {
	        this.hora = LocalTime.of(horas, minutos, segundos);
	    }
	 
	 public String getFormattedTime() {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		 return hora.format(formatter);
	 }
	 
	 public abstract String getFormattedLocalTime();
	 
}
