package exercicios.inheritance;

public abstract class Ticket {
	private String movieTitle;
	private double price;
	private boolean isDubbed; //The movie is dubbed or subtitled
	
	
	public Ticket(String movieTitle, double price, boolean isDubbed) {
		super();
		this.movieTitle = movieTitle;
		this.price = price;
		this.isDubbed = isDubbed;
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isDubbed() {
		return isDubbed;
	}
	public void setDubbed(boolean isDubbed) {
		this.isDubbed = isDubbed;
	}
	
	public abstract double realValue();
	
	@Override
	public String toString() {
		return "Ticket [Movie= " + movieTitle + "| Price= " + price + "| Language= " 
				+ (isDubbed ? "Dubbled" : "Subtitled") + "]\n"
				+ "Real Value: " + realValue();
	}
	
}
