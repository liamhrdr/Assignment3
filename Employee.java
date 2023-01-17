import java.util.Scanner;   // for getting input using Scanner
import javax.swing.*;       // for JOptionPane
import java.io.*;           // for File I/O
import java.text.NumberFormat;  // for formatting currenct

/** ***************************************************
 *  Name:           Liam
 *  Class:          CS30S
 * 
 *  Assignment:     A3
 * 
 *  Description:    
 * 
 *************************************************************/

public class Employee {
    // ** class variables **
    
    // ** fields **
    
    private int number;
    private int hours;
    private int wage;
   
    
    // ** constructors **
    
    // ** no-arg/default contructor **
    public Employee(){
        this.number = 0;
        this.hours = 0;
        this.wage = 0;
    }// end default
    
     // ** full-arg constructor **
    public Employee(int number, int hours, int wage){
        this.number = number;
        this.hours = hours;
        this.wage = wage;
    }// end full arg
    
    // ** getters **

    // getters allow examination of the current state of the object
    public int getNumber(){
        return this.number;
    }// end get number
    
    public int getHours(){
        return this.hours;
    }// end get hours
    
    public int getWage(){
        return this.wage;
    }// end get wage
    
    
    
    // ** setters **
    
    // setters allow the state to be changed
    public void setHours(int a){
        this.hours = a;
    }// end setHours
    
    public void setWage(int b){
        this.wage = b;
    }// end setWage
    
    
    // ** other **

    
    @Override
    public String toString(){
        String st = getNumber() + ":  " + getHours() + "h " + getWage() + "/h ";
        return st;
    }// end toString
    
} // end Employee
