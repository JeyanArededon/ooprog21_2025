package Chapter_6;

import java.util.Scanner;
public class BankBalance
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        final double INTEREST_RATE = 0.03;
        int year = 0;

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        while (true) {
            System.out.println("Do you want to see next year's balance?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            int choice = input.nextInt();

            if (choice != 1) 
            {
                break;
            }

            year++;
            balance = balance * (1 + INTEREST_RATE);
            System.out.println("After year " + year + " at " + INTEREST_RATE + " interest rate, balance is $" + balance);
        }

        System.out.println("Operation complete.");
        input.close();
    }
}