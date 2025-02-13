package exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		BankingService bank = new BankingService(500);
		
		while(true) {
			
			
			int operation = bank.menu(scan);
			
			switch(operation) {
			case 1: //Visualizar saldo
				System.out.println("Saldo atual: R$" + 
						bank.getAccount().getSaldo());
				break;
				
			case 2:
				System.out.println("Check Overdraft: R$"
						+ bank.getAccount().getChequeEspecial());
				break;
				
			case 3:
				System.out.println("Enter the amount to deposit: ");
				bank.depositAmount(scan);
				break;
				
			case 4: //
				System.out.println("Enter the amount for withdraw:");
				bank.withdrawAmount(scan);
				break;
			case 5:
				System.out.println("Pagar Boleto:");
				break;
			case 6:
				System.out.println("Verificar se a conta está usando cheque especial.");
				break;
			
			case 0:
				System.out.println("Obrigado por Usar nossos Serviços");
				break;
			default:
				System.out.println("Opção Inválida!");
			}
			
			bank.getAccount().isThereFee();
			
		}

	}

}
