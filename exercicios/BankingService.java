package exercicios;
import java.util.Scanner;

public class BankingService {
	private Account account;
	private int numberOfAccounts = 0;
	
	public BankingService(double amount) {
		this.account = new Account(numberOfAccounts++, amount);
	}
	
	public int menu(Scanner scan) {
		System.out.println("\n1 - Consultar saldo"
				+ "\n2 - Consultar Cheque Especial"
				+ "\n3 - Depositar"
				+ "\n4 - Sacar"
				+ "\n5 - Pagar Boleto"
				+ "\n6 - Verificar se a conta usa cheque especial"
				+ "\nChoose one Option: ");
		int choose = scan.nextInt();
		return choose;
		
	}
	
	public void depositAmount(Scanner scan) {
		double amount = scan.nextDouble();
		if (amount > 0) {
            account.setSaldo(account.getSaldo() + amount);
            System.out.printf("R$ %.2f deposited successfuly. ", account.getSaldo());
        } else {
            System.out.println("Invalid deposit amount!");
        }
	}
	
	public void withdrawAmount(Scanner scan) {
		double amount = scan.nextDouble();
		
		// Make sure whether there is balance
		if(account.getSaldo() + account.getChequeEspecial() >= amount) {
			
			//Make sure whether the amount is positive
			if(amount <= 0) {
				System.out.println("Enter a positive amount to withdraw");
				
			} else if (account.getSaldo() >= amount) {
				account.setSaldo(account.getSaldo() - amount);
				System.out.println("Withdraw successfuly done! Balance R$"
						+ account.getSaldo());				
			} else {
				//Overdraft left over
				double remainingOverdraft = (account.getSaldo() + account.getChequeEspecial() - amount) ;
				account.setFeeOfOverdraftUsage((account.getChequeEspecial() - remainingOverdraft) * 0.2);
				account.setChequeEspecial(remainingOverdraft);
				account.setSaldo(0);
			}
			
		} else {
			System.out.println("You have no money for this operation!");
		}
       
    }
	

	public Account getAccount() {
		return account;
	}
	
	
}

class Account {
	private double saldo = 0;
	private double chequeEspecial;
	private int numeroDaConta = 0;
	private double feeOfOverdraftUsage = 0;
	
	Account(int numeroDaConta, double amount){
		this.numeroDaConta = numeroDaConta;
		this.saldo = amount;
		
		if(amount <= 500) {
			this.chequeEspecial = amount * 0.1;
		} else {
			this.chequeEspecial = amount * 0.5;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public void setFeeOfOverdraftUsage(double feeOfOverdraftUsage) {
		this.feeOfOverdraftUsage = feeOfOverdraftUsage;
	}
	
	// There will be fee of 20% on the used overdraft 
		public void isThereFee() {
			if(feeOfOverdraftUsage > 0) {
				if(this.saldo < feeOfOverdraftUsage) {
					System.out.println("Make a deposit to pay the fee!");
				} else {
					this.saldo -= feeOfOverdraftUsage;
					System.out.println("The fee has been charged successful");
					feeOfOverdraftUsage = 0;
				}
			}
		}
	
	
	
}
