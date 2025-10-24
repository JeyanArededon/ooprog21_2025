package Chapter_6;

import java.util.Scanner;
public class DebugSix1
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of days >> ");
        int days = keyboard.nextInt();

        if (days < 1) {
            System.out.println("Number of days must be at least 1.");
            keyboard.close();
            return;
        }

        double money = 0.01;
        for (int day = 1; day <= days; day++) {
            System.out.printf("After day %d you have $%.2f%n", day, money);
            money *= 2;
        }
        keyboard.close();
    }
}