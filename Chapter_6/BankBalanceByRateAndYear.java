package Chapter_6;

import java.util.Scanner;
public class BankBalanceByRateAndYear
{
	public static void main(String[] args) 
    {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter initial bank balance > ");
		double initialBalance = scanner.nextDouble();

		for (int rate = 2; rate <= 5; rate++) 
        {
			double interestRate = rate / 100.0;
			double balance = initialBalance;
			System.out.printf("\nWith an initial balance of $%.2f at an interest rate of %.2f\n", initialBalance, interestRate);
			for (int year = 1; year <= 4; year++) 
            {
				balance = balance + (balance * interestRate);
				System.out.printf("After year %d balance is %.4f\n", year, balance);
			}
			System.out.println();
		}
		scanner.close();
	}
}