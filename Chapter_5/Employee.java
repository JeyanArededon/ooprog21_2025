package Chapter_5;

public class Employee 
{
 private int employeeNumber;
 private double payRate;
 private static final int MAX_EMPLOYEE_NUMBER = 9999; 
 private static final double MAX_PAY_RATE = 60.00;
 private static final double OVERTIME_MULTIPLIER = 1.5; 

  public Employee (int employeeNumber, double payRate) 
    {
      this.employeeNumber = employeeNumber;
      this.payRate = payRate;
    }
    
  public double getPayRate() 
    {
        return payRate;
    }
   
  public double calculateRegularPay(int hoursWorked) 
    {
        int regularHours = Math.min(40, hoursWorked); 
        return regularHours * this.payRate;
    }
    
 public double calculateOvertimePay(int hoursWorked)
     {
        int overtimeHours = Math.max(0, hoursWorked - 40); 
        return overtimeHours * this.payRate * OVERTIME_MULTIPLIER;
    }
    
}