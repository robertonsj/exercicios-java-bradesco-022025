package exercicios.manager;

import java.util.HashMap;
import java.util.Map;

public class Manager extends Collaborator implements SystemOperations {
	
	protected Map<Integer, String> sales;
	
	public Manager(String fullName, String email, String password) {
		super(fullName, email, password);
		setAdmin(true);
		this.sales = new HashMap<Integer, String>();
		// TODO Auto-generated constructor stub
	}
	
	public void generateFinancialReport() {
		System.out.println("Generating financial report...");
	}
	
	public void searchSales() {
		System.out.println("Sales:");
		sales.forEach(
				(id, sale) -> System.out.println("Id - " + id + "| Sale - " + sale));
	}
	
	@Override
	public void logIn() {
		// TODO Auto-generated method stub
		System.out.println("Manager logging in...");
	}

	@Override
	public void logOff() {
		// TODO Auto-generated method stub
		System.out.println("Manager logging off...");
	}

	@Override
	public void changeData() {
		// TODO Auto-generated method stub
		System.out.println("Manager changing data...");
	}

	@Override
	public void changePassword() {
		// TODO Auto-generated method stub
		System.out.println("Manager has changed password.");
	}
	
	@Override
	public String toString() {
		return "Manager " + super.toString();
	}

	
}
