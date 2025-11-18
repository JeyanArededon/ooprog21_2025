package Chapter_7;


import java.util.Scanner;
public class Average 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Count Elements Greater Than Previous Average\n");
        System.out.print("How many response times will you enter? ");

        int n = scanner.nextInt();
        int[] responseTimes = new int[n];
        System.out.print("Enter " + n + " response times : ");
        for (int i = 0; i < n; i++)
        {
            responseTimes[i] = scanner.nextInt();
        }

        System.out.println("\nInput\n");
        System.out.print("responseTimes = [");
        for (int i = 0; i < n; i++) {
            System.out.print(responseTimes[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]\n");

        int count = 0;
        int sum = responseTimes[0];

        for (int i = 1; i < n; i++) {
            double avg = (double) sum / i;
            if (responseTimes[i] > avg) 
            {
                count++;
            }
            sum += responseTimes[i];
        }

        System.out.println("Output\n");
        System.out.println(count + "\n");

        System.out.println("Explanation\n");
        sum = responseTimes[0];
        
        for (int i = 0; i < n; i++) {
            if (i == 0) 
            {
                System.out.println("- Day 0: " + responseTimes[i] + " (no previous days, skip)");
            } else 
            {
                double avg = (double) sum / i;
                System.out.print("- Day " + i + ": " + responseTimes[i]);
                if (responseTimes[i] > avg) 
                {
                    System.out.print(" > ");
                } else {
                    System.out.print(" vs ");
                }
                System.out.print("average(");
                for (int j = 0; j < i; j++)
                {
                    System.out.print(responseTimes[j]);
                    if (j < i - 1) System.out.print(", ");
                }
                System.out.printf(") = %.0f", avg);
                if (responseTimes[i] > avg) 
                {
                    System.out.println(" -> count = " + count);
                } else 
                {
                    System.out.println(" -> not greater -> count");
                }
                sum += responseTimes[i];
            }
        }
        scanner.close();
    }
}

