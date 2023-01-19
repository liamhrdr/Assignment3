import java.util.Scanner;   // for getting input using Scanner
import javax.swing.*;       // for JOptionPane
import java.io.*;           // for File I/O
import java.text.NumberFormat;  // for formatting currenct

/** ***************************************************
 *  Name:           Liam
 *  Class:          CS30S
 * 
 *  Assignment:     A3 Q1
 * 
 *  Description:    Program to create unique employees 
 * 
 *************************************************************/

public class Employee {
    // ** class variables **
    
    // ** fields **
    
    private int number;
    private int hours;
    private double wage;
    private final double OVERTIMEPAY = 1.5;
    private final int normalhours = 40;
    private static int nextID = 1000;
     
    // ** constructors **
    
    // ** no-arg/default contructor **
    public Employee(){
        this.number = getNextID();
        this.hours = 0;
        this.wage = 0;
    }// end default
    
     // ** full-arg constructor **
    public Employee(int hours, double wage){
        this.number = getNextID();
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
    
    public double getWage(){
        return this.wage;
    }// end get wage
    
    // ** setters **
    
    // setters allow the state to be changed
    public void setHours(int a){
        this.hours = a;
    }// end setHours
    
    public void setWage(double b){
        this.wage = b;
    }// end setWage
    
    
    // ** other **

    public int getNextID(){
        return nextID++;
    }
    
    public double calcPay(){
        if(hours < normalhours){
            return Math.round(((hours * wage) * 100)/100);      
        } else {
            return Math.round(((normalhours * wage) * 100)/100);
        }
    }
    
    public double otPay(){
        if(hours > normalhours){
            return Math.round((((hours - normalhours) * wage * OVERTIMEPAY) * 100)/100);
        } else {
            return 0;
        }
    }
    
    public double grossPay(){
        return calcPay() + otPay();
    }
    
    @Override
    public String toString(){
        String st = getNumber() + ":    " + getHours() + "h    $" + getWage() + "/h    $" + calcPay() + "    $" + otPay() + "    $" + grossPay();
        return st;
    }// end toString
    
} // end Employee
