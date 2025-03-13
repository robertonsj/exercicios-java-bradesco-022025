package exercicios.manager;

public class Attendant extends Collaborator {

	public Attendant(String fullName, String email, String password) {
		super(fullName, email, password);
		setAdmin(false);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void logIn() {
		// TODO Auto-generated method stub
		System.out.println("Attendant logging in...");
	}

	@Override
	public void logOff() {
		// TODO Auto-generated method stub
		System.out.println("Attendant logging off...");
	}

	@Override
	public void changeData() {
		// TODO Auto-generated method stub
		System.out.println("Attendant changing data...");
	}

	@Override
	public void changePassword() {
		// TODO Auto-generated method stub
		System.out.println("Attendant has changed password.");
	}

	@Override
	public String toString() {
		return "Attendant []" + this.toString();
	}
	
	

}
