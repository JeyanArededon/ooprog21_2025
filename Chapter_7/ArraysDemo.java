package Chapter_7;

import java.util.Arrays;
public class ArraysDemo 
{
    public static void display(String message, int array[]) 
    {
        System.out.println(message);
        for (int value : array)
        {
            System.out.print(" "+ value);
        }
        System.out.println("\n");
    }
    public static void main(String[] args) 
    {        
        int[] num = {10,20,30,40,50};
        display("Original array:", num);
  
        Arrays.fill(num, 8);
        display("After filling with value 8:", num);

        num[2] = 2;   
        num[4] = 5;
        display("After changing two values:", num);

        Arrays.sort(num);
        display("After Sorting:", num);
    }
}
