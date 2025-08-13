import javax.swing.*;

public class example 
{
 public static void main (String[] args)
 {
   String price = JOptionPane.showInputDialog ("Enter the price");
   String product = JOptionPane.showInputDialog ("Enter Product Name");
   String message = "Price:" + price + "\nProduct:e" + product + "\nThank You So MUCH!";
   JOptionPane.showMessageDialog (null,message);
   }
   }