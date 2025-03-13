package exercicios.watch;

public class BrazilianTimeFormat extends TimeWithAPI {

	public BrazilianTimeFormat(int horas, int minutos, int segundos) {
		super(horas, minutos, segundos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getFormattedLocalTime() {
		// TODO Auto-generated method stub
		return "Brazilian Local Time:\n" + getFormattedTime();
		
	}

}
