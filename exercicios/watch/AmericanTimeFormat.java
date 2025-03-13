package exercicios.watch;

import java.time.format.DateTimeFormatter;

public class AmericanTimeFormat extends TimeWithAPI{

	public AmericanTimeFormat(int horas, int minutos, int segundos) {
		// TODO Auto-generated constructor stub
		super(horas % 12 == 0 ? 12 : horas % 12, minutos, segundos); // Converte 13-23 para 1-11, mantém 12
	}
	
	@Override
    public String getFormattedTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return hora.format(formatter);
    }

	@Override
	public String getFormattedLocalTime() {
		// TODO Auto-generated method stub
		return "American local formatted time:\n" + getFormattedTime(); 
		
	}

}
