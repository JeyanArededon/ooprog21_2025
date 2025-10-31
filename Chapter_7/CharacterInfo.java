package Chapter_7;

public class CharacterInfo 
{
    public static void main(String[] args) 
    {
        char x = 'C';
        System.out.println("The character is " + x);
        
        if(Character.isUpperCase(x))
            System.out.println(x + " is uppercase");
        else
            System.out.println(x + " is not uppercase");
            
        if(Character.isLowerCase(x))
            System.out.println(x + " is not lowercase");
        else
            System.out.println(x + " is not lowercase");
            
        System.out.println("After toLowerCase(), aChar is " + Character.toLowerCase(x));
        System.out.println("After toUpperCase(), aChar is " + Character.toUpperCase(x));
        
        if(Character.isLetterOrDigit(x))
            System.out.println(x + " is a letter or digit");
        else
            System.out.println(x + " is not a letter or digit");
            
        if(Character.isWhitespace(x))
            System.out.println(x + " is whitespace");
        else
            System.out.println(x + " is not whitespace");
    }
}