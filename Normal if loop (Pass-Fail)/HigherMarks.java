
/**
 * Write a description of your program here.
 * 
 *Andrew Montgomery-Fox
 * 23/8/12
 */

import javax.swing.*;
import java.text.*;
import java.util.*;

class HigherMarks
{
    /**
     * Method that does the work
     * All your code should go here between the curly brackets
     */
    public void go()
    {
        //Declare variables
        int courseworkMark, examMark;
        double percentage, totalMark;
        String input;
       do{
        //Get marks
        input=JOptionPane.showInputDialog("Enter your coursework mark");
        courseworkMark=Integer.parseInt(input);
        
        if ((courseworkMark<0) || (courseworkMark>60))   
        {
            JOptionPane.showMessageDialog(null, "The mark should be between 0 and 60");
        }
    }while ((courseworkMark<0) || (courseworkMark>60));
   
    do{
        //Get marks
        input=JOptionPane.showInputDialog("Enter your exam mark");
        examMark=Integer.parseInt(input);
        
        if ((examMark<0) || (examMark>140))   
        {
            JOptionPane.showMessageDialog(null, "The mark should be between 0 and 140");
        }
    }while ((examMark<0) || (examMark>140));
    
    // Calculate total mark
    totalMark=courseworkMark+examMark;
   
   //Calculate Percentage
   percentage=totalMark/200*100;
   
   if (percentage<55) {
       System.out.println("You have failed");
    }
   
    if (percentage>=55) {
        System.out.println("You have passed");
    }
   do{
    if (percentage>100) {
        totalMark=courseworkMark+examMark;
        percentage=totalMark/200*100;
    }
}while (percentage>100);
    
    //Display results
    System.out.println("Your coursework mark is "+courseworkMark);
    System.out.println("Your exam mark is "+examMark);
    System.out.println("Your percentage is "+percentage);
   
   }
   
    
    /**
     *  Main method to set up your program
     *  Do not alter this code
     */
    public static void main(String[] args)
    {
        MyProg prog = new MyProg();
        prog.go();
    }
    
    
    /**
     * predefined method used to format doubles to a set number of decimal places
     * the double to be formatted and the number of decimal places it is formatted to
     * should both be passed in the function call
     */
    private String format(double number, int numberOfDecimalDigits)
    {
        String layout;
        
        NumberFormat numberFormat=NumberFormat.getInstance(Locale.UK);
        DecimalFormat decimalFormat =(DecimalFormat)numberFormat;
        layout="0.";
        
        for(int i=0;i<numberOfDecimalDigits;i++)
        {
            layout=layout+"0";
        }
        
        decimalFormat.applyPattern(layout);
        return(decimalFormat.format(number));
    }
}
