package atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'Rs.'###,##0.00");
	
//	Set the customer number
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
//	get the customer number
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
//	set the pin number
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
//	get the pin number
	
	public int getPinNumber() {
		return pinNumber;
	}

//	get checking account balance
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
//	get saving account balance
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
//	calculate checking account withdrawal
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
//	calc saving account withdrawal
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
//	calculate checking account deposit
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
// 	calc saving account withdrawal
	
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
//	customer checking account withdraw inputs
	
	public void getCheckingWithdrawInput() {
		System.out.println("Current Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount You want to withdraw from Current Account: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Current Account Balance: " + moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Insufficient Balance in Account to Withdraw." + "\n");
		}
	}
	
//	customer saving account withdraw inputs
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount You want to withdraw from Saving Account: ");
		double amount = input.nextDouble();
		
		if ((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance: " + savingBalance + "\n");
		}else {
			System.out.println("Insufficient Balance in Account to Withdraw." + "\n");
		}
	}
	
//	customer checking account deposit inputs
	
	public void getCheckingDepositInput() {
		System.out.println("Current Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount You want to Deposit in Current Account: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Current Account Balance: " + moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Insufficient Balance in Account to Deposit." + "\n");
		}
	}
	
//	customer saving account deposit inputs
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount You want to Deposit in Saving Account: ");
		double amount = input.nextDouble();
		
		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
		}else {
			System.out.println("Insufficient Balance in Account to Deposit." + "\n");
		}
	}
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
}
