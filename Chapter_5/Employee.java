package Chapter_5;

public class Employee 
{
    private int employeeNumber;
    private double payRate;
    public Employee(int employeeNumber, double payRate) 
    {
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public int getEmployeeNumber() 
    {
        return employeeNumber;
    }
    public double getPayRate() 
    {
        return payRate;
    }
    public double calculateRegularPay(int hoursWorked) 
    {
        int regularHours = Math.min(40, hoursWorked);
        return regularHours * payRate;
    }
    public double calculateOvertimePay(int hoursWorked) 
    {
        int overtimeHours = Math.max(0, hoursWorked - 40);
        return overtimeHours * payRate * 1.5;
    }
    public double calculateTotalPay(int hoursWorked) 
    {
        return calculateRegularPay(hoursWorked) + calculateOvertimePay(hoursWorked);
    }

    public String formatPayStatement(int hoursWorked) 
    {
        double regular = calculateRegularPay(hoursWorked);
        double overtime = calculateOvertimePay(hoursWorked);
        double total = regular + overtime;
        return String.format("Employee %d: Regular=%.1f Overtime=%.1f Total=%.1f",
                employeeNumber, regular, overtime, total);
    }
}