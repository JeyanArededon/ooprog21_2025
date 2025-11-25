package Chapter_7;

import java.util.Scanner;
public class CompareStrings 
{
    public static void main(String[] args) 
    {
        Scanner compare = new Scanner(System.in);
        System.out.print("Enter your name > ");
        String input = compare.nextLine();

        if ("Carmen".equals(input)) {
            System.out.println("Carmen equals " + input);
        } else {
            System.out.println("Carmen does not equal " + input);
        }
        compare.close();
    }
}

