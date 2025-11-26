package Chapter_7;

public class StringBuilderDemo {
    public static void main(String[] args) 
    {
        StringBuilder name = new StringBuilder("Barbara");
        StringBuilder address = new StringBuilder("6311 Hickory Nut Grove Road");

        System.out.println("(StringBuilder 1) nameString: " + name);
        System.out.println("Capacity of nameString is: " + name.capacity());
        System.out.println("(StringBuilder 2) addressString: " + address);
        System.out.println("Capacity of addressString is: " + address.capacity());
  
        name.setLength(20);    
        address.setLength(20);  
  
        String spacename = String.format("%-15s", "Barbara");
        System.out.println("(Length set to 20 for StringBuilder 1) The name is " + spacename + "end");
        System.out.println("(Length set to 20 for StringBuilder 2) The address is " + address);
    }
}
