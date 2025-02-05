package exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

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
	
	public void depositAmount(Scanner scan) {
		double amount = scan.nextDouble();
		if (amount > 0) {
            account.setSaldo(account.getSaldo() + amount);
            System.out.println("Amount deposited successfuly. "
            		+ "\nNew balance: R$" + account.getSaldo());
        } else {
            System.out.println("Invalid deposit amount!");
        }
	}

	public Account getAccount() {
		return account;
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

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	
}
