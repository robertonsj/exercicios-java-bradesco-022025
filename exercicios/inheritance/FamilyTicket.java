package exercicios.inheritance;

public final class FamilyTicket extends Ticket{

	private int numOfPeople; //Number of family members
	
	
	public FamilyTicket(String movieTitle, 
			double price, boolean isDubbed, int numOfPeople) {
		super(movieTitle, price, isDubbed);
		this.numOfPeople = numOfPeople;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double realValue() {
		// TODO Auto-generated method stub
		double totalValue = getPrice() * numOfPeople;
		return numOfPeople > 3 ? totalValue *= 0.95 : totalValue;
	}
	
	
	
}
