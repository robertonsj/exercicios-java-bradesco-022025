package exercicios.manager;

public class Salesman extends Collaborator{
	private int salesQuant;
	public Salesman(String fullName, String email, String password) {
		super(fullName, email, password);
		setAdmin(false);
		// TODO Auto-generated constructor stub
	}
	
	public void setSalesQuant(int salesQuant) {
		this.salesQuant = salesQuant;
	}
	
	@Override
	public void logIn() {
		// TODO Auto-generated method stub
		System.out.println("Salesman logging in...");
	}

	@Override
	public void logOff() {
		// TODO Auto-generated method stub
		System.out.println("Salesman logging off...");
	}

	@Override
	public void changeData() {
		// TODO Auto-generated method stub
		System.out.println("Salesmane changing data...");
	}

	@Override
	public void changePassword() {
		// TODO Auto-generated method stub
		System.out.println("Salesmane has changed password.");
	}
	
	@Override
	public String toString() {
		return "Salesman " + this.toString()
			+ "\nSales Quantity= " + salesQuant;
	}
	
}
