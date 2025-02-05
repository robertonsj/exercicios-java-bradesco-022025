package exercicios;

import java.util.Scanner;

public class BankingService {
	private Account account;
	
	public BankingService(String numeroDaConta, double amount) {
		this.account = new Account(numeroDaConta, amount);
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
}

class Account {
	private double saldo = 0;
	private double chequeEspecial;
	private String numeroDaConta;
	
	Account(String numero, double quantia){
		this.numeroDaConta = numero;
		this.chequeEspecial = quantia;
	}
}
