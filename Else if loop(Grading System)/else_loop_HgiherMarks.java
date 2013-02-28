
/**
 * Program Title.
 * Description of what program does ...
 * ...
 * 
 * @author Andrew Montgomery-Fox
 * @version 5/9/12
 */

import javax.swing.*;
import java.text.*;
import java.util.*;

public class else_loop_HgiherMarks 
{
    
    
     //Main method - required by all programs
   
    public static void main(String[] args)
    {
        int courseworkMark, examMark, totalMark, percentage, band;
        String input;
        
        do
        {
            //Ask for coursework mark
            input=JOptionPane.showInputDialog("Enter your coursework mark");
            courseworkMark=Integer.parseInt(input);
            
                //If the number is out of range then loop
                if ((courseworkMark<0) || (courseworkMark>60))
                {
                 //Show error
                 JOptionPane.showMessageDialog(null, "That number is out of range");
                }
                
           
        } while ((courseworkMark<0) || (courseworkMark>60));
        
        do 
        {
            //Ask for exam mark
            input=JOptionPane.showInputDialog("Enter your exam mark");
            examMark=Integer.parseInt(input);
            
                //If exam mark it out of range then loop
                if ((examMark<0) || (examMark>140))
                {
                    //Show Error
                    JOptionPane.showMessageDialog(null, "That number is out of range");
                }
        } while ((examMark<0) || (examMark>140));
        
        //Add marks together
        totalMark=courseworkMark+examMark;
        
        //Get percentage
        percentage=totalMark/2;
        
            if (percentage>=75)
            {
             System.out.println("You achived an A");
            }
            else if (percentage>=60 && percentage<75)
            {
             System.out.println("You have achieved a B");
            }
            else if (percentage>=50 && percentage<60)
            {
             System.out.println("You achieved a C");             
            }            
            else
            {
             System.out.println("You have failed");
            }
    
            System.out.println("Your percentage is "+percentage);
    
        }
}
