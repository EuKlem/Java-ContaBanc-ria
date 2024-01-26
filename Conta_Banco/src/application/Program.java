package application;
import java.util.Scanner;
import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria cb = new ContaBancaria();
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		String nomeTitular = sc.next();
		System.out.print("Is there na initial deposit (y/n)?");
		char verificar = sc.next().charAt(0);
		if(verificar == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposito = sc.nextDouble();
			System.out.println();
			System.out.println("Account data: ");
			System.out.print("Account " + cb.numeroConta(numeroConta) + ", Holder: " + cb.nomeTitular(nomeTitular) + ", Balance: $ " + cb.deposito(deposito));
			System.out.println();
			System.out.println();
			System.out.print("Enter a deposit value: ");
			deposito = sc.nextDouble();
			System.out.println("Updated account data: ");
			System.out.print("Account " + cb.numeroConta(numeroConta) + ", Holder: " + cb.nomeTitular(nomeTitular) + ", Balance: $ " + cb.deposito(deposito));
			System.out.println();
			System.out.println();
			System.out.print("Enter a withdraw value: ");
			double saque = sc.nextDouble();
			System.out.println("Updated account data:");
			System.out.print("Account " + cb.numeroConta(numeroConta) + ", Holder: " + cb.nomeTitular(nomeTitular) + ", Balance: $ " + cb.saque(saque));
		}
		else {
			double deposito = 0;
			System.out.println();
			System.out.println("Account data: ");
			System.out.print("Account " + cb.numeroConta(numeroConta) + ", Holder: " + cb.nomeTitular(nomeTitular) + ", Balance: $ " + cb.deposito(deposito));
			System.out.println();
			System.out.println();
			System.out.print("Enter a deposit value: ");
			deposito = sc.nextDouble();
			System.out.println("Updated account data: ");
			System.out.print("Account " + cb.numeroConta(numeroConta) + ", Holder: " + cb.nomeTitular(nomeTitular) + ", Balance: $ " + cb.deposito(deposito));
			System.out.println();
			System.out.println();
			System.out.print("Enter a withdraw value: ");
			double saque = sc.nextDouble();
			System.out.println("Updated account data:");
			System.out.print("Account " + cb.numeroConta(numeroConta) + ", Holder: " + cb.nomeTitular(nomeTitular) + ", Balance: $ " + cb.saque(saque));
		}
		sc.close();
	}
}