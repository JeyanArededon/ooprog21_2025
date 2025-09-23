package Chapter_4;

public class DebugCircle 
{    
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

    public DebugCircle (int r) 
    {
        radius = r;
        diameter = 2 * r;       
        area = PI * r * r;        
    }
    public int getRadius()
    {
        return radius;  
        //typo 'radiuss'
    }
    public int getDiameter() 
    {
        return diameter; 
        //the return type was void and changed to int        
    }
    public double getArea() 
    {
        return area;
    }
    public static void main(String[] args) 
    {
        DebugCircle circle = new DebugCircle(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area: " + circle.getArea());
    }
}
