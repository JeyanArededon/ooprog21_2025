package Chapter_5;
 
import java.util.*;

public class DebugFive1
 {
    public static void main(String[] a)
     {
        Scanner kb = new Scanner(System.in);
        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;
        int usersChoice;
        double bill = 0.0; 

        System.out.println("Order please 1 - Burger 2 - Hotdog");
        System.out.print("3 - Grilled cheese 4 - Fish sandwich >> ");
        
        usersChoice = kb.nextInt();
        if (usersChoice == 1 || usersChoice == 2)
            bill += HIGH_PRICE;
        else
            bill += MED_PRICE;
        System.out.print("Fries with that? 1 - Yes 2 - No >> ");
        usersChoice = kb.nextInt();
        if (usersChoice == 1)
            bill += LOW_PRICE;
        System.out.println("Total bill is $" + bill);
    }
}