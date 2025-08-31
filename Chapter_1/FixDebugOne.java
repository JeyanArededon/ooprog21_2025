public class FixDebugOne 
{
 
     public static void main (String [] args) 
     {
      
        System.out.println ("Hello World");
     }
}

/*
 Spotted bugs below:
 1. The class name has space in it,you put 'FixDebug One' instead of 'FixDebugOne'.
 2. Method name 'Main' should be in lowercase 'main'.
 3. Method parameter, you put 'String[] args' instead of "String args".
 4. Misspelled 'System','Systm.out.print' should be 'System.out.println'.
 5. Missing semicolon ,System.out.println("Hello World!") needs a semicolon at the end ;.
 6. Missing closing curly brace '}' for the class.
  */