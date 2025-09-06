package Chapter_2;

import javax.swing.JOptionPane;
   
   public class UsingJOptionPaneDialogs 
     {
         public static void main(String[] args) 
         {
            String name;
            int confirm;
            do {
                 name = JOptionPane.showInputDialog(null, "What is your name?");
                 confirm = JOptionPane.showConfirmDialog(null,"Do you want to proceed using this name ?" + name );                
               } while (confirm != JOptionPane.YES_OPTION);    

            JOptionPane.showMessageDialog(null, "Hello," + name + "!");
        }
             
     }
     