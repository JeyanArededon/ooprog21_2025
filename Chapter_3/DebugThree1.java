package Chapter_3;

import java.util.Scanner;

public class DebugThree1 {
     public static void main(String args[])
   {
      double check1;
      double check2;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the amount of your check >> ");
      check1 = input.nextDouble(); 
      // changed from nextInt() to nextDouble()
      System.out.print("Enter the amount of your friend's check >> ");
      check2 = input.nextDouble(); 
      // fixed typo: inputnextInt() → input.nextDouble()
      calcTip(check1); 
      calcTip(check2); 
      
   }

   public static void calcTip(double bill) 
   // add parameter 'bill'
   {
      final double RATE = 0.15; 
      // fixed typo: 'doubel' → 'double'
      double tip;
      tip = bill * RATE;
       // change from bill / RATE to bill * RATE
      System.out.println("The tip should be at least $" + tip);
   }


    
}
