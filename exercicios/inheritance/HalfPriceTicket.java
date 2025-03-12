package exercicios.inheritance;

public final class HalfPriceTicket extends Ticket {

	public HalfPriceTicket(String movieTitle, double price, boolean isDubbed) {
		super(movieTitle, price, isDubbed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double realValue() {
		// TODO Auto-generated method stub
		return getPrice() / 2.0;
	}
	
	
}
