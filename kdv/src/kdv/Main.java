package kdv;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double amount;
		double rateOfVat;
		double vatAmount;
		double amountWithVat;
		boolean vatStatus;
		Scanner scan = new Scanner(System.in);

		System.out.print("Please type an amount: ");
		amount = scan.nextDouble();
		int minLimit = 0;
		int maxLimit = 1000;
		double vatForLowAmount = 0.18;
		double vatForHighAmount = 0.08;

		vatStatus = (minLimit < amount) && (amount < maxLimit);
		rateOfVat = vatStatus ? vatForLowAmount : vatForHighAmount;

		System.out.println("Your amount will be calculated with a vat rate of " + rateOfVat);
		vatAmount = amount * rateOfVat;
		amountWithVat = vatAmount + amount;

		System.out.println(" Witout vat      : " + amount);
		System.out.println(" Rate of vat     : " + rateOfVat);
		System.out.println(" Amount of vat   : " + vatAmount);
		System.out.println(" Amount with vat : " + amountWithVat);
	}
}
