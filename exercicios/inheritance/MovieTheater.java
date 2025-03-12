package exercicios.inheritance;

public class MovieTheater {
	public static void main(String[] args) {
		
		Ticket halfPrice = new HalfPriceTicket("Oppenheimer", 30.0,  false);
		Ticket familyPriceNoDiscount = new FamilyTicket("Avatar 2", 40.0,  true, 3);
		Ticket familyPriceWithDiscount = new FamilyTicket("Duna 2", 50.0,  true, 5);
		
		System.out.println(halfPrice);
		System.out.println(familyPriceNoDiscount);
		System.out.println(familyPriceWithDiscount);
	}
}
