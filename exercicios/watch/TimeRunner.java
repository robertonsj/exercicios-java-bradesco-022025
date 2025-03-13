package exercicios.watch;

public class TimeRunner {
	
	public static void main(String[] args) {
		
		BrazilianTimeFormat brazilianTime = new BrazilianTimeFormat(18, 30, 15);
		AmericanTimeFormat americanTime = new AmericanTimeFormat(14, 45, 30);
		AmericanTimeFormat americanTime2 = new AmericanTimeFormat(9, 15, 10);
		
		System.out.println(brazilianTime.getFormattedLocalTime());
		System.out.println(americanTime.getFormattedLocalTime());
		System.out.println(americanTime2.getFormattedLocalTime());
	}
	
}
