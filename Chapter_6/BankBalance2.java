package Chapter_6;

import java.util.Scanner;
public class BankBalance2
 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        final double INTEREST_RATE = 0.03;
        int year = 1;
        System.out.print("Enter initial balance: $");
        double balance = scanner.nextDouble();

        int choice;
        do {
            balance += balance * INTEREST_RATE;
            System.out.printf("After year %d at %.2f interest rate, balance is $%.2f\n", year, INTEREST_RATE, balance);
            year++;
            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes\n or any other number for no >> ");
            choice = scanner.nextInt();
        } while (choice == 1);

        scanner.close();
    }
}